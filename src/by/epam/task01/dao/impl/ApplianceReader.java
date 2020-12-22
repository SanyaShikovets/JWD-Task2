package by.epam.task01.dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

    public List<String> takeAll(){
        List<String> applianceData = new ArrayList<>();

        File file = new File("C:\\3_kurs\\EPAM\\Task_02\\src\\resources\\appliances_db.txt");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(fileReader);

        try {
            String line = reader.readLine();
            while (line != null) {
                applianceData.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return applianceData;
    }

}
