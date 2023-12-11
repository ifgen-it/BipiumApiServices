package org.app.bipium.models.catalogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackboneDeviceCatalogList implements CatalogListFunctions {
    @Override
    public List<Catalog> initial() {
        Map<String, Integer> fieldsValues1 = new HashMap<>();
        fieldsValues1.put("филиал", 29);
        fieldsValues1.put("ТП", 11);
        fieldsValues1.put("Опора", 9);
        fieldsValues1.put("Линия/Фидер", 10);
        fieldsValues1.put("Полный Адрес", 2);
        fieldsValues1.put("Номер УСПД", 3);
        fieldsValues1.put("Mac", 7);
        fieldsValues1.put("IMEI", 26);
        fieldsValues1.put("Место установки", 8);
        fieldsValues1.put("Примечание", 19);
        fieldsValues1.put("№канала", 22);
        fieldsValues1.put("PanID", 23);
        fieldsValues1.put("Широта", 12);
        fieldsValues1.put("Долгота", 13);
        fieldsValues1.put("Пароль", 27);
        fieldsValues1.put("IP", 15);

        Catalog catalog1 = new Catalog("Опорная сеть СПБ", 121, fieldsValues1);

        Map<String, Integer> fieldsValues2 = new HashMap<>();
        fieldsValues2.put("филиал", 29);
        fieldsValues2.put("ТП", 13);
        fieldsValues2.put("Опора", 11);
        fieldsValues2.put("Линия/Фидер", 12);
        fieldsValues2.put("Полный Адрес", 4);
        fieldsValues2.put("Номер УСПД", 5);
        fieldsValues2.put("Mac", 9);
        fieldsValues2.put("IMEI", 22);
        fieldsValues2.put("Место установки", 10);
        fieldsValues2.put("Примечание", 21);
        fieldsValues2.put("№канала", 23);
        fieldsValues2.put("PanID", 24);
        fieldsValues2.put("Широта", 14);
        fieldsValues2.put("Долгота", 15);
        fieldsValues2.put("Пароль", 27);
        fieldsValues2.put("IP", 17);

        Catalog catalog2 = new Catalog("ОПОРНАЯ СЕТЬ 2022", 135, fieldsValues2);

        List<Catalog> catalogs = new ArrayList<>();
        catalogs.add(catalog1);
        catalogs.add(catalog2);

        return catalogs;
    }
}
