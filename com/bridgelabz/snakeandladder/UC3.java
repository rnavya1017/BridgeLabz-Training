package com.bridgelabz.snakeandladder;


import java.util.Random;

public class UC3 {

    public static void main(String[] args) {

        int position = 0;

        Random random = new Random();

        int dieRoll = random.nextInt(6) + 1;

        int option = random.nextInt(3);

        switch (option) {

            case 0:
                System.out.println("No Play");
                break;

            case 1:
                position += dieRoll;
                System.out.println("Ladder");
                break;

            case 2:
                position -= dieRoll;
                System.out.println("Snake");
                break;
        }

        System.out.println("Position: " + position);
    }
}