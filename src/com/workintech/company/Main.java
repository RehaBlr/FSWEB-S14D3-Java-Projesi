package com.workintech.company;

public class Main {
    public static void main(String[] args) {
        CarSkeleton ford = new GasPoweredCar("ford" ,"ford",30,5);

        CarSkeleton tesla =new ElectricCar("model 3","clean ",300,80);

        CarSkeleton bmw = new HybridCar("bmw2","hybrid car",0.5,10,3 );

        System.out.println(bmw.drive());
        System.out.println(tesla.getDescription());
        System.out.println(ford.drive());
    }
}
