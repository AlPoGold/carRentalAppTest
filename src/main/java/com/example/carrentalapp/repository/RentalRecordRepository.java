package com.example.carrentalapp.repository;

import com.example.carrentalapp.model.RentalRecord;

import java.util.Optional;

public class RentalRecordRepository {
    public void save(RentalRecord rentalRecord) {
    }

    public Optional<RentalRecord> findTopByCarIdOrderByRentalDateDesc(Object returnCarId) {

        RentalRecord rr = new RentalRecord();
        return Optional.of(rr);

    }
}