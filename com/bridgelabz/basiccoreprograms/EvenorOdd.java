package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenorOdd {
    public static void checkEvenOrOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkEvenOrOdd(n);
    }
}
