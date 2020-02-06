package com.gmail.maxsvynarchuk.xml.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.Crossover;

public class MercedesGLSClass implements Crossover {
    @Override
    public void move() {
        System.out.println("MercedesGLSClass move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesGLSClass speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesGLSClass slowDown");
    }
}
