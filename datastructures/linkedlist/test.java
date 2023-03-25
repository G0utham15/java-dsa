package datastructures.linkedlist;
public class test {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList(0);
        dll.push(1);
        dll.push(2);
        dll.push(5);
        dll.push(4);

        dll.printDLL();
        dll.removeNodeAtIndex(3);
        dll.printDLL();

        dll.printDLLReverse();

        System.exit(0);
    }
}
