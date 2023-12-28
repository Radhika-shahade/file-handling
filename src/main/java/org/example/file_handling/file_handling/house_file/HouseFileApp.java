package org.example.file_handling.file_handling.house_file;

import org.example.file_handling.file_handling.house_file.processor.BedroomProcessor;
import org.example.file_handling.file_handling.house_file.reader.FileReader;
import org.example.file_handling.file_handling.house_file.reader.file.csv.CsvFileReader;
import org.example.file_handling.file_handling.house_file.report.IFileWriter;
import org.example.file_handling.file_handling.house_file.report.csv.FileWriter;
import org.example.file_handling.file_handling.house_file.report.json.JsonFileWriter;

import java.util.List;

public class HouseFileApp {
    public static void main(String[] args) {
        FileReader fw = new CsvFileReader("src/main/resources/housing_price_dataset (1).csv");
        BedroomProcessor bd = new BedroomProcessor();
        List data = fw.read();
        data.forEach(d -> System.out.println(d.toString()));

        IFileWriter csvWriter = new FileWriter();
        IFileWriter jsonWriter = new JsonFileWriter();
        jsonWriter.write(bd.getHouses(data,2),"src/main/resources/bhk/house2bhk.json");
        csvWriter.write(bd.getHouses(data, 3), "src/main/resources/bhk/house3bhk.json");
        csvWriter.write(bd.getHouses(data, 4), "src/main/resources/bhk/house4bhk.json");
        csvWriter.write(bd.getHouses(data, 5), "src/main/resources/bhk/house5bhk.json");

        csvWriter.write(bd.getHouses(data, 2), "src/main/resources/bhk/house2bhk.csv");
        csvWriter.write(bd.getHouses(data, 3), "src/main/resources/bhk/house3bhk.csv");
        csvWriter.write(bd.getHouses(data, 4), "src/main/resources/bhk/house4bhk.csv");
        csvWriter.write(bd.getHouses(data, 5), "src/main/resources/bhk/house5bhk.csv");

    }
}
