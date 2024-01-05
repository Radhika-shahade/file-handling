package org.example.file_handling.file_handling.util;

import lombok.extern.slf4j.Slf4j;
import org.example.file_handling.file_handling.house_file.model.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class RemoveDuplicateFromCsv {
    public List<House> readHousesFromFile(String filePath) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(filePath));
            String line = rd.readLine();
            List<House> houses = new ArrayList<>();
            while ((line = rd.readLine()) != null) {
                House house = buildHouse(line);
                houses.add(house);

            }
            Set<House> uniqueHouses = new HashSet<>();
            Map<House, Integer> houseCounts = new HashMap<>();

            for (House house : houses) {
                if (!uniqueHouses.add(house)) {
                    // Duplicate found, increment count
                    houseCounts.put(house, houseCounts.getOrDefault(house, 0) + 1);
                }
            }
            // Print counts for duplicate House objects
            for (Map.Entry<House, Integer> entry : houseCounts.entrySet()) {
                System.out.println("House: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private House buildHouse(String line) {
        String[] tokens = line.split(",");
        return House.builder()
                .squareFeet(Integer.valueOf(tokens[0]))
                .bedrooms(Integer.valueOf(tokens[1]))
                .bathrooms(Integer.valueOf(tokens[2]))
                .neighbourhood(tokens[3])
                .year(Integer.valueOf(tokens[4]))
                .price(Double.valueOf(tokens[5]))
                .build();
    }
}
