package com.bridgelabz.snakeandladder;

import java.util.Random;

public class UC7 {

    static Random random = new Random();

    public static int playTurn(int position) {

        boolean playAgain;

        do {

            playAgain = false;

            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {

                case 0:
                    break;

                case 1:
                    if (position + dieRoll <= 100) {
                        position += dieRoll;
                    }
                    playAgain = true;
                    break;

                case 2:
                    position -= dieRoll;

                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }

        } while (playAgain && position < 100);

        return position;
    }

    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;

        while (player1 < 100 && player2 < 100) {

            player1 = playTurn(player1);

            if (player1 == 100) {
                break;
            }

            player2 = playTurn(player2);
        }

        if (player1 == 100) {
            System.out.println("Player 1 Won!");
        } else {
            System.out.println("Player 2 Won!");
        }
    }
}