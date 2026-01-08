package Collections_Dsa.ArrayList;

import java.util.NoSuchElementException;

public class Itr<E> implements Iterator<E>
{

    private int cursor = 0;        // points to current index
    private final Object[] array;  // internal array of the list
    private final int count;       // total number of valid elements

    public Itr(Object[] array, int count)
    {
        this.array = array;
        this.count = count;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E next() {
        if (cursor >= count) {
            throw new NoSuchElementException("No more elements");
        }
        return (E) array[cursor++];
    }

    @Override
    public boolean hasNext()
    {
        return cursor < count;
    }
}
