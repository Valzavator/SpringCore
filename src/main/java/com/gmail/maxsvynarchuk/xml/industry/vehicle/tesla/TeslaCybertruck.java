package com.gmail.maxsvynarchuk.xml.industry.vehicle.tesla;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.PickupTrack;

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
