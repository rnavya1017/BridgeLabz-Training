class Queue {

    Node front;
    Node rear;

    public void enqueue(String data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public void display() {

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}