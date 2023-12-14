package org.app.bipium.models.catalogs;

import org.app.bipium.models.devices.AbstractDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalDeviceCatalogList implements CatalogListInterface {

    public List<Catalog> initial() {
        Map<String, String> fieldsValues1 = new HashMap<>();
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

        Map<String, String> fieldsValues2 = new HashMap<>();
        fieldsValues2.put("3", "филиал");
        fieldsValues2.put("132", "ТП");
        fieldsValues2.put("Линия/Фидер", "133");
        fieldsValues2.put("Населенный пункт", "8");
        fieldsValues2.put("Полный Адрес", "10");
        fieldsValues2.put("Имя потребителя", "13");
        fieldsValues2.put("Контактные данные", "14");
        fieldsValues2.put("Марка пу", "117");
        fieldsValues2.put("Номер ПУ", "26");
        fieldsValues2.put("Mac", "33");
        fieldsValues2.put("Широта", "45");
        fieldsValues2.put("Долгота", "46");
        fieldsValues2.put("№Sim", "43");

        Catalog catalog2 = new Catalog("ПИТЕР", 82, fieldsValues2);

        Map<String, String> fieldsValues3 = new HashMap<>();
        fieldsValues3.put("филиал", "5");
        fieldsValues3.put("ТП", "9");
        fieldsValues3.put("Линия/Фидер", "10");
        fieldsValues3.put("Населенный пункт", "20");
        fieldsValues3.put("Полный Адрес", "22");
        fieldsValues3.put("Имя потребителя", "27");
        fieldsValues3.put("Контактные данные", "28");
        fieldsValues3.put("Марка пу", "46");
        fieldsValues3.put("Номер ПУ", "47");
        fieldsValues3.put("Mac", "55");
        fieldsValues3.put("Широта", "61");
        fieldsValues3.put("Долгота", "62");
        fieldsValues3.put("№Sim", "59");
        Catalog catalog3 = new Catalog("Ленэнерго_ремонт_2021", 86, fieldsValues3);

        Map<String, String> fieldsValues4 = new HashMap<>();
        fieldsValues4.put("филиал", "6");
        fieldsValues4.put("ТП", "10");
        fieldsValues4.put("Линия/Фидер", "11");
        fieldsValues4.put("Населенный пункт", "21");
        fieldsValues4.put("Полный Адрес", "23");
        fieldsValues4.put("Имя потребителя", "28");
        fieldsValues4.put("Контактные данные", "29");
        fieldsValues4.put("Марка пу", "50");
        fieldsValues4.put("Номер ПУ", "51");
        fieldsValues4.put("Mac", "100");
        fieldsValues4.put("Широта", "108");
        fieldsValues4.put("Долгота", "109");
        fieldsValues4.put("№Sim", "106");
        Catalog catalog4 = new Catalog("Ленэнерго_ремонт_2022", 136, fieldsValues4);

        Map<String, String> fieldsValues5 = new HashMap<>();
        fieldsValues5.put("филиал", "6");
        fieldsValues5.put("ТП", "10");
        fieldsValues5.put("Линия/Фидер", "11");
        fieldsValues5.put("Населенный пункт", "21");
        fieldsValues5.put("Полный Адрес", "22");
        fieldsValues5.put("Имя потребителя", "28");
        fieldsValues5.put("Контактные данные", "29");
        fieldsValues5.put("Марка пу", "87");
        fieldsValues5.put("Номер ПУ", "88");
        fieldsValues5.put("Mac", "97");
        fieldsValues5.put("Широта", "104");
        fieldsValues5.put("Долгота", "105");
        fieldsValues5.put("№Sim", "102");
        Catalog catalog5 = new Catalog("ПИТЕР 2022 ЗАКРЫТО С ЛЭ", 152, fieldsValues5);

        Map<String, String> fieldsValues6 = new HashMap<>();
        fieldsValues6.put("филиал", "4");
        fieldsValues6.put("ТП", "9");
        fieldsValues6.put("Линия/Фидер", "8");
        fieldsValues6.put("Населенный пункт", "25");
        fieldsValues6.put("УЛИЦА", "26");
        fieldsValues6.put("№дома", "27");
        fieldsValues6.put("Имя потребителя", "28");
        fieldsValues6.put("Контактные данные", "79");
        fieldsValues6.put("Марка пу", "52");
        fieldsValues6.put("Номер ПУ", "40");
        fieldsValues6.put("Mac", "47");
        fieldsValues6.put("Координаты", "31");
        fieldsValues6.put("№Sim", "54");
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
