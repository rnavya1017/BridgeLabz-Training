package com.bridgelabz.loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original=n;
        int reverse = 0;

        for (; n != 0; n = n / 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        if(original==reverse)
        {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a palindrome number ");
        }
    }
}