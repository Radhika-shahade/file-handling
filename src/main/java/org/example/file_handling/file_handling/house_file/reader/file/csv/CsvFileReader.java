package org.example.file_handling.file_handling.house_file.reader.file.csv;

import org.example.file_handling.file_handling.house_file.model.House;
import org.example.file_handling.file_handling.house_file.reader.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader implements FileReader {
    String path;

    public CsvFileReader(String inputFilePath) {
        this.path = inputFilePath;
    }

    @Override
    public List read() {
        File file = new File(path);
        try{
            BufferedReader rd= new BufferedReader(new java.io.FileReader(file));
            String line= rd.readLine();
            List<House> houses= new ArrayList<>();
            while ((line= rd.readLine())!=null)
            {
              House house= buildHouse(line);
              houses.add(house);
            }
            return houses;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private House buildHouse(String line) {
        String[]tokens = line.split(",");
        return House.builder().squareFeet(Integer.valueOf(tokens[0]))
                .bedrooms(Integer.valueOf(tokens[1]))
                .bathrooms(Integer.valueOf(tokens[2]))
                .neighbourhood(tokens[3])
                .year(Integer.valueOf(tokens[4]))
                .price(Double.valueOf(tokens[5]))
                .build();

    }
}
