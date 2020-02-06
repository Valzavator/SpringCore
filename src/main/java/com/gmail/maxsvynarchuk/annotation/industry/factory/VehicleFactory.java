package com.gmail.maxsvynarchuk.annotation.industry.factory;


import com.gmail.maxsvynarchuk.annotation.industry.vehicle.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public interface VehicleFactory {

    Crossover getCrossover();

    PickupTrack getPickupTrack();

    Sedan getSedan();

    SportCar getSportCar();

    TrailerTrack getTrailerTrack();

}
