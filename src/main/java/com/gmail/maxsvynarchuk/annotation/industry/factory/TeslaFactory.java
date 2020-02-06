package com.gmail.maxsvynarchuk.annotation.industry.factory;

import com.gmail.maxsvynarchuk.annotation.industry.vehicle.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class TeslaFactory implements VehicleFactory {

    @Lookup("modelX")
    public abstract Crossover getCrossover();

    @Lookup("teslaCybertruck")
    public abstract PickupTrack getPickupTrack();

    @Lookup("modelS")
    public abstract Sedan getSedan();

    @Lookup("roadster")
    public abstract SportCar getSportCar();

    @Lookup("teslaSemi")
    public abstract TrailerTrack getTrailerTrack();
}
