package com.bridgelabz.snakeandladder;

import java.util.Random;

public class UC2 {
    public static void main(String[] args) {
        Random random = new Random();

        int dieRoll = random.nextInt(6) + 1;

        System.out.println("Die Roll: " + dieRoll);
    }
}