package Collections_Framework;


import java.util.ArrayList;
import java.util.Iterator;

public class Add_Print
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(2342);
        list.add(24);
        list.add(4242);
        list.add(4255);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (Integer l : list)
        {
            System.out.println(l);
        }
     }
}
