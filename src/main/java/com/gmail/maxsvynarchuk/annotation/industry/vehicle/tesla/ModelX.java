package com.gmail.maxsvynarchuk.annotation.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.Crossover;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
