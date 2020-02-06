package com.gmail.maxsvynarchuk.annotation.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.SportCar;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MercedesAMG implements SportCar {
    @Override
    public void move() {
        System.out.println("MercedesAMG move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesAMG speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesAMG slowDown");
    }

    @Override
    public void enableSportMode() {
        System.out.println("MercedesAMG enableSportMode");
    }

    @Override
    public void disableSportMode() {
        System.out.println("MercedesAMG disableSportMode");
    }
}
