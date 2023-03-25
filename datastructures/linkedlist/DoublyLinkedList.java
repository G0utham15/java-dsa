package datastructures.linkedlist;

public class DoublyLinkedList {

    LLNode head;
    LLNode tail;
    private int length;

    public DoublyLinkedList(int value) {
        LLNode newNode = new LLNode(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public int getLength() {
        return this.length;
    }

    public void push(int value) {
        LLNode newNode = new LLNode(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next=newNode;
            newNode.prev=this.tail;
            this.tail = newNode;
        }
        this.length += 1;
    }

    public void prepend(int value) {
        LLNode newNode = new LLNode(value);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.length += 1;
    }

    public LLNode removeFirst(){
        if(this.length==0){
            System.out.println("No Elements to Remove");
            return null;
        }else if(this.length==1){
            LLNode temp=this.head;
            this.head=null;
            this.tail=null;
            this.length-=1;
            return temp;
        }else{
            LLNode temp=this.head;
            this.head=this.head.next;
            this.head.prev=null;
            this.length-=1;
            return temp;
        }
    }

    public LLNode pop() {
        if (this.length != 0) {
            LLNode tempNode = this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            tempNode.prev = null;
            this.length -= 1;
            return tempNode;
        } else {
            System.out.println("No Elements are present to Pop");
            return null;
        }
    }

    public LLNode getNodeAtIndex(int index){
        if(index<0||index>=this.length){
            return null;
        }
        LLNode temp=this.head;
        if(index<this.length/2){
            for (int _temp = 0;_temp<index;_temp++){
                temp=temp.next;
            }
        }else{
            temp=this.tail;
            for (int _temp = this.length-1;_temp>index;_temp--){
                temp=temp.prev;
            }
        }
        return temp;
    }

    public void setValueAtIndex(int index, int value){
        if(index<0||index>=this.length){
            System.out.println("Index is not in range");
            return;
        }
        
        LLNode temp=getNodeAtIndex(index);
        temp.setValue(value);
    }

    public Boolean insertAtIndex(int index,int value){
        if(index<0||index>this.length) return false;

        if(index==0){
            prepend(value);
            return true;
        }
        if(index==this.length){
            push(value);
            return true;
        }
        LLNode tempNode=new LLNode(value);
        LLNode before=getNodeAtIndex(index-1);
        LLNode after=before.next;

        before.next=tempNode;
        tempNode.prev=before;
        after.prev=tempNode;
        tempNode.next=after;

        this.length+=1;
        return true;
    }

    public LLNode removeNodeAtIndex(int index){
        if(index<0||index>=this.length){
            return null;
        }

        if(index==0){
            return removeFirst();
        }

        if(index==this.length-1){
            return pop();
        }

        LLNode tempNode=getNodeAtIndex(index);
        tempNode.prev.next=tempNode.next;
        tempNode.next.prev=tempNode.prev;

        tempNode.next=null;
        tempNode.prev=null;
        this.length--;
        return tempNode;
    }

    public void printDLL(){
        LLNode temp=this.head;
        while (temp!=null) {
            System.out.print(temp.getValue() + " <=> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void printDLLReverse(){
        LLNode temp=this.tail;
        while (temp!=null) {
            System.out.print(temp.getValue() + " <=> ");
            temp=temp.prev;
        }
        System.out.println();
    }
}
