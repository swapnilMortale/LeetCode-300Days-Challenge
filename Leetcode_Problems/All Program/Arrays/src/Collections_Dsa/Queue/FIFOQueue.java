package Collections_Dsa.Queue;

import java.util.NoSuchElementException;

/**
 -A simple FIFO (First-In-First-Out) Queue implementation using an array.
 -This queue stores elements in the order they are inserted and removes them
 -from the front.
 -@param <E> the type of elements stored in the queue
 */
public class FIFOQueue<E> implements Queue<E>
{
    private int capacity = 10;          // Default capacity
    private Object[] elements;          // Underlying array storage
    private int size;                   // Current number of elements

    /**
     -Creates a queue with default capacity (10).
     */
    public FIFOQueue()
    {
        elements = new Object[capacity];
    }

    /**
     -Creates a queue with a specified capacity.
     */
    public FIFOQueue(int capacity)
    {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be greater than zero");

        this.capacity = capacity;
        elements = new Object[capacity];
    }

    /**
     -Inserts an element into the queue.
     -Throws exception if queue is full or element is null.
     -@return true if operation successful
     */
    public boolean add(E element)
    {
        if (element == null)
            throw new NullPointerException("Null values cannot be added into the queue");

        if (size < elements.length)
        {
            elements[size] = element;
            size++;
            return true;
        }

        throw new IllegalStateException("Queue is full");
    }

    /**
     -Inserts an element into the queue.
     -Returns false if queue is full instead of exception.
     */
    public boolean offer(E element)
    {
        if (element == null)
            throw new NullPointerException("Null values cannot be added into the queue");

        if (size < elements.length)
        {
            elements[size] = element;
            size++;
            return true;
        }

        return false; // Queue full
    }

    /**
     -Removes and returns the front (first) element.
     -Throws NoSuchElementException if queue is empty.
     */
    public E remove()
    {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");

        E element = (E) elements[0];

        // Shift elements left
        for (int i = 0; i < size - 1; i++)
        {
            elements[i] = elements[i + 1];
        }

        size--;
        return element;
    }

    /**
     -Removes and returns the front element.
     -Returns null if queue is empty.
     */
    public E poll()
    {
        try
        {
            return remove();
        }
        catch (NoSuchElementException e)
        {
            return null;
        }
    }

    /**
     -Returns the front element without removing it.
     -Throws NoSuchElementException if queue is empty.
     */
    public E element()
    {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty");

        return (E) elements[0];
    }

    /**
     -Returns the front element without removing it.
     -Returns null if queue is empty.
     */
    public E peek()
    {
        try
        {
            return element();
        }
        catch (NoSuchElementException e)
        {
            return null;
        }
    }

    /**
     -Returns queue elements in readable format.
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i < size; i++)
        {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }

        sb.append(" ]");
        return sb.toString();
    }
}
