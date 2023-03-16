package datastructures;

public class DoublyLinkedList {

    LLNode head;
    LLNode tail;
    int length;

    public DoublyLinkedList(int value) {
        LLNode newNode = new LLNode(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void push(int value) {
        LLNode newNode = new LLNode(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.next = newNode;
            newNode.prev = this.head;
            this.tail = newNode;
        }
        this.length += 1;
    }

    public void pop() {
        if (this.length != 0) {
            LLNode tempNode = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            tempNode.prev = null;
            this.length -= 1;
        }else{
            System.out.println("No Elements are present to Pop");
        }
    }
}
