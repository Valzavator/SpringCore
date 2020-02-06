package com.gmail.maxsvynarchuk.annotation.industry.vehicle.tesla;

import com.gmail.maxsvynarchuk.annotation.industry.vehicle.TrailerTrack;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TeslaSemi implements TrailerTrack {
    @Override
    public void fastenLoad() {
        System.out.println("TeslaSemi fastenLoad");
    }

    @Override
    public void unfastenLoad() {
        System.out.println("TeslaSemi unfastenLoad");
    }

    @Override
    public void move() {
        System.out.println("TeslaSemi move");
    }

    @Override
    public void speedUp() {
        System.out.println("TeslaSemi speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("TeslaSemi slowDown");
    }
}
