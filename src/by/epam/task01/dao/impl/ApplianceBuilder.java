package by.epam.task01.dao.impl;

import by.epam.task01.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ApplianceBuilder {

    public List<Appliance> build(List<String> filterApplianceData){
        List<Appliance> appliances = new ArrayList<>();
        String[] buffer;
        int index = 0;
        for(String string : filterApplianceData){
            buffer = string.split(" ");
            Appliance appliance = null;
            switch (buffer[index++]) {
                case ("Oven"):
                    appliance = new Oven(Integer.getInteger(buffer[index+=2]), Double.parseDouble(buffer[index+=2]),
                            Double.parseDouble(buffer[index+=2]), Double.parseDouble(buffer[index+=2]),
                            Double.parseDouble(buffer[index+=2]), Double.parseDouble(buffer[index+=2]));
                    break;
                case ("Laptop"):
                    appliance = new Laptop(Double.parseDouble(buffer[index+=2]), buffer[index+=2],
                            Integer.getInteger(buffer[index+=2]), Integer.getInteger(buffer[index+=2]),
                            Double.parseDouble(buffer[index+=2]), Integer.getInteger(buffer[index+=2]));
                    break;
                case ("Refrigerator"):
                    appliance = new Refrigerator(Integer.getInteger(buffer[index+=2]),Double.parseDouble(buffer[index+=2]),
                            Integer.getInteger(buffer[index+=2]), Double.parseDouble(buffer[index+=2]),
                            Double.parseDouble(buffer[index+=2]), Double.parseDouble(buffer[index+=2]));
                    break;
                case ("VacuumCleaner"):
                    appliance = new VacuumCleaner(Integer.getInteger(buffer[index+=2]), buffer[index+=2].charAt(0),
                            buffer[index+=2], buffer[index+=2],
                            Integer.getInteger(buffer[index+=2]), Integer.getInteger(buffer[index+=2]));
                    break;
                case ("TabletPC"):
                    appliance = new TabletPC(Integer.getInteger(buffer[index+=2]), Integer.getInteger(buffer[index+=2]),
                            Integer.getInteger(buffer[index+=2]), Integer.getInteger(buffer[index+=2]), buffer[index+=2]);
                    break;
                case ("Speakers"):
                    appliance = new Speakers(Integer.getInteger(buffer[index+=2]), Integer.getInteger(buffer[index+=2]),
                            buffer[index+=2], Integer.getInteger(buffer[index+=2]));
                    break;
            }

            index = 0;
            appliances.add(appliance);
        }
        return appliances;
    }
}
