package com.bridgelabz.loops;


import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            System.out.print(i);

            if (i < n)
                System.out.print("+");

            sum += i;
            i++;
        }

        System.out.println(" = " + sum);
    }
}