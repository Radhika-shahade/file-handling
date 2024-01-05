package org.example.file_handling.file_handling.house_file.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NeighbourhoodCount {
    private long total;
    private long rural;
    private long urban;
    private long suburb;
}
