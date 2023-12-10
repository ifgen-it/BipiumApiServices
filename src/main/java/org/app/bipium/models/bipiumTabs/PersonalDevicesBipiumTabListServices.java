package org.app.bipium.models.bipiumTabs;

import java.util.List;

public class PersonalDevicesBipiumTabListServices implements BipiumTabListAppendable{
    private List<PersonalDeviceBipiumTab> personalDeviceBipiumTabList;

    public PersonalDevicesBipiumTabListServices(List<PersonalDeviceBipiumTab> personalDeviceBipiumTabList) {
        this.personalDeviceBipiumTabList = personalDeviceBipiumTabList;
    }

    public List<PersonalDeviceBipiumTab> getPersonalDeviceBipiumTabList() {
        return personalDeviceBipiumTabList;
    }


    @Override
    public void addTab(BipiumTab tab) {
        personalDeviceBipiumTabList.add((PersonalDeviceBipiumTab) tab);
    }
}
