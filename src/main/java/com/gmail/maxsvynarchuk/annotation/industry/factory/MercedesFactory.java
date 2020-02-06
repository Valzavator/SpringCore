package com.gmail.maxsvynarchuk.annotation.industry.factory;

import com.gmail.maxsvynarchuk.annotation.industry.vehicle.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Repository;

@Repository
public abstract class MercedesFactory implements VehicleFactory {

    @Lookup("mercedesGLSClass")
    public abstract Crossover getCrossover();

    @Lookup("mercedesXClass")
    public abstract PickupTrack getPickupTrack();

    @Lookup("mercedesCClass")
    public abstract Sedan getSedan();

    @Lookup("mercedesAMG")
    public abstract SportCar getSportCar();

    @Lookup("mercedesActros")
    public abstract TrailerTrack getTrailerTrack();
}
