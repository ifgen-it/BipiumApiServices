package org.app.bipium.models.bipiumTabs;

import java.util.List;

public class BackboneBipiumTabListServices implements BipiumTabListAppendable{
    private List<BackboneBipiumTab> backboneBipiumTabList;

    public BackboneBipiumTabListServices(List<BackboneBipiumTab> backboneBipiumTabList) {
        this.backboneBipiumTabList = backboneBipiumTabList;
    }

    public List<BackboneBipiumTab> getBackboneTabs() {
        return backboneBipiumTabList;
    }

    @Override
    public void addTab(BipiumTab tab) {
        backboneBipiumTabList.add((BackboneBipiumTab) tab);
    }
}
