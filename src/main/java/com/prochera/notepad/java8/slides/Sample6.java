package com.prochera.notepad.java8.slides;


public class Sample6 {
    public static void main(String[] args) {
        Amphibian vehicle = new Amphibian();
        vehicle.cruise();
    }

}


interface Drive {
    default public void cruise() { System.out.println("Drive::cruise");}
}

interface Sail {
    default public void cruise() { System.out.println("Sail::cruise");}
}


class Amphibian implements Drive, Sail{
    @Override
    public void cruise(){
        Sail.super.cruise();
        Drive.super.cruise();
    }

}

