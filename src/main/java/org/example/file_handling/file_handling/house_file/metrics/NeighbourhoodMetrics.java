package org.example.file_handling.file_handling.house_file.metrics;

import org.example.file_handling.file_handling.house_file.model.House;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NeighbourhoodMetrics implements MetricCollector {
    @Override
    public void collect(List<House> data) {
        Map<String, List<House>> collect = data.stream().collect(Collectors.groupingBy(House::getNeighbourhood));
        collect.forEach((k, v) -> {
            System.out.println(k + ":" + v.size());
        });
    }
    private long getNeighbourhoodCount(List<House> data, String condition)
    {
     return data.stream().filter(row->condition.equals(row.getNeighbourhood())).count();
    }
}
