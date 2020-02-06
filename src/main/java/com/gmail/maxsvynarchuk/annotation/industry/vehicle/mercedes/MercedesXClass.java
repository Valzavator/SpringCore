package com.gmail.maxsvynarchuk.annotation.industry.vehicle.mercedes;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.PickupTrack;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MercedesXClass implements PickupTrack {
    @Override
    public void move() {
        System.out.println("MercedesXClass move");
    }

    @Override
    public void speedUp() {
        System.out.println("MercedesXClass speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("MercedesXClass slowDown");
    }
}
