package com.prochera.notepad.java8.slides;


public class Sample9 {

    public interface A{
        default void dos(){
            System.out.println("A");
        }
    }

    public interface B{
        default void dos(){
            System.out.printf("B");
        }
    }




}



