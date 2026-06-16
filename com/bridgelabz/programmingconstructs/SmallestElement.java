package com.bridgelabz.programmingconstructs;

import java.util.Scanner;

public class SmallestElement {
    public static void smallestElement(int arr[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        smallestElement(arr);
    }
}
