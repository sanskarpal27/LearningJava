package com.oop.learnSingleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();    //you see fatt gyi object ki, the moment i made the constructor private.

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();   //no matter how many times we create an object, we give it the same instance.

    }
}
//note how all three references are pointing to the same instance. 
