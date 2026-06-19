package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;
//print the power of 2 values till n
public class PowerOfTwo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        if(n>=0 && n<31)
        {
            for (int i = 0; i <= n; i++) {
                System.out.println("2^" + i + " = " + (1L << i));
            }
        }
        else {
            System.out.println("enter values between 1 to 30");
        }
    }
}
