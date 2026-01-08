package Collections_Framework;


import java.util.TreeSet;

public class DescendingOrder
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<>() ;

        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(104);
        ts.add(404);
        ts.add(205);

        System.out.println(ts);
        System.out.println(ts.descendingSet());
    }
}
