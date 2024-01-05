package org.example.file_handling.file_handling.house_file.metrics;

import org.example.file_handling.file_handling.house_file.model.House;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BedroomMetrics implements MetricsCollector {
    @Override
    public void collect(List<House> data) {
        Map<Integer, List<House>> bedrooms = data.stream().collect(Collectors.groupingBy(House::getBedrooms));
        bedrooms.forEach((k,v)-> System.out.println(k + " BHK "+ v.size()) );
    }
}
