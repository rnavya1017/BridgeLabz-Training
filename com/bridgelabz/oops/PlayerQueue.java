class PlayerNode {

    Player player;
    PlayerNode next;

    PlayerNode(Player player) {
        this.player = player;
    }
}

class PlayerQueue {

    PlayerNode front;
    PlayerNode rear;

    public void enqueue(Player player) {

        PlayerNode node =
                new PlayerNode(player);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public void display() {

        PlayerNode temp = front;

        while (temp != null) {
            temp.player.showCards();
            temp = temp.next;
        }
    }
}