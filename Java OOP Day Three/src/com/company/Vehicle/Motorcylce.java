package com.company.Vehicle;

import com.company.repo.VehicleRepo;

public class Motorcylce implements VehicleRepo {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void accelerate(int faster){
        speed = speed + faster;
    }
    @Override
    public void brake(int eBrake){
        speed = speed - eBrake;
    }

    public void displayStatus(){
        System.out.println("speed" + speed+"gear"+gear);
    }
}
