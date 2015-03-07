package com.prochera.notepad.java8.slides;

import java.util.function.Consumer;

public class Sample3 {

    /* THINGS TO REMEMBER
    *
    * this
    *
    * */


    public static void main(String[] args) {
        EnclosingClass enclosingClass = new EnclosingClass();
        Invoker invoker = new Invoker();

        invoker.tell(enclosingClass.consumer);
        invoker.tell(enclosingClass.anonymousConsumer);
    }
}

class EnclosingClass {
    String VALUE = "EnclosingClass";

    Consumer<String> consumer = x -> System.out.println(x + " " + this.VALUE);

    Consumer<String> anonymousConsumer = new Consumer<String>() {
        String VALUE = "AnonymousClass";

        @Override
        public void accept(String s) {
            System.out.println(s + " " + this.VALUE);
        }
    };
}

class Invoker {
    String VALUE = "Invoker";
    public void tell(Consumer<String> consumer) {
        consumer.accept("Tell me ...");
    }

}