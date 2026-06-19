package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;


public class Primefactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors: ");

        // Find prime factors
        for (int i = 2; i * i <= n; i++) {

            // Print i repeatedly while it divides n
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is still greater than 1, it is a prime factor
        if (n > 1) {
            System.out.print(n);
        }

        sc.close();
    }
}