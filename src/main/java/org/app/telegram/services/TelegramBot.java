package org.app.telegram.services;

import org.app.bipium.config.Credentials;
import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.services.BipiumApiServicesBuilder;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotToken() {
        return Credentials.BOTKEY;
    }

    @Override
    public String getBotUsername() {
        return Credentials.BOTNAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText().toLowerCase().strip();
            long chatId = update.getMessage().getChatId();

            Pattern macPattern = Pattern.compile("пу-[0-9A-Fa-f]{16}");
            Pattern numberPattern = Pattern.compile("успд-[0-9A-Fa-f]{16}");

            boolean macAddressMatch = macPattern.matcher(messageText).matches();
            boolean numberMatch = numberPattern.matcher(messageText).matches();

            switch (messageText) {
                case "/start":
                    startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    break;
                default:
                    if (messageText.contains("-")) {
                        String[] deviceValues = messageText.split("-");
                        String deviceType = deviceValues[0];
                        String numberValue = deviceValues[1];

                        if (deviceType.equals("пу") || deviceType.equals("успд")) {
                            if (numberValue.length() == 8 || numberValue.length() == 12 || numberValue.length() == 13 || numberValue.length() == 11
                                    || numberValue.length() == 6 || numberValue.length() == 5 || macAddressMatch || numberMatch) {
                                sendBipiumResult(chatId, deviceType, numberValue);
                            } else {
                                sendMessage(chatId, "Команда не поддерживается");
                            }
                        } else if (deviceValues.length == 0 || numberValue.length() == 0) {
                            sendMessage(chatId, "Команда не поддерживается");
                        }

                    } else {
                        sendMessage(chatId, "Команда не поддерживается");
                    }

            }

        }
    }

    private void sendBipiumResult(long chatId, String deviceType, String deviceValue) {
        Map<String, String> botAnswerMap = null;
        StringBuilder messageAnswer = new StringBuilder();


        BipiumApiServicesBuilder bipiumBuilder = new BipiumApiServicesBuilder(deviceType);
        AbstractDevice deviceInformation = bipiumBuilder.searchDevice(deviceValue);

        botAnswerMap = deviceInformation.getValues();

        if (botAnswerMap != null) {
            List<String> keys = new ArrayList<String>(botAnswerMap.keySet());
            for(int i = 0; i < keys.size(); i++) {
                String key = keys.get(i);
                String value = botAnswerMap.get(key);

                messageAnswer.append(key).append(" : ").append(value).append("\n").toString();
            }
        } else {
            messageAnswer = new StringBuilder("данные не найдены\n");
        }
        sendMessage(chatId, messageAnswer.toString());
    }

    private void startCommandReceived(long chatId, String name) {
        String startAnswer = "Проект ЛенЭнерго, поиск информации об устройстве\n" +
                "   Для получения информации об устройстве введите номер устройства в формате\n" +
                "успд-<номер_успд> для успд или пу-<номер_пу> для счётчика\n" +
                "";
        sendMessage(chatId, startAnswer);
    }

    private void sendMessage(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);

        try {
            execute(message);
        } catch (TelegramApiException exception) {
        }
    }
}
