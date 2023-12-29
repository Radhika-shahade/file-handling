package org.example.file_handling.file_handling.car_file.report.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.file_handling.file_handling.car_file.report.IFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class JsonFileWriter implements IFileWriter {
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void write(List data, String outputPath) {
        try {
            String s = objectMapper.writeValueAsString(data);
            FileWriter fileWriter = new FileWriter(new File(outputPath));
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
