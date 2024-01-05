package org.example.file_handling.file_handling.house_file.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class BedroomsCount {
    private Map<Integer, NeighbourhoodCount> bedrooms;
}
