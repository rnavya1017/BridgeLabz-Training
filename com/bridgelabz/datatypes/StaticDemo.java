package com.bridgelabz.datatypes;


public class StaticDemo {

    static int count;

    static {
        count = 100;
        System.out.println("Static block executed.");
    }

    static void display() {
        System.out.println("Static method called.");
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        display();
    }
}