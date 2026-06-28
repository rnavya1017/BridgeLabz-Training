import java.util.Random;

public class CardGame {

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6",
                "7","8","9","10",
                "Jack","Queen",
                "King","Ace"
        };

        String[] deck = new String[52];

        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] =
                        rank + " of " + suit;
            }
        }

        Random random = new Random();

        for (int i = 0; i < 52; i++) {

            int r = random.nextInt(52);

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        PlayerQueue queue =
                new PlayerQueue();

        Player[] players =
                new Player[4];

        for (int i = 0; i < 4; i++) {

            players[i] =
                    new Player(i + 1);

            queue.enqueue(players[i]);
        }

        int card = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {

                players[i].addCard(
                        deck[card++]);
            }
        }

        queue.display();
    }
}