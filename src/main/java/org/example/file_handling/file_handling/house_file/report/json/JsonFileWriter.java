package org.example.file_handling.file_handling.house_file.report.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.file_handling.file_handling.house_file.report.IFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Objects;

public class JsonFileWriter implements IFileWriter {
    ObjectMapper objectMapper = new ObjectMapper();

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
