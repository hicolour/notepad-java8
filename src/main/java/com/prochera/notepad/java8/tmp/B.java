package com.prochera.notepad.java8.tmp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marek on 2/3/15.
 */
public class B extends A {

    @Override
    protected void foo(){
        System.out.println("Foo --> B");
    }


    public static void main(String[] args) {

        Map<String, String> test = new HashMap();

        test.put("a", "a");
        test.put("b", "b");
        test.put("c", "c");
        for (String key : test.keySet()) {
            if (key.equals("b")) {
                test.remove(key);
            }

        }
//     B b = new B();
//        b.test();
//    }
    }}
