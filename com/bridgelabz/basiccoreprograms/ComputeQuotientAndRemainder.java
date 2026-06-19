package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void compute(int num1,int num2)
    {
        System.out.println("Quotient " +num1/num2 );
        System.out.println("Remainder "+num1%num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        compute(num1,num2);
    }
}
