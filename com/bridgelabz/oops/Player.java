class Player {

    int playerNumber;
    Queue cards;

    Player(int playerNumber) {
        this.playerNumber = playerNumber;
        cards = new Queue();
    }

    public void addCard(String card) {
        cards.enqueue(card);
    }

    public void showCards() {

        System.out.println(
                "Player " + playerNumber);

        cards.display();

        System.out.println();
    }
}