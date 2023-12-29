package org.example.file_handling.file_handling.car_file;

import java.io.File;
import java.util.List;

public class DirectoryList {
    public File[] listAllFiles(String directoryPath) {
        File file = new File(directoryPath);
        File files[] = file.listFiles();
        for (File f : files) {
//            System.out.println(f.getName());
        }
        return files;
    }

}
