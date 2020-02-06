package com.gmail.maxsvynarchuk.xml.industry.vehicle.mercedes;

import com.gmail.maxsvynarchuk.xml.industry.vehicle.TrailerTrack;

public class MercedesActros implements TrailerTrack {
    @Override
    public void fastenLoad() {
        System.out.println("MercedesActros fastenLoad");
    }

    @Override
    public void unfastenLoad() {
        System.out.println("MercedesActros unfastenLoad");
    }

    @Override
    public void move() {
        System.out.println("MercedesActros move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesActros speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesActros slowDown");
    }
}
