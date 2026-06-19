package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         double harmonic=0.0;
         if(n!=0)
         {
             for(int i=1;i<=n;i++)
             {
                 harmonic+=1.0/i;
             }
             System.out.printf("%.3f" , harmonic);
         }
         else {
             System.out.println("Harmonic number cant be zero");
         }
    }
}
