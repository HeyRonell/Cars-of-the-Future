package com.carsforsale;

import java.math.*;

public class Vehicle {
//    Casting a final on properties that shouldn't be reassignable once the object is made.
    private final int vin;
    private final int year;
    private final String make;
    private final String model;
    private final String vehicleType;
    private String color;
    private int odometer;
    private BigDecimal price;

//    Param constructor.
    public Vehicle(int vin, int year, String make,
                   String model, String vehicleType,
                   String color, int odometer, BigDecimal price) {

        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

//    Getters and setters below.
    public int getYear() {
        return year;
    }

    public int getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
