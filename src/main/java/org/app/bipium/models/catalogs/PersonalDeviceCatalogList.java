package org.app.bipium.models.catalogs;

import org.app.bipium.models.devices.AbstractDevice;

import java.util.*;

public class PersonalDeviceCatalogList implements CatalogListInterface {
    public List<Catalog> initial() {
        Map<String, String> fieldsValues1 = new LinkedHashMap<>();
        fieldsValues1.put("6", "филиал");
        fieldsValues1.put("10", "ТП");
        fieldsValues1.put("11", "Линия/Фидер");
        fieldsValues1.put("21", "Населенный пункт");
        fieldsValues1.put("23", "Полный Адрес");
        fieldsValues1.put("28", "Имя потребителя");
        fieldsValues1.put("31", "Контактные данные");
        fieldsValues1.put("92", "Марка пу");
        fieldsValues1.put("93", "Номер ПУ");
        fieldsValues1.put("102", "Mac");
        fieldsValues1.put("109", "Широта");
        fieldsValues1.put("110", "Долгота");
        fieldsValues1.put("173", "Пароль");
        fieldsValues1.put("108", "Маршрут");
        fieldsValues1.put("107", "№Sim");

        Catalog catalog1 = new Catalog("ПИТЕР 2022", 122, fieldsValues1);

        Map<String, String> fieldsValues2 = new LinkedHashMap<>();
        fieldsValues2.put("3", "филиал");
        fieldsValues2.put("132", "ТП");
        fieldsValues2.put("133", "Линия/Фидер");
        fieldsValues2.put("8", "Населенный пункт");
        fieldsValues2.put("10", "Полный Адрес");
        fieldsValues2.put("13", "Имя потребителя");
        fieldsValues2.put("14", "Контактные данные");
        fieldsValues2.put("117", "Марка пу");
        fieldsValues2.put("32", "Номер ПУ");
        fieldsValues2.put("33", "Mac");
        fieldsValues2.put("45", "Широта");
        fieldsValues2.put("46", "Долгота");
        fieldsValues2.put("43", "№Sim");

        Catalog catalog2 = new Catalog("ПИТЕР", 82, fieldsValues2);

        Map<String, String> fieldsValues3 = new LinkedHashMap<>();
        fieldsValues3.put("5", "филиал");
        fieldsValues3.put("9", "ТП");
        fieldsValues3.put("10", "Линия/Фидер");
        fieldsValues3.put("20", "Населенный пункт");
        fieldsValues3.put("22", "Полный Адрес");
        fieldsValues3.put("27", "Имя потребителя");
        fieldsValues3.put("28", "Контактные данные");
        fieldsValues3.put("46", "Марка пу");
        fieldsValues3.put("47", "Номер ПУ");
        fieldsValues3.put("55", "Mac");
        fieldsValues3.put("61", "Широта");
        fieldsValues3.put("62", "Долгота");
        fieldsValues3.put("59", "№Sim");
        Catalog catalog3 = new Catalog("Ленэнерго_ремонт_2021", 86, fieldsValues3);

        Map<String, String> fieldsValues4 = new LinkedHashMap<>();
        fieldsValues4.put("6", "филиал");
        fieldsValues4.put("10", "ТП");
        fieldsValues4.put("11", "Линия/Фидер");
        fieldsValues4.put("21", "Населенный пункт");
        fieldsValues4.put("23", "Полный Адрес");
        fieldsValues4.put("28", "Имя потребителя");
        fieldsValues4.put("29", "Контактные данные");
        fieldsValues4.put("50", "Марка пу");
        fieldsValues4.put("51", "Номер ПУ");
        fieldsValues4.put("100", "Mac");
        fieldsValues4.put("108", "Широта");
        fieldsValues4.put("109", "Долгота");
        fieldsValues4.put("106", "№Sim");
        Catalog catalog4 = new Catalog("Ленэнерго_ремонт_2022", 136, fieldsValues4);

        Map<String, String> fieldsValues5 = new LinkedHashMap<>();
        fieldsValues5.put("6", "филиал");
        fieldsValues5.put("10", "ТП");
        fieldsValues5.put("11", "Линия/Фидер");
        fieldsValues5.put("21", "Населенный пункт");
        fieldsValues5.put("22", "Полный Адрес");
        fieldsValues5.put("28", "Имя потребителя");
        fieldsValues5.put("29", "Контактные данные");
        fieldsValues5.put("87", "Марка пу");
        fieldsValues5.put("88", "Номер ПУ");
        fieldsValues5.put("97", "Mac");
        fieldsValues5.put("104", "Широта");
        fieldsValues5.put("105", "Долгота");
        fieldsValues5.put("102", "№Sim");
        Catalog catalog5 = new Catalog("ПИТЕР 2022 ЗАКРЫТО С ЛЭ", 152, fieldsValues5);

        Map<String, String> fieldsValues6 = new LinkedHashMap<>();
        fieldsValues6.put("4", "филиал");
        fieldsValues6.put("9", "ТП");
        fieldsValues6.put("8", "Линия/Фидер");
        fieldsValues6.put("25", "Населенный пункт");
        fieldsValues6.put("26", "УЛИЦА");
        fieldsValues6.put("27", "№дома");
        fieldsValues6.put("28", "Имя потребителя");
        fieldsValues6.put("79", "Контактные данные");
        fieldsValues6.put("52", "Марка пу");
        fieldsValues6.put("40", "Номер ПУ");
        fieldsValues6.put("47", "Mac");
        fieldsValues6.put("31", "Координаты");
        fieldsValues6.put("54", "№Sim");
        Catalog catalog6 = new Catalog("НЕ ТАРИФНЫЕ ИСТОЧНИКИ", 180, fieldsValues6);

        List<Catalog> catalogs = new ArrayList<>();
        catalogs.add(catalog1);
        catalogs.add(catalog2);
        catalogs.add(catalog3);
        catalogs.add(catalog4);
        catalogs.add(catalog5);
        catalogs.add(catalog6);

        return catalogs;
    }
}
