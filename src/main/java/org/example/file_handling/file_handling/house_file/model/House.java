package org.example.file_handling.file_handling.house_file.model;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
@Builder
public class House implements Comparable{
  private   int squareFeet;
    private int bedrooms;
    private int bathrooms;
    private String neighbourhood;
    private int year;
    private double price;

    @Override
    public String toString() {
        return  squareFeet + "," + bedrooms + "," + bathrooms + "," + neighbourhood + "," + year + "," + price;
    }

    @Override
    public int compareTo(Object o) {
        House h= (House)o;
        return this.neighbourhood.compareTo(h.neighbourhood);
    }
}
