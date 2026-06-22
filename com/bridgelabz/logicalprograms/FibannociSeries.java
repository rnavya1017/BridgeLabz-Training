package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibannociSeries {
    public static void fibanocci(int n)
    {
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibanocci(n);
    }
}
