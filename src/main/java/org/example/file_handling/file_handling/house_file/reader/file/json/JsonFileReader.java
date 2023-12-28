package org.example.file_handling.file_handling.house_file.reader.file.json;

import org.example.file_handling.file_handling.house_file.reader.FileReader;

import java.io.File;
import java.util.List;

public class JsonFileReader implements FileReader {
private  String path;
public JsonFileReader(String inputPath)
{
this.path=inputPath;
}

    @Override
    public List read() {
        File file= new File(path);
        return null;
    }
}
