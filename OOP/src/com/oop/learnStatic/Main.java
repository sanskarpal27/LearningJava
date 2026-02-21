package com.oop.learnStatic;

public class Main {
    public static void main(String[] args) {
        Human sauce = new Human(18, "Sauceee", 10000, false);   //notice how we did not have to import becuase both the classes are in the same package/folder.
        Human sanny = new Human(19, "Sannyy", 1000, false);
        Human saanya = new Human(20, "Saanya", 20000, true);

        System.out.println(sauce.name);
        System.out.println(Human.population);
        System.out.println(Human.population);   //notice the fuck-up, we are getting 1 for both but that should not be the case as two humans exist
        //to fix this issue, we use the static keyword.
        //static is not related to objects.
        //refer the .md file for why we're using ClassName.population
        System.out.println(Human.population);

        //greeting(); //you cannot call a non-static method without an object.

        fun();
    }
    void greeting(){
        System.out.println("Hello, Word!");
//        fun();
    }

    //this is not dependent on objects.
    static void fun(){
//        greeting(); //but this is dependent on objects.
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();     //here it is fine to call it kyuki A NON-STATIC METHOD IS CALLING A NON-STATIC METHOD.
    }
}