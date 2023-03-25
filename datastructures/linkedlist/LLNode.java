package datastructures.linkedlist;

public class LLNode {

    private int value;
    LLNode next=null;
    LLNode prev=null;

    public LLNode(int value) {
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
