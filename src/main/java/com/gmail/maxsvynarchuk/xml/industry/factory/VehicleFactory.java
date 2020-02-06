package com.gmail.maxsvynarchuk.xml.industry.factory;


import com.gmail.maxsvynarchuk.xml.industry.vehicle.*;

public interface VehicleFactory {

    Crossover getCrossover();

    PickupTrack getPickupTrack();

    Sedan getSedan();

    SportCar getSportCar();

    TrailerTrack getTrailerTrack();

}
