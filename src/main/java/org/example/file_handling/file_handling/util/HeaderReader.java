package org.example.file_handling.file_handling.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class HeaderReader {
    public static String readHeader(String filePath) {
        File file = new File(filePath);
        try {
            BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            return bufferedreader.readLine();
        } catch (Exception e) {
          throw new RuntimeException("File not exist!");
        }
    }
}
