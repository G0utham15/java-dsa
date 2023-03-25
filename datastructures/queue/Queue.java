package datastructures.queue;

public class Queue {
    private int length;
    private Node first;
    private Node last;

    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public Node dequeue() {
        if (this.length == 0) {
            return null;
        }

        Node tempNode = this.first;
        if (this.length == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.next;
            tempNode.next = null;
        }
        this.length--;
        return tempNode;
    }

    public void printLength() {
        System.out.println("Length: " + this.length);
    }

    public void PrintFirst() {
        System.out.println("First: " + this.first.value);
    }

    public void PrintLast() {
        System.out.println("Last: " + this.last.value);
    }

    public void printQueue() {
        if (this.length == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        Node tempNode = this.first;
        System.out.println("Current Queue: ");
        while (tempNode != null) {
            System.out.print(tempNode.value + " <= ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
