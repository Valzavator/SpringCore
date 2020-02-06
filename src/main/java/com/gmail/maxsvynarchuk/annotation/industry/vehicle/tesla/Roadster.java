package com.gmail.maxsvynarchuk.annotation.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.SportCar;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Roadster implements SportCar {
    @Override
    public void move() {
        System.out.println("Roadster move");
    }

    @Override
    public void speedUp() {
        System.out.println("Roadster speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Roadster slowDown");
    }

    @Override
    public void enableSportMode() {
        System.out.println("Roadster enableSportMode");
    }

    @Override
    public void disableSportMode() {
        System.out.println("Roadster disableSportMode");
    }
}
