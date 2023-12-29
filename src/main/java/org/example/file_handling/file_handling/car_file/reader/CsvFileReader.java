package org.example.file_handling.file_handling.car_file.reader;

import org.example.file_handling.file_handling.car_file.DirectoryList;
import org.example.file_handling.file_handling.car_file.model.Car;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader implements FileReader {
    String path;
    DirectoryList fileList = new DirectoryList();

    public CsvFileReader(String inputFilePath) {
        this.path = inputFilePath;
    }

    @Override
    public List read() {
        try {
            List<Car> list = new ArrayList<>();
            File listOfFile[] = fileList.listAllFiles(path);
            String newPath = " ";
            for (File newFile : listOfFile) {
                BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(newFile.getPath()));
                System.out.println(newFile.getPath());
                String line = bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null) {
                    Car car = buildCar(line);
                    list.add(car);
                }
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //    String model;
//    String year;
//    double price;
//    String transmission;
//    long mileage;
//    String fuelType;
//    int tax;
//    double mpg;
//    double engineSize;
    private Car buildCar(String line) {
        String[] tokens = line.split(",");
        return Car.builder().model(tokens[0])
                .year(tokens[1])
                .price(Double.valueOf(tokens[2]))
                .transmission(tokens[3])
                .mileage(Long.valueOf(tokens[4]))
                .fuelType(tokens[5])
                .tax(Integer.valueOf(tokens[6]))
                .mpg(Double.valueOf(tokens[7]))
                .engineSize(Double.valueOf(tokens[8]))
                .build();

    }

}
