package com.gmail.maxsvynarchuk.xml.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.Sedan;

public class MercedesCClass implements Sedan {
    @Override
    public void move() {
        System.out.println("MercedesCClass move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesCClass speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesCClass slowDown");
    }
}
