package com.gmail.maxsvynarchuk.annotation.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.PickupTrack;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class TeslaCybertruck implements PickupTrack {
    @Override
    public void move() {
        System.out.println("TeslaCybertruck move");
    }

    @Override
    public void speedUp() {
        System.out.println("TeslaCybertruck speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("TeslaCybertruck slowDown");
    }
}
