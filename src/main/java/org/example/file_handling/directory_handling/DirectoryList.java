package org.example.file_handling.directory_handling;

import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {
       new  DirectoryList().listAllFolders("F:\\");
    }

    private void listAllFolders(String directoryPath) {
        File file = new File(directoryPath);
        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File f : files) {
                if (!f.getName().startsWith(".")) {
                    if (f.isDirectory()) {
                        listAllFolders(f.getPath());
                    } else {
                        print(f);
                    }
                }
            }
        } else {
            print(file);
        }
    }
    private void print(File file)
    {
        System.out.println(file.getPath() +"/"+ file.getName());
    }
}
