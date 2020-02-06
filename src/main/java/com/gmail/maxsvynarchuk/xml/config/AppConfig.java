package com.gmail.maxsvynarchuk.xml.config;

import com.gmail.maxsvynarchuk.xml.industry.factory.VehicleFactory;
import com.gmail.maxsvynarchuk.xml.industry.vehicle.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        VehicleFactory vehicleFactory = context.getBean("mercedesFactory", VehicleFactory.class);

        Crossover crossover = vehicleFactory.getCrossover();
        System.out.println(crossover);
        System.out.println(vehicleFactory.getCrossover() + "\n");

        PickupTrack pickupTrack = vehicleFactory.getPickupTrack();
        System.out.println(pickupTrack);
        System.out.println(vehicleFactory.getPickupTrack() + "\n");

        Sedan sedan = vehicleFactory.getSedan();
        System.out.println(sedan);
        System.out.println(vehicleFactory.getSedan() + "\n");

        SportCar sportCar = vehicleFactory.getSportCar();
        System.out.println(sportCar);
        System.out.println(vehicleFactory.getSportCar() + "\n");

        TrailerTrack trailerTrack = vehicleFactory.getTrailerTrack();
        System.out.println(trailerTrack);
        System.out.println(vehicleFactory.getTrailerTrack() + "\n");

        crossover.move();
        pickupTrack.move();
        sedan.move();
        sportCar.move();
        trailerTrack.move();
    }
}

