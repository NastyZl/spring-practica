package com.example.demo.dto;

public class Location {
    private double LAT;
    private double LON;

    public Location(double LAT, double LON) {
        this.LAT = LAT;
        this.LON = LON;
    }

    public double getLAT() {
        return LAT;
    }

    public void setLAT(double LAT) {
        this.LAT = LAT;
    }

    public double getLON() {
        return LON;
    }

    public void setLON(double LON) {
        this.LON = LON;
    }
}
