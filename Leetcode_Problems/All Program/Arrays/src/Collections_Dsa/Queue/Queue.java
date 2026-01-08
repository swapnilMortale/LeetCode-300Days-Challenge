package Collections_Dsa.Queue;

public interface Queue<E>
{
    boolean add(E ele);
    boolean offer(E ele);
    E remove();
    E poll();
    E peek();
    E element();
}
