package com.example.staticandfinal;


//The static keyword is used to indicate that there will be only one instance of a method or variable in a class.
// as such static variables are shared between all instances of a class and it is recommended to use static methods to modify them for clarification.

//The final keyword is used to indicate that a variable may be modified only once before becoming constant. This should be used for variables
// we wish to initialize upon creation of an object (we will not know the value beforehand). In this way we can create constants which we do not
// know the value of beforehand.


// Constants in Java are declared using static final.

public class Main {

    public static void main(String[] args) {


        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);





//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//
//        int pw = 0022;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(33);
//        password.letMeIn(0022);



    }
}
