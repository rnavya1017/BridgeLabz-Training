package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swap(int n1,int n2)
    {
        System.out.println("before swapping : "+n1 +" "+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("after swapping :"+n1+" "+n2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        swap(n1,n2);
    }
}
