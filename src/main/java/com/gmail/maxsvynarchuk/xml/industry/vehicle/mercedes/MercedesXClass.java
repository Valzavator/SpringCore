package com.gmail.maxsvynarchuk.xml.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.PickupTrack;

public class MercedesXClass implements PickupTrack {
    @Override
    public void move() {
        System.out.println("MercedesXClass move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesXClass speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesXClass slowDown");
    }
}
