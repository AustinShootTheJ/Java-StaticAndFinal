package com.example.staticandfinal;

// Static initialization demo. Static blocks are called before the constructor in the order they appear.

public class SIBTest {
    public static final String owner;

    // will be called before the constructor
    static{
        owner = "AJ";
        System.out.println("SIBTest static initialization block called");


    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }
    // will be called before the constructor but after the 1st static block.
    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
