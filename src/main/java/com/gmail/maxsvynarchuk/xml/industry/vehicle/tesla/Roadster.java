package com.gmail.maxsvynarchuk.xml.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.SportCar;

public class Roadster implements SportCar {
    @Override
    public void move() {
        System.out.println("Roadster move");
    }

    @Override
    public void speedUp() {
        System.out.println("Roadster speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Roadster slowDown");
    }

    @Override
    public void enableSportMode() {
        System.out.println("Roadster enableSportMode");
    }

    @Override
    public void disableSportMode() {
        System.out.println("Roadster disableSportMode");
    }
}
