package com.gmail.maxsvynarchuk.annotation.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.Crossover;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
