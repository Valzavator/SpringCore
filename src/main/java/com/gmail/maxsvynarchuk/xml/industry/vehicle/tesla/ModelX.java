package com.gmail.maxsvynarchuk.xml.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.Crossover;

public class ModelX implements Crossover {
    @Override
    public void move() {
        System.out.println("Model X move");
    }

    @Override
    public void speedUp() {
        System.out.println("Model X speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Model X slowDown");
    }
}
