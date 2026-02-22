package com.oop.learnStatic;

public class InnerClasses { //you cannot make this outer class static
    static class Test{     //these inner classes can be static or non-static
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        Test a = new Test("Kunal");     //this is an error kyuki we are trying to access something non-static from a static method

        // to fix this i will make the class static
        Test b = new Test("Rahul");     //see error gone.
    }
}

//outside classes cannot be static kyuki they are not dependent on any other classes.
//when the class is inside another class, then it is dependent on the outer class so it becomes a non-static thing.
// you see here, the Test class is static so it does not depend on the instances of "InnerClasses" class...but please understand that the class and the main method can have instances and shit.