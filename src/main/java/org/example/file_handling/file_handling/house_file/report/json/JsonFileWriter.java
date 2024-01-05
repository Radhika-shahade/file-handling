package org.example.file_handling.file_handling.house_file.report.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.file_handling.file_handling.house_file.model.BedroomsCount;
import org.example.file_handling.file_handling.house_file.report.IFileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Instant;
import java.util.List;


public class JsonFileWriter implements IFileWriter {
    ObjectMapper objectMapper = new ObjectMapper();
    public static void write(BedroomsCount metricResult) {
        try{

            ObjectMapper om = new ObjectMapper();
            String s = om.writeValueAsString(metricResult);
            BufferedWriter fw = new BufferedWriter(new FileWriter("src/main/resources/bhk/convertedJson"+".json"));
            fw.write(s);
            fw.flush();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void write(List data, String outputPath) {
        try {
            String s = objectMapper.writeValueAsString(data);
            FileWriter fw = new FileWriter(new File(outputPath));
            fw.write(s);
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
