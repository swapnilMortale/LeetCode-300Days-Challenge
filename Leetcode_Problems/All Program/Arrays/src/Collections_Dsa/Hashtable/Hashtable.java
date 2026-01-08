package Collections_Dsa.Hashtable;

public class Hashtable<K,V>
{
    private Node<K,V>[] buckets ;
    private int capacity = 16 ;
    private  int size = 0 ;


    public Hashtable()
    {
        buckets = new Node[capacity] ;
    }

    private int getBucketIndex(K key)
    {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value)
    {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

    }

    public  boolean remove()
    {
        return false ;
    }
    public void clear()
    {
        size = 0 ;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        boolean first = true;

        for (int i = 0; i < capacity; i++) {
            Node<K, V> head = buckets[i];
            while (head != null) {
                if (!first) sb.append(", ");
                sb.append(head.key).append("=").append(head.value);
                first = false;

                head = head.next;
            }
        }

        sb.append("]");
        return sb.toString();
    }

}
