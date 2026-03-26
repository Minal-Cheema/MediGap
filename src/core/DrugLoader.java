package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DrugLoader {

    public static void load(String filePath, DrugGraph graph) {
        String line;
        boolean isFirstLine = true;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while ((line = reader.readLine()) != null) {

                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String genericName = parts[0].trim();
                    String brandName = parts[1].trim();
                    String category = parts[2].trim();

                    Drug drug = new Drug(genericName, brandName, category);
                    graph.addDrug(drug);
                }
            }

            reader.close();
            System.out.println("Drugs loaded successfully from: " + filePath);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
