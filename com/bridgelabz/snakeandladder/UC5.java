package com.bridgelabz.snakeandladder;

import java.util.Random;

public class UC5 {

    public static void main(String[] args) {

        int position = 0;

        Random random = new Random();

        while (position != 100) {

            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {

                case 0:
                    break;

                case 1:
                    if (position + dieRoll <= 100) {
                        position += dieRoll;
                    }
                    break;

                case 2:
                    position -= dieRoll;

                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }
        }

        System.out.println("Player won the game!");
    }
}