package org.example.file_handling.file_handling.car_file.report.csv;

import org.example.file_handling.file_handling.car_file.report.IFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter implements IFileWriter {
    @Override
    public void write(List data, String outputPath) {
        try {
            FileWriter fileWriter = new FileWriter(new File(outputPath));
            data.forEach(d ->{ try {
                        fileWriter.write(data.toString());
                        fileWriter.write("/n");
                    } catch (Exception e) {
                     e.printStackTrace();
                    }
            }

                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
