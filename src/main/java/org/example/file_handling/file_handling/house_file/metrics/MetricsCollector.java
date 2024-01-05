package org.example.file_handling.file_handling.house_file.metrics;

import org.example.file_handling.file_handling.house_file.model.House;

import java.util.List;

public interface MetricsCollector {
    void collect(List<House>data);
}
