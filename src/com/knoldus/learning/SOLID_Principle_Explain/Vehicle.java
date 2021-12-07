package com.knoldus.learning.SOLID_Principle_Explain;

//Here I am implementing all the five principles of SOLID
class MainVehicleClass {
    public static void main(String[] args) {
        Vehicle car = new Maruti400();
        car.start();
        Vehicle bicycle =new Bicycle();
        bicycle.start();
    }
}

public interface Vehicle {
    void start();
}

//For engine vehicles
 interface EngineVehicle extends Vehicle{
    void start();
}

//For non engine vehicle
interface NonEngineVehicle extends Vehicle{
    void start();
}

class Maruti400 implements EngineVehicle{
    @Override
    public void start() {
        System.out.println("Engine has been Started");
    }
}

class Bicycle implements NonEngineVehicle{

    @Override
    public void start() {
        System.out.println("Cycle is running");
    }
}