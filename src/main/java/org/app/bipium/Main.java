package org.app.bipium;

import org.app.bipium.models.catalogs.Catalog;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fieldsValues1 = new HashMap<>();
        fieldsValues1.put("филиал", 6);
        fieldsValues1.put("ТП", 10);
        fieldsValues1.put("Линия/Фидер", 11);
        fieldsValues1.put("Населенный пункт", 21);
        fieldsValues1.put("Полный Адрес", 23);
        fieldsValues1.put("Имя потребителя", 28);
        fieldsValues1.put("Контактные данные", 31);
        fieldsValues1.put("Марка пу", 92);
        fieldsValues1.put("Номер ПУ", 93);
        fieldsValues1.put("Mac", 102);
        fieldsValues1.put("Широта", 109);
        fieldsValues1.put("Долгота", 110);
        fieldsValues1.put("Пароль", 173);
        fieldsValues1.put("Маршрут", 108);

        Catalog catalog1 = new Catalog("ПИТЕР 2022", 168, fieldsValues1);

        Map<String, Integer> fieldsValues2 = new HashMap<>();
        fieldsValues1.put("филиал", 3);
        fieldsValues1.put("ТП", 132);
        fieldsValues1.put("Линия/Фидер", 133);
        fieldsValues1.put("Населенный пункт", 8);
        fieldsValues1.put("Полный Адрес", 10);
        fieldsValues1.put("Имя потребителя", 13);
        fieldsValues1.put("Контактные данные", 14);
        fieldsValues1.put("Марка пу", 117);
        fieldsValues1.put("Номер ПУ", 26);
        fieldsValues1.put("Mac", 33);
        fieldsValues1.put("Широта", 45);
        fieldsValues1.put("Долгота", 46);

        Catalog catalog2 = new Catalog("ПИТЕР", 82, fieldsValues2);

    }


}
