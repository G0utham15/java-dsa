package datastructures.stack;

public class test {
    public static void main(String[] args) {
        Stack tempStack=new Stack(5);
        tempStack.push(1);
        tempStack.getTop();
        tempStack.getHeight();
        tempStack.printStack();
        tempStack.pop();
        tempStack.getTop();
        tempStack.getHeight();
        tempStack.printStack();
    }
}
