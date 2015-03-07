package com.prochera.notepad.java8.slides;


public class Sample5 {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.land();
        plane.takeOff();
    }

}

interface  Fly{
    default public void land() { System.out.println("Fly::land");}
    default public void takeOff() { System.out.println("Fly::takeOff");}
}



interface FastFly extends Fly{
    default public void land() { System.out.println("FastFly::land");}
    default public void takeOff() { System.out.println("FastFly::takeOff");}
}

class Vehicle {
    public void land() {System.out.println("Vehicle::land");}
}

class Plane extends Vehicle implements FastFly{

}