package com.oop.learnStatic;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;  //to access a static variable, just use the class name as they are unrelated to objects.
    }

    static void message(){
        System.out.println("Hello, This is Human class.");
//        System.out.println(this.age);   //doesn't work...cant use 'this' inside static methods

    }
}
//think about if there was a property common to all humans i.e. some property same for all human objects.
//hence use static keyword.
//it will work with 'this' also, but the convention is to use class name.

