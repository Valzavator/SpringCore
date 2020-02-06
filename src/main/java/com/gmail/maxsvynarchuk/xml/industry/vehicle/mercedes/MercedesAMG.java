package com.gmail.maxsvynarchuk.xml.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.SportCar;

public class MercedesAMG implements SportCar {
    @Override
    public void move() {
        System.out.println("MercedesAMG move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesAMG speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesAMG slowDown");
    }

    @Override
    public void enableSportMode() {
        System.out.println("MercedesAMG enableSportMode");
    }

    @Override
    public void disableSportMode() {
        System.out.println("MercedesAMG disableSportMode");
    }
}
