package Collections_Framework;

public class MyQueueDriver
{
    public static void main(String[] args)
    {
        MyQueue q = new MyQueue(10) ;
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Peek: " + q.peek());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Peek Now: " + q.peek());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Queue Full? " + q.isFull());
        System.out.println("Queue Empty? " + q.isEmpty());
        System.out.println("Size: " + q.size());
    }
}
