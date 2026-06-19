package com.bridgelabz.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter number of flips: ");
    int n = sc.nextInt();

    int heads = 0, tails = 0;

        for (int i = 0; i < n; i++) {
        double flip = random.nextDouble();

        if (flip < 0.5)
            heads++;
        else
            tails++;
    }

        System.out.println("Heads Percentage = " + (heads * 100.0 / n));
        System.out.println("Tails Percentage = " + (tails * 100.0 / n));

}
}
