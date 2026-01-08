package Collections_Dsa.Queue;

public class FIFOQueueDriver
{
    public static void main(String[] args)
    {
        FIFOQueue<Object> q1 = new FIFOQueue<>();
        q1.add("Swapnil");
        q1.add("Java");
        q1.offer("Backend Dev");
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);

        FIFOQueue<Object> q2 = new FIFOQueue<>();
        q2.add(10);
        q2.add(20);
        q2.offer(30);
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);

        FIFOQueue<Object> q3 = new FIFOQueue<>();
        q3.add(10.5);
        q3.add(99.99);
        q3.offer(55.55);
        System.out.println(q3);
        q3.remove();
        System.out.println(q3);

        FIFOQueue<Object> q4 = new FIFOQueue<>();
        q4.add(true);
        q4.add(false);
        q4.offer(true);
        System.out.println(q4);
        q4.poll();
        System.out.println(q4);

        FIFOQueue<Object> q5 = new FIFOQueue<>();
        q5.add(new Object());
        q5.add(new Object());
        q5.offer(new Object());
        System.out.println(q5);
        q5.remove();
        System.out.println(q5);

        FIFOQueue<Object> q6 = new FIFOQueue<>();
        q6.add("Hello");
        q6.add(100);
        q6.add(99.99);
        q6.add(new Object());
        q6.offer(false);
        System.out.println(q6);
        q6.remove();
        System.out.println(q6);
    }
}
