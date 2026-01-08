package Collections_Framework;

public class MyQueue
{
    private int capacity ;
    private int size ;
    private int rear ;
    private int front ;
    private int[] arr ;

    public MyQueue(int capacity)
    {
        this.capacity = capacity ;
        arr = new int[capacity] ;
        rear = -1 ;
        front = 0 ;
        size = 0 ;
    }

    public void enqueue(int data)
    {
        if (isFull())
        {
            System.out.println("Queue is Full!");
            return;
        }
        rear = (rear + 1) % capacity ;
        arr[rear] = data ;
        size++ ;
    }
    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = arr[front] ;
        front = (front + 1) % capacity ;
        size--;
        return val ;
    }


    public int peek()
    {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    public int size()
    {
        return  size ;
    }
    public boolean isEmpty()
    {
        return size == 0 ;
    }

    public boolean isFull() {
        return size == capacity;
    }

}
