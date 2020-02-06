package com.gmail.maxsvynarchuk.annotation.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.Sedan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
