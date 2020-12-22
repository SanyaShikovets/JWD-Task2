package by.epam.task01.dao.impl;

import by.epam.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class ApplianceFilter {

    private List<String> applianceData;

    public ApplianceFilter(List<String> applianceData){
        this.applianceData = new ArrayList<>();
        this.applianceData = applianceData;
    }

    public List<String> getApplianceData() {
        return applianceData;
    }

    public List<String> filter(Criteria criteria){
        List<String> filterApplianceData = new ArrayList<>();

        for(String string : applianceData) {
            filterApplianceData.add(string.replaceAll(":", " ").replaceAll("=", " ").replaceAll(",", " "));
        }

        return filterApplianceData;
    }
}
