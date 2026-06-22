package com.bridgelabz.snakeandladder;

import java.util.Random;

public class UC6 {

    public static void main(String[] args) {

        int position = 0;
        int count = 0;

        Random random = new Random();

        while (position != 100) {

            count++;

            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {

                case 0:
                    System.out.println("No Play");
                    break;

                case 1:
                    if (position + dieRoll <= 100) {
                        position += dieRoll;
                    }
                    System.out.println("Ladder");
                    break;

                case 2:
                    position -= dieRoll;

                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Snake");
                    break;
            }

            System.out.println("Die Roll = " + dieRoll +
                    " Position = " + position);
        }

        System.out.println("Total Dice Rolls = " + count);
    }
}