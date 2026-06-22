package com.bridgelabz.snakeandladder;

import java.util.Random;

public class UC4 {

    public static void main(String[] args) {

        int position = 0;

        Random random = new Random();

        while (position < 100) {

            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (option == 1) {
                position += dieRoll;
            } else if (option == 2) {
                position -= dieRoll;

                if (position < 0) {
                    position = 0;
                }
            }
        }

        System.out.println("Player reached 100");
    }
}