package Collections_Dsa.Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * A simple dynamic array-based Deque implementation.
 * Supports insertion/removal at both ends.
 *
 * @param <E> The type of element stored in this deque.
 */
public class ArrayDeque<E> implements Dequeue<E> {

    // Current number of elements
    private int ct = 0;

    // Initial capacity
    private final int initialCap = 16;

    // Internal array
    private Object[] ar;

    /**
     * Default constructor initializes deque with default capacity (16).
     */


    public ArrayDeque() {
        ar = new Object[initialCap];
    }

    /**
     * Constructor to create deque with custom capacity.
     */
    public ArrayDeque(int cap) {
        if (cap <= 0)
            throw new IllegalArgumentException("Capacity must be > 0");
        ar = new Object[cap];
    }

    /**
     * Inserts element at the front (index 0).
     */
    @Override
    public void addFirst(E ele) {
        if (ele == null) {
            throw new NullPointerException("Null values not allowed");
        }

        if (ct >= 0.75 * ar.length) {
            grow(); // Expand when load factor reaches 75%
        }

        // Shift elements right to make space at index 0
        for (int i = ct; i > 0; i--) {
            ar[i] = ar[i - 1];
        }

        ar[0] = ele;
        ct++;
    }

    /**
     * Inserts element at the end.
     */
    @Override
    public void addLast(E ele) {
        if (ele == null) {
            throw new NullPointerException("Null values not allowed");
        }

        if (ct >= 0.75 * ar.length) {
            grow();
        }

        ar[ct] = ele;
        ct++;
    }

    @Override
    public boolean offerFirst(E ele) {
        addFirst(ele);
        return true;
    }

    @Override
    public boolean offerLast(E ele) {
        addLast(ele);
        return true;
    }

    /**
     * Removes and returns the first element.
     */
    @Override
    public E removeFirst() {
        if (ct == 0)
            throw new NoSuchElementException("Deque is empty");

        E val = (E) ar[0];

        // Shift left
        for (int i = 0; i < ct - 1; i++) {
            ar[i] = ar[i + 1];
        }

        ct--;
        return val;
    }

    /**
     * Removes last element.
     */
    @Override
    public E removeLast() {
        if (ct == 0)
            throw new NoSuchElementException("Deque is empty");

        ct--;
        return (E) ar[ct];
    }

    @Override
    public E pollFirst() {
        if (ct == 0)
            return null;
        return removeFirst();
    }

    @Override
    public E pollLast() {
        if (ct == 0)
            return null;
        return removeLast();
    }

    /**
     * Retrieves first element (without removing).
     */
    @Override
    public E getFirst() {
        if (ct == 0)
            throw new NoSuchElementException("Deque is empty");
        return (E) ar[0];
    }

    /**
     * Retrieves last element (without removing).
     */
    @Override
    public E getLast() {
        if (ct == 0)
            throw new NoSuchElementException("Deque is empty");
        return (E) ar[ct - 1];
    }

    @Override
    public E peekFirst() {
        return (ct == 0) ? null : (E) ar[0];
    }

    @Override
    public E peekLast() {
        return (ct == 0) ? null : (E) ar[ct - 1];
    }

    @Override
    public boolean add(E ele) {
        addLast(ele);
        return true;
    }

    /**
     * Checks if element exists using linear scan.
     */
    @Override
    public boolean contains(E ele) {
        if (ele == null)
            return false;

        for (int i = 0; i < ct; i++) {
            if (ar[i].equals(ele))
                return true;
        }
        return false;
    }

    @Override
    public E element() {
        return getFirst();
    }

    @Override
    public boolean offer(E ele) {
        return offerLast(ele);
    }

    @Override
    public E peek() {
        return peekFirst();
    }

    @Override
    public E poll() {
        return pollFirst();
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public void push(E ele) {
        addFirst(ele);
    }

    @Override
    public E remove() {
        return removeFirst();
    }

    /**
     * Doubles the size of internal array.
     */
    private void grow() {
        Object[] temp = new Object[ar.length * 2];

        for (int i = 0; i < ct; i++) {
            temp[i] = ar[i];
        }

        ar = temp;
    }

    /**
     * String representation of deque.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i < ct; i++) {
            sb.append(ar[i]);
            if (i < ct - 1)
                sb.append(", ");
        }

        sb.append(" ]");
        return sb.toString();
    }

    /**
     * Hash code = sum of all element hashCodes.
     */
    @Override
    public int hashCode() {
        int hc = 0;
        for (int i = 0; i < ct; i++) {
            hc += ar[i].hashCode();
        }
        return hc;
    }

    /**
     * Checks equality of two Deques.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        ArrayDeque<?> other = (ArrayDeque<?>) obj;

        return ct == other.ct &&
                Arrays.deepEquals(this.ar, other.ar);
    }

    /**
     * Internal getter (not exposed outside).
     */
    private E get(int i) {
        return (E) ar[i];
    }
}
