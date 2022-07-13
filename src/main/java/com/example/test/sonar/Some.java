package com.example.test.sonar;

import java.math.BigDecimal;

public class Some {
    public void smell() {
        while (true) {
            System.out.println(123);
            System.out.println(123);
            System.out.println(123);
            System.out.println(123);
            System.out.println(123);
            System.out.println(123);
            System.out.println(123);
        }
    }


    private static int test() {
       try {
           while (true) {
               BigDecimal bigDecimal = new BigDecimal(1);
           }
       } catch (Throwable throwable) {
           System.out.println("123");
       }
       return 1;
    }
}
