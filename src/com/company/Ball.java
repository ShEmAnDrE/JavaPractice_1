package com.company;

public class Ball {
    private final String type; // football, volleyball, etc
    private final String material; // Rubber, leather, etc
    private int pressure; // from 0 to 100%

    public Ball(String type, String material, int pressure) {
        this.type = type;
        this.material = material;
        if (pressure < 0) {
            this.pressure = 0;
        } else if (pressure > 100) {
            this.pressure = 100;
        } else {
            this.pressure = pressure;
        }
    }

    public Ball(String type, String material) {
        this.type = type;
        this.material = material;
        pressure = 100;
    }

    public Ball(String type) {
        this.type = type;
        material = "Leather";
        pressure = 100;
    }

    public Ball() {
        type = "Football";
        material = "Leather";
        pressure = 100;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        if (pressure < 0) {
            this.pressure = 0;
        } else if (pressure > 100) {
            this.pressure = 100;
        } else {
            this.pressure = pressure;
        }
    }

//    public String toString() {
//        return "Type: " + this.type + ", Material: " + this.material + ", Pressure: " + this.pressure;
//    }
}