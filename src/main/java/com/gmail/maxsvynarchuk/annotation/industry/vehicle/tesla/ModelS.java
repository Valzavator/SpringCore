package com.gmail.maxsvynarchuk.annotation.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.Sedan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
