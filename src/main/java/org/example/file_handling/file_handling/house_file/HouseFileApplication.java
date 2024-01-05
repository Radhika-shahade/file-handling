package org.example.file_handling.file_handling.house_file;

import org.example.file_handling.file_handling.house_file.metrics.BedroomAndNeighbourhoodMetrics;
import org.example.file_handling.file_handling.house_file.metrics.BedroomMetrics;
import org.example.file_handling.file_handling.house_file.metrics.NeighbourhoodMetrics;
import org.example.file_handling.file_handling.house_file.model.BedroomsCount;
import org.example.file_handling.file_handling.house_file.processor.BedroomProcessor;
import org.example.file_handling.file_handling.house_file.reader.FileReader;
import org.example.file_handling.file_handling.house_file.reader.file.csv.CsvFileReader;
import org.example.file_handling.file_handling.house_file.report.IFileWriter;
import org.example.file_handling.file_handling.house_file.report.csv.FileWriter;
import org.example.file_handling.file_handling.house_file.report.json.JsonFileWriter;
import org.example.file_handling.file_handling.util.PdfConverter;
import org.example.file_handling.file_handling.util.RemoveDuplicateFromCsv;

import java.util.List;

public class HouseFileApplication {
    public static void main(String[] args) {
        FileReader csvFileReader = new CsvFileReader("src/main/resources/housing_price_dataset (1).csv");
        BedroomProcessor bp = new BedroomProcessor();
        IFileWriter csvFileWriter = new FileWriter();
        IFileWriter jsonFileWriter = new JsonFileWriter();
        List data = csvFileReader.read();
//        csvFileWriter.write(bp.getHouses(data, 2), "src/main/resources/bhk/house2bhk.csv");
//        csvFileWriter.write(bp.getHouses(data, 3), "src/main/resources/bhk/house3bhk.csv");
//        csvFileWriter.write(bp.getHouses(data, 4), "src/main/resources/bhk/house4bhk.csv");
//        csvFileWriter.write(bp.getHouses(data, 5), "src/main/resources/bhk/house5bhk.csv");
//        jsonFileWriter.write(bp.getHouses(data, 2), "src/main/resources/bhk/house2bhk.json");
//        jsonFileWriter.write(bp.getHouses(data, 3), "src/main/resources/bhk/house3bhk.json");
//        jsonFileWriter.write(bp.getHouses(data, 4), "src/main/resources/bhk/house4bhk.json");
//        jsonFileWriter.write(bp.getHouses(data, 5), "src/main/resources/bhk/house5bhk.json");

//       To get the count of bedroom according to bhk and neighbourhood areas
//        BedroomMetrics bedroomMetrics= new BedroomMetrics();
//        bedroomMetrics.collect(data);
//        NeighbourhoodMetrics neighbourhoodMetrics = new NeighbourhoodMetrics();
//        neighbourhoodMetrics.collect(data);

//        write new file
        BedroomAndNeighbourhoodMetrics newJson = new BedroomAndNeighbourhoodMetrics();
        newJson .collect(data);


    }
}
