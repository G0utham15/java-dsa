public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value){
        this.head=new Node(value, null);
        this.tail=this.head;
        this.length=1;
    }

    public void push(int newNodeVal) {
        Node tempNode=head;
        Node newNode=new Node(newNodeVal,null);
        for(int _temp = 0;_temp<this.length;_temp++){
            if(_temp==this.length-1){
                tempNode.next=newNode;
                this.tail=tempNode.next;
                break;
            }
            tempNode=tempNode.next;
        }
        this.length+=1;
    }

    public void pop(){
        Node tempNode=head;
        if(this.length>0){
            for(int _temp = 0;_temp<this.length;_temp++){
                if(_temp==this.length-2){
                    this.tail=tempNode;
                    tempNode.next=null;
                    break;
                }
                tempNode=tempNode.next;
            }
            this.length-=1;
        }else{
            System.out.println("LinkedList has no elements");
        }
    }

    public void insert(int value, int position){
        if(position>this.length||position<0){
            System.out.println("Invalid Position");
        }else{
            Node newNode=new Node(value, null);
            if(position==0){
                newNode.next=this.head;
                this.head=newNode;
            }else{
                Node tempNode=head;
                for(int _temp=1;_temp<position;_temp++){
                    tempNode=tempNode.next;
                }
                newNode.next=tempNode.next;
                tempNode.next=newNode;
                if(position==this.length){
                    this.tail=newNode;
                }
            }
            this.length+=1;
        }
    }

    public void remove(int position){
        if(position<0||position>=this.length){
            System.out.println("Invalid Position");
        }else if(position==0){
            this.head=this.head.next;
        }else{
            Node tempNode=this.head;
            for(int _temp=1;_temp<position;_temp++){
                System.out.println(_temp+" "+tempNode.value);
                tempNode=tempNode.next;
            }
            System.out.println(tempNode.value);
            if(position==this.length-1){
                this.tail=tempNode;
            }
            tempNode.next=tempNode.next.next;
        }
        this.length-=1;
    }

    public int getLength(){
        return this.length;
    }

    public void getHead(){
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail(){
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void printLinkedList(){
        Node tempNode=head;
        if(tempNode==null){
            System.out.println("LinkedList has no elements"); 
        }else{
            while (tempNode!=null){
                System.out.print(tempNode.value+" --> ");
                tempNode=tempNode.next;
            }
            System.out.println();
        }
        
    }

}

class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value, Node next){
        this.value=value;
        this.next=next;
    }
}
