package com.oop.sanny;

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

        Student sanny = new Student();
        System.out.println(sanny.rno);
    }
}

//create a class
//for every single student
class Student{
    int rno;
    String name;
    float marks;
}
