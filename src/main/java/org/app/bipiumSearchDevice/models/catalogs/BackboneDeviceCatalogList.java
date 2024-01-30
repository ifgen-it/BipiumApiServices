package org.app.bipiumSearchDevice.models.catalogs;

import org.app.bipiumSearchDevice.models.devices.AbstractDevice;
import org.app.bipiumSearchDevice.models.devices.BackboneDevice;

import java.util.*;

public class BackboneDeviceCatalogList implements CatalogListInterface {


    public List<Catalog> initial() {
        //BackboneDeviceCatalogList backboneDeviceCatalogList = new BackboneDeviceCatalogList();
        Map<String, String> fieldsValues1 = new LinkedHashMap<>();
        fieldsValues1.put("29", "филиал");
        fieldsValues1.put("11", "ТП");
        fieldsValues1.put("9", "Опора");
        fieldsValues1.put("10", "Линия/Фидер");
        fieldsValues1.put("19", "Примечание");
        fieldsValues1.put("2", "Полный Адрес");
        fieldsValues1.put("3", "Номер УСПД");
        fieldsValues1.put("7", "Mac");
        fieldsValues1.put("26", "IMEI");
        fieldsValues1.put("8", "Место установки");
        fieldsValues1.put("22", "№канала");
        fieldsValues1.put("23", "PanID");
        fieldsValues1.put("12", "Широта");
        fieldsValues1.put("13", "Долгота");
        fieldsValues1.put("27", "Пароль");
        fieldsValues1.put("15", "IP");

        Catalog catalog1 = new Catalog("Опорная сеть СПБ", 121, fieldsValues1);

        Map<String, String> fieldsValues2 = new LinkedHashMap<>();
        fieldsValues2.put( "29", "филиал");
        fieldsValues2.put("13", "ТП");
        fieldsValues2.put("11", "Опора");
        fieldsValues2.put("12", "Линия/Фидер");
        fieldsValues2.put("21", "Примечание");
        fieldsValues2.put("4", "Полный Адрес");
        fieldsValues2.put("5", "Номер УСПД");
        fieldsValues2.put("9", "Mac");
        fieldsValues2.put("22", "IMEI");
        fieldsValues2.put("10", "Место установки");;
        fieldsValues2.put("23", "№канала");
        fieldsValues2.put("24", "PanID");
        fieldsValues2.put("14", "Широта");
        fieldsValues2.put("15", "Долгота");
        fieldsValues2.put("27", "Пароль");
        fieldsValues2.put("17", "IP");

        Catalog catalog2 = new Catalog("ОПОРНАЯ СЕТЬ 2022", 135, fieldsValues2);

        List<Catalog> catalogs = new ArrayList<>();
        catalogs.add(catalog1);
        catalogs.add(catalog2);

        return catalogs;
    }

    @Override
    public AbstractDevice createDevice() {
        return new BackboneDevice();
    }
}
