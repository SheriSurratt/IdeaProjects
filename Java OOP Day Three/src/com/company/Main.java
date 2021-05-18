package com.company;

import com.company.Vehicle.Car;
import com.company.Vehicle.Motorcylce;
import com.company.Vehicle.RallyCar;
import com.company.companyAddress.Address;
import com.company.companyAddress.Programmer;

import java.util.EventObject;

public class Main {

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.setDoors(2);
//        System.out.println(car1.getDoors());
//
//        Motorcylce bike = new Motorcylce();
//        bike.changeGear(5);
//        bike.accelerate(150);
//        bike.brake(1);
//        System.out.println("Motorcycle class");
//        bike.displayStatus();
//
//
//        RallyCar Evo = new RallyCar();
//        Evo.changeGear(4);
//        Evo.accelerate(60);
//        Evo.brake(2);
//        System.out.println("RallyCar Class");
//        Evo.displayStatus();

        Address = new Address(5000,"someville", "SD");


        Programmer obj = new Programmer("Jane", address);
        System.out.println(obj.getName());
        System.out.println(obj.getProgrammerAddr().getStreetNum());
        System.out.println(obj.getProgrammerAddr().getCity());
        System.out.println(obj.getProgrammerAddr().getState());
    }
}
