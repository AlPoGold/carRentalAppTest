package com.example.carrentalapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Car {

    private boolean isAvailable;


    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
