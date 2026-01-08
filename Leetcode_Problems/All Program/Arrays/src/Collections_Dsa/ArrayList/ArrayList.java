package Collections_Dsa.ArrayList;

import java.util.Arrays;

/**
 * Custom ArrayList implementation
 * - Uses dynamic array
 * - Grows when load factor reaches 0.7
 *
 * @param <E> generic type
 */
public class ArrayList<E>
{
    // initial capacity
    private int capacity = 10;

    // internal array to store elements
    private Object[] array;

    // number of stored elements
    private int count = 0;


    /**
     * ArrayList()
     * - Creates list with default capacity 10
     */
    public ArrayList()
    {
        array = new Object[capacity];
    }


    /**
     * ArrayList(initialCap)
     * - Creates list with custom capacity
     * - Throws error if capacity <= 0
     */
    public ArrayList(int initialCap)
    {
        if (initialCap <= 0)
            throw new IllegalArgumentException("Capacity must be > 0");

        array = new Object[initialCap];
        capacity = initialCap;
    }


    /**
     * ensureCapacity()
     * - Checks load factor >= 0.7
     * - If yes → create new array double size
     * - Copy old elements to new array
     */
    private void ensureCapacity()
    {
        double LOAD_FACTOR = 0.7;

        if (count >= (int)(array.length * LOAD_FACTOR))
        {
            Object[] temp = new Object[array.length * 2];

            for (int i = 0; i < count; i++)
            {
                temp[i] = array[i];
            }

            array = temp;
        }
    }


    /**
     * add(element)
     * - Ensure capacity
     * - Insert element at end (count index)
     * - Increase count
     */
    public boolean add(E ele)
    {
        ensureCapacity();
        array[count] = ele;
        count++;
        return true;
    }


    /**
     * add(index, element)
     * - Validate index
     * - Ensure capacity
     * - Shift elements right to create space
     * - Insert element at index
     */
    public boolean add(int index, E ele)
    {
        if (index >= 0 && index <= count)
        {
            ensureCapacity();

            for (int i = count; i > index; i--)
            {
                array[i] = array[i - 1];
            }

            array[index] = ele;
            count++;
            return true;
        }
        return false;
    }


    /**
     * addFirst(element)
     * - Calls add(index, element) with index=0
     */
    public void addFirst(E ele)
    {
        add(0, ele);
    }


    /**
     * addLast(element)
     * - Calls add(element)
     * - Adds at end
     */
    public void addLast(E ele)
    {
        add(ele);
    }


    /**
     * size()
     * - Returns total stored elements
     */
    public int size() { return count; }


    /**
     * clear()
     * - Set all positions to null
     * - Reset count to 0
     */
    public void clear()
    {
        Arrays.fill(array, 0, count, null);
        count = 0;
    }


    /**
     * get(index)
     * - Validate index
     * - Return element at index
     */
    public E get(int index)
    {
        if (index >= 0 && index < count)
        {
            return (E) array[index];
        }
        throw new IndexOutOfBoundsException("Index not in range");
    }


    /**
     * contain(element)
     * - Uses indexOf
     * - Returns true if found
     */
    public boolean contain(E ele)
    {
        return indexOf(ele) != -1;
    }


    /**
     * indexOf(element)
     * - Linear search
     * - Returns index if element equals() matches
     * - Otherwise returns -1
     */
    public int indexOf(E ele)
    {
        for (int i = 0; i < count; i++)
        {
            if (array[i].equals(ele))
                return i;
        }
        return -1;
    }


    /**
     * isEmpty()
     * - Returns true if count == 0
     */
    public boolean isEmpty()
    {
        return count == 0;
    }


    /**
     * toArray()
     * - Creates new Object[]
     * - Copies elements from internal array
     */
    public Object[] toArray()
    {
        Object[] ans = new Object[count];

        for (int i = 0; i < count; i++)
        {
            ans[i] = array[i];
        }
        return ans;
    }


    /**
     * remove(element)
     * - Find index using indexOf
     * - Call remove(index)
     */
    public boolean remove(E ele)
    {
        int idx = indexOf(ele);

        if (idx != -1)
        {
            remove(idx);
            return true;
        }
        return false;
    }


    /**
     * remove(index)
     * - Validate index
     * - Save old element
     * - Shift elements left
     * - Set last element to null
     * - Decrease count
     */
    public E remove(int index)
    {
        if (index >= 0 && index < count)
        {
            E removed = (E) array[index];

            for (int i = index; i < count - 1; i++)
            {
                array[i] = array[i + 1];
            }

            array[count - 1] = null;
            count--;
            return removed;
        }
        throw new IndexOutOfBoundsException("Index not in range");
    }


    /**
     * removeAll(list)
     * - For each element in ref
     * - Keep removing until element disappears
     */
    public boolean removeAll(ArrayList<E> ref)
    {
        boolean changed = false;

        for (int i = 0; i < ref.size(); i++)
        {
            while (remove(ref.get(i)))
            {
                changed = true;
            }
        }
        return changed;
    }


    /**
     * retainAll(list)
     * - Copy only elements that exist inside ref
     * - Replace old array with filtered array
     */
    public boolean retainAll(ArrayList<E> ref)
    {
        Object[] temp = new Object[count];
        int index = 0;

        for (int i = 0; i < count; i++)
        {
            if (ref.contain((E) array[i]))
            {
                temp[index] = array[i];
                index++;
            }
        }

        array = temp;
        count = index;

        return true;
    }


    /**
     * addAll(list)
     * - Iterate over list
     * - Add each element
     */
    public boolean addAll(ArrayList<E> ref)
    {
        for (int i = 0; i < ref.size(); i++)
        {
            add(ref.get(i));
        }
        return true;
    }


    /**
     * addAll(index, list)
     * - Create new array of combined size
     * - Copy elements before index
     * - Copy all elements from ref
     * - Copy remaining old elements
     */
    public boolean addAll(int index, ArrayList<E> ref)
    {
        if (index >= 0 && index <= count)
        {
            Object[] temp = new Object[count + ref.size()];

            for (int i = 0; i < temp.length; i++)
            {
                if (i < index)
                {
                    temp[i] = array[i];
                }
                else if (i < ref.size() + index)
                {
                    temp[i] = ref.get(i - index);
                }
                else
                {
                    temp[i] = array[i - ref.size()];
                }
            }

            array = temp;
            count = temp.length;
            return true;
        }
        return false;
    }


    /**
     * containsAll(list)
     * - Returns false if any element of ref does not exist here
     */
    public boolean containsAll(ArrayList<E> ref)
    {
        for (int i = 0; i < ref.size(); i++)
        {
            if (!contain(ref.get(i)))
                return false;
        }
        return true;
    }


    /**
     * set(index, element)
     * - Validate index
     * - Replace old value with new
     * - Return old value
     */
    public E set(int index, E ele)
    {
        if (index >= 0 && index < count)
        {
            E prev = (E) array[index];
            array[index] = ele;
            return prev;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }


    /**
     * reversed()
     * - Create new list
     * - Add elements in reverse order
     */
    public ArrayList<E> reversed()
    {
        ArrayList<E> temp = new ArrayList<>();

        for (int i = count - 1; i >= 0; i--)
        {
            temp.add(get(i));
        }
        return temp;
    }


    /**
     * subList(fromIndex, toIndex)
     * - Validate both indexes
     * - Create new list
     * - Copy elements from range
     */
    public ArrayList<E> subList(int fromIndex, int toIndex)
    {
        if (fromIndex >= 0 && toIndex <= count && fromIndex <= toIndex)
        {
            ArrayList<E> al = new ArrayList<>();

            for (int i = fromIndex; i < toIndex; i++)
            {
                al.add(get(i));
            }

            return al;
        }

        throw new IndexOutOfBoundsException("Index out of range");
    }


    /**
     * iterator()
     * - Returns new iterator for this list
     */
    public Iterator<E> iterator()
    {
        return new Itr<>(array, count);
    }


    /**
     * equals(object)
     * - Compare class type
     * - Compare sizes
     * - Compare each element
     */
    public boolean equals(Object ref)
    {
        if (ref != null)
        {
            if (this.getClass() == ref.getClass())
            {
                ArrayList<E> other = (ArrayList<E>) ref;

                if (this.count == other.size())
                {
                    for (int i = 0; i < count; i++)
                    {
                        if (!get(i).equals(other.get(i)))
                            return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * hashCode()
     * - Sum hashcodes of all elements
     */
    public int hashCode()
    {
        int hc = 0;

        for (int i = 0; i < count; i++)
        {
            hc += get(i).hashCode();
        }

        return hc;
    }


    /**
     * toString()
     * - Builds string in [a, b, c] format
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < count; i++)
        {
            if (i < count - 1)
            {
                sb.append(array[i]).append(", ");
            }
            else
            {
                sb.append(array[i]);
            }
        }

        sb.append("]");
        return sb.toString();
    }

}
