package datastructures.linkedlist;

public class SinglyLinkedList {
    LLNode head;
    LLNode tail;
    private int length;

    public SinglyLinkedList(int value) {
        this.head = new LLNode(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void push(int newNodeVal) {
        LLNode tempNode = head;
        LLNode newNode = new LLNode(newNodeVal);
        for (int _temp = 0; _temp < this.length; _temp++) {
            if (_temp == this.length - 1) {
                tempNode.next = newNode;
                this.tail = tempNode.next;
                break;
            }
            tempNode = tempNode.next;
        }
        this.length += 1;
    }

    public void pop() {
        LLNode tempNode = head;
        if (this.length > 0) {
            for (int _temp = 0; _temp < this.length; _temp++) {
                if (_temp == this.length - 2) {
                    this.tail = tempNode;
                    tempNode.next = null;
                    break;
                }
                tempNode = tempNode.next;
            }
            this.length -= 1;
        } else {
            System.out.println("LinkedList has no elements");
        }
    }

    public void insert(int value, int position) {
        if (position > this.length || position < 0) {
            System.out.println("Invalid Position");
        } else {
            LLNode newNode = new LLNode(value);
            if (position == 0) {
                newNode.next = this.head;
                this.head = newNode;
            } else {
                LLNode tempNode = head;
                for (int _temp = 1; _temp < position; _temp++) {
                    tempNode = tempNode.next;
                }
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                if (position == this.length) {
                    this.tail = newNode;
                }
            }
            this.length += 1;
        }
    }

    public void remove(int position) {
        if (position < 0 || position >= this.length) {
            System.out.println("Invalid Position");
        } else if (position == 0) {
            this.head = this.head.next;
        } else {
            LLNode tempNode = this.head;
            for (int _temp = 1; _temp < position; _temp++) {
                System.out.println(_temp + " " + tempNode.getValue());
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.getValue());
            if (position == this.length - 1) {
                this.tail = tempNode;
            }
            tempNode.next = tempNode.next.next;
        }
        this.length -= 1;
    }

    public int getLength() {
        return this.length;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.getValue());
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.getValue());
        }
    }

    public LLNode getHeadNode() {
        return this.head;
    }

    public void printLinkedList(LLNode tempNode) {
        if (tempNode == null) {
            System.out.println("LinkedList has no elements");
        } else {
            while (tempNode != null) {
                System.out.print(tempNode.getValue() + " --> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    public void printLinkedList() {
        LLNode tempNode=this.head;
        if (tempNode == null) {
            System.out.println("LinkedList has no elements");
        } else {
            while (tempNode != null) {
                System.out.print(tempNode.getValue() + " --> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    public void reverse() {

        /*
         * Time Complexity O(n) & Space Complexity O(n)
         * LinkedList revHead=new LinkedList(this.head.value);
         * this.tail=this.head;
         * for(Node _temp=this.head.next;_temp!=null;_temp=_temp.next){
         * revHead.insert(_temp.value, 0);
         * }
         * this.head=revHead.getHeadNode();
         */
        
         // Time Complexity O(n), Space complexity O(1)

        LLNode _temp=this.head;
        this.head=this.tail;
        this.tail=_temp;
        LLNode _next;
        LLNode _prev=null;
        while(_temp!=null){
            _next=_temp.next;
            _temp.next=_prev;
            _prev=_temp;
            _temp=_next;
        }
    }

}


