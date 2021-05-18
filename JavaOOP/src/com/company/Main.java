package com.company;

import com.company.vehicle.VehicleClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        VehicleClass car = new VehicleClass();
        car.setColor("Blue");
        car.setNumberOfDoors(3);
        car.getColor();
        car.start();
        car.stop();
        car.drive();
        car.getCarType();
        car.setCarType("Ford");

        VehicleClass carTwo = new VehicleClass();
        carTwo.setNumberOfDoors(3);
        carTwo.getNumberOfDoors();
    // packages are lowercase
        // Classes start with a Uppercase

//          ArrayList<String> arrayList = null;
////        arrayList. add("first");
////        arrayList.size();
////        String val = arrayList.get(1);
////        LinkedList<String> lList = new LinkedList<>();
//        if (arrayList != null){
//            System.out.println("num of elements" = arrayList.size());
//        }else{
//            System.out.println("it's empty");
        }

  public static boolean equalsDoors(VehicleClass car, VehicleClass carTwo){
        return car.getNumberOfDoors()== carTwo.getNumberOfDoors();
    }
}

