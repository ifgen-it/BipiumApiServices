package org.app.telegram.services;

import org.app.bipium.config.Credentials;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

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
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            switch (messageText) {
                case "/start":
                    startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    break;
                default:
                    sendMessage(chatId, "Команда не поддерживается");
            }
        }
    }

    private void startCommandReceived(long chatId, String name) {
        String startAnswer = "Бот для поиска информации об устройстве ЛенЭнерго\n" +
                "Для получения информации об устройстве введите номер устройства в формате\n" +
                "успд/<номер успд> для успд и пу/<номер пу> для счётчика";
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
