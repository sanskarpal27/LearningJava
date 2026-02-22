package com.oop.Introduction;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num = 45; //Internally this is Integer num = new Integer(45);
        //this is an object, rather than being a primitive type like int a = 5;

        int a = 10, b = 20;
        swap(a, b);
        System.out.println(a + " " + b);    // see no change.

        Integer c = 30, d = 40;
        System.out.println(c + " " + d);
        swapTwo(c, d);
        System.out.println(c + " " + d);

        final A kunal = new A("Kunal QT");
        kunal.name = "Sannyyy"; //this is allowed
//        kunal = new A("hehh");    this is not (refer comments at the end of the file.)

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapTwo(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;   //still not swapping bc.
    }
}
// the method swapTwo could not swap the values kyuki the Integer class internally is 'FINAL'.
// the final keyword makes sure one cannot modify something.
// also note that final varibles must be initialized...like you cannot be doing final int a;

// the final keyword works differently for objects/instances and shit.
// example :
// final Student kunal = new Student();
// kunal.name = "Kunal I'm tired."; notice that this works despite the object having the keyword final...so like you can change the values of the instance variables.
//  BUT kunal = other object; this is something you cannot be doing.

class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed.");
//    }

    //the finalize method no longer works...sorry kunal.
}
