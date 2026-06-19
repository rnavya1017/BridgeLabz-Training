package com.bridgelabz.programmingconstructs;

import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfectNumber(n);
    }
}
