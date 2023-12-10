package org.app.bipium.models.catalogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalDeviceCatalogList extends AbstractCatalogList implements CatalogInitialized {
    public PersonalDeviceCatalogList(List<Catalog> catalogList) {
        super(catalogList);
    }

    @Override
    public void initial() {
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
        fieldsValues2.put("филиал", 3);
        fieldsValues2.put("ТП", 132);
        fieldsValues2.put("Линия/Фидер", 133);
        fieldsValues2.put("Населенный пункт", 8);
        fieldsValues2.put("Полный Адрес", 10);
        fieldsValues2.put("Имя потребителя", 13);
        fieldsValues2.put("Контактные данные", 14);
        fieldsValues2.put("Марка пу", 117);
        fieldsValues2.put("Номер ПУ", 26);
        fieldsValues2.put("Mac", 33);
        fieldsValues2.put("Широта", 45);
        fieldsValues2.put("Долгота", 46);

        Catalog catalog2 = new Catalog("ПИТЕР", 82, fieldsValues2);

        Map<String, Integer> fieldsValues3 = new HashMap<>();
        fieldsValues3.put("филиал", 5);
        fieldsValues3.put("ТП", 9);
        fieldsValues3.put("Линия/Фидер", 10);
        fieldsValues3.put("Населенный пункт", 20);
        fieldsValues3.put("Полный Адрес", 22);
        fieldsValues3.put("Имя потребителя", 27);
        fieldsValues3.put("Контактные данные", 28);
        fieldsValues3.put("Марка пу", 46);
        fieldsValues3.put("Номер ПУ", 47);
        fieldsValues3.put("Mac", 55);
        fieldsValues3.put("Широта", 61);
        fieldsValues3.put("Долгота", 62);

        Catalog catalog3 = new Catalog("Ленэнерго_ремонт_2021", 86, fieldsValues3);

        Map<String, Integer> fieldsValues4 = new HashMap<>();
        fieldsValues4.put("филиал", 6);
        fieldsValues4.put("ТП", 10);
        fieldsValues4.put("Линия/Фидер", 11);
        fieldsValues4.put("Населенный пункт", 21);
        fieldsValues4.put("Полный Адрес", 23);
        fieldsValues4.put("Имя потребителя", 28);
        fieldsValues4.put("Контактные данные", 29);
        fieldsValues4.put("Марка пу", 50);
        fieldsValues4.put("Номер ПУ", 51);
        fieldsValues4.put("Mac", 100);
        fieldsValues4.put("Широта", 108);
        fieldsValues4.put("Долгота", 109);

        Catalog catalog4 = new Catalog("Ленэнерго_ремонт_2022", 136, fieldsValues4);

        Map<String, Integer> fieldsValues5 = new HashMap<>();
        fieldsValues5.put("филиал", 6);
        fieldsValues5.put("ТП", 10);
        fieldsValues5.put("Линия/Фидер", 11);
        fieldsValues5.put("Населенный пункт", 21);
        fieldsValues5.put("Полный Адрес", 22);
        fieldsValues5.put("Имя потребителя", 28);
        fieldsValues5.put("Контактные данные", 29);
        fieldsValues5.put("Марка пу", 87);
        fieldsValues5.put("Номер ПУ", 88);
        fieldsValues5.put("Mac", 97);
        fieldsValues5.put("Широта", 104);
        fieldsValues5.put("Долгота", 105);
        Catalog catalog5 = new Catalog("ПИТЕР 2022 ЗАКРЫТО С ЛЭ", 152, fieldsValues5);

        Map<String, Integer> fieldsValues6 = new HashMap<>();
        fieldsValues6.put("филиал", 4);
        fieldsValues6.put("ТП", 9);
        fieldsValues6.put("Линия/Фидер", 8);
        fieldsValues6.put("Населенный пункт", 25);
        fieldsValues6.put("УЛИЦА", 26);
        fieldsValues6.put("№дома", 27);
        fieldsValues6.put("Имя потребителя", 28);
        fieldsValues6.put("Контактные данные", 79);
        fieldsValues6.put("Марка пу", 52);
        fieldsValues6.put("Номер ПУ", 40);
        fieldsValues6.put("Mac", 47);
        fieldsValues6.put("Координаты", 31);
        Catalog catalog6 = new Catalog("НЕ ТАРИФНЫЕ ИСТОЧНИКИ", 180, fieldsValues6);
    }
}
