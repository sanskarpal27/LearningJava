package com.oop.Introduction;

import java.util.Arrays;

public class Classes {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] rollno = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students {roll no, name, marks]
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));  //this gives me null kyuki nothing is yet initialized. (for objects it is null only)

        Student sanny = new Student();  //dynamically allocates memory and returns a reference variable to it.
        System.out.println(sanny);  //garbage value.
        //all objects in java must be declared dynamically. Each object has its own set of things.

        //Student sanny = new Student(); isme the things to the left of the = occur at compile-time, and the things to the right happen at runtime.
        //you CANNOT manipulate references in java like pointers in C++.

        //the 'new' keyword essentially just dynamically allocates memory.
        //Student()
        System.out.println(sanny.rno);
        System.out.println(sanny.name);
        System.out.println(sanny.marks);

        sanny.rno = 30;
        sanny.name = "Sanny";
        sanny.marks = 91;
        System.out.println(sanny.rno + " " + sanny.name + " " + sanny.marks);

        Student kunal = new Student(13, "KunalKushwaha", 89);
        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random2 = new Student();
        System.out.println(random2.name);
    }
}

//create a class
//for every single student
class Student{
    int rno;
    String name;    //you see this is an object perhaps of the String class.
    float marks;

    // a constructor basically defines what happens when an object is created
    //it is a special type of function in a class...by default also there is a constructor
    //it runs when you create an object and you can allocate some variables through it as well.
    //is default constructor is used then java makes everything empty by default.
    //we can also have parameterized constructors

//    Student(){
//        kunal.rno = 13;
//        kunal.name = "KunalKushwaha";
//        kunal.marks = 88;
//    }
    //you cant do this cuz the class doesn't know about kunal the object cuz a class is just a template.
    //so we use the 'this' keyword

//    Student(){
//        this.rno = 13;
//        this.name = "KunalKushwaha";
//        this.marks = 22;
//    }

    //but this way every object i create will have the same properties. hence we make a parameterized constructor.
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    //constructor overloading
//    Student(){
//        this.rno = 31;
//        this.name = "Sauce";
//        this.marks = 87;
//    }

    //what the fuck kunal
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    //also note that we can call a constructor from another constructor
    Student(){
        this (13, "default person", 300);
        //internally: new Student(13, "default person", 100.0f);
    }

    public void greeting(){
        String name = "Sanny";
        System.out.println("Hello, my name is " + name);
        System.out.println("Hello, my name is " + this.name);
    }
}

//Student one = new Student();
//Student two = one;
// this is possible but notice how both the things will point to the same object.
// two doesnt allocate any new memory.
//hence any changes made via 1 will also lead to changes in two.