package org.example.file_handling.file_handling.car_file;

import org.example.file_handling.file_handling.car_file.reader.CsvFileReader;
import org.example.file_handling.file_handling.car_file.reader.FileReader;
import org.example.file_handling.file_handling.car_file.report.IFileWriter;
import org.example.file_handling.file_handling.car_file.report.csv.CsvFileWriter;
import org.example.file_handling.file_handling.car_file.report.json.JsonFileWriter;

import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        FileReader fileReader = new CsvFileReader("C:\\Users\\Radhika shahade\\Downloads\\car");
        List data =fileReader.read();
        CsvFileWriter fileWriter =  new CsvFileWriter();
//        fileWriter.write(data,"src/main/resources/car_file/car.csv");
        IFileWriter jsonFileWriter = new JsonFileWriter();
        jsonFileWriter.write(data,"src/main/resources/car_file/car.json");
    }
}
