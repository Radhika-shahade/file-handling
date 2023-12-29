package org.example.file_handling.file_handling.car_file.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    String model;
    String year;
    double price;
    String transmission;
    long mileage;
    String fuelType;
    int tax;
    double mpg;
    double engineSize;

    @Override
    public String toString() {
        return model+ ","+ year +"," + price+","+transmission+","+mileage+","+fuelType+","+tax+","+mpg+","+engineSize;
    }
}
