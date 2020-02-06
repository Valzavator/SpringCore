package com.gmail.maxsvynarchuk.xml.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.Sedan;

public class ModelS implements Sedan {
    @Override
    public void move() {
        System.out.println("Model S move");
    }

    @Override
    public void speedUp() {
        System.out.println("Model S speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Model S slowDown");
    }
}
