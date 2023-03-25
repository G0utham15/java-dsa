package datastructures.stack;

public class Stack {

    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public Stack(int value){
        this.top=new Node(value);
        this.height=1;
    }

    public void push(int value){
        
        Node tempNode=new Node(value);

        if(this.height==0){
            top=tempNode;
        }else{
            tempNode.next=top;
            top=tempNode;
        }
        height++;
    }

    public Node pop(){
        if(this.height==0){
            return null;
        }
        Node tempNode=this.top;
        this.top=this.top.next;
        tempNode.next=null;
        this.height--;
        return tempNode;
    }

    public void printStack(){
        Node tempNode=top;
        while(tempNode!=null){
            System.out.println(tempNode.value);
            tempNode=tempNode.next;
        }
    }

    public void getTop(){
        System.out.println("Top: "+top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+height);
    }

}
