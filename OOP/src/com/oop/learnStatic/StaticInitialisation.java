package com.oop.learnStatic;

//this is a demo to show initialization of static variables.
public class StaticInitialisation {
    static int a = 4;
    static int b;

    static{
        System.out.println("I am in Static Block.");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialisation obj = new StaticInitialisation();  //when the class loads, the static block is run.
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);

        StaticInitialisation.b += 3;
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);

        StaticInitialisation obj2 = new StaticInitialisation();     //you see when i again created an object the static block did not run
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
    }
}
