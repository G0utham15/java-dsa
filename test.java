import datastructures.LinkedList;
public class test {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList(0);
        ll.push(1);
        ll.printLinkedList();
        ll.push(2);
        ll.printLinkedList();
        ll.getHead();
        ll.getTail();
        ll.insert(3, 2);
        ll.getHead();
        ll.getTail();
        System.out.println(ll.getLength());
        ll.printLinkedList();

        ll.reverse();
        ll.printLinkedList(ll.getHeadNode());

        System.exit(0);
    }
}
