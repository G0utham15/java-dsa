package datastructures.queue;

public class test {
    public static void main(String[] args) {
        Queue newQueue = new Queue(0);
        newQueue.printQueue();
        
        newQueue.enqueue(1);
        newQueue.printQueue();

        newQueue.dequeue();
        newQueue.printQueue();

        newQueue.dequeue();
        newQueue.printQueue();

        newQueue.enqueue(1);
        newQueue.printQueue();
    }
}
