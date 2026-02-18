package com.oop.sanny;

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
    }
}

//create a class
//for every single student
class Student{
    int rno;
    String name;    //you see this is an object perhaps of the String class.
    float marks;
}