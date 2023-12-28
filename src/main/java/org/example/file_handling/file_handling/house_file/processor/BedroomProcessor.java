package org.example.file_handling.file_handling.house_file.processor;

import org.example.file_handling.file_handling.house_file.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class BedroomProcessor {
    public List<House> getHouses(List<House> houses, int bedroomSize) {
        List<House> bhkList = houses.stream().filter(h -> h.getBedrooms() == bedroomSize).collect(Collectors.toList());
        return bhkList;
    }
}
