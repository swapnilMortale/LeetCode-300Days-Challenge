package Collections_Framework;

import java.util.*;

public class Find_Maximum_Minimum
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;

        list.add(100);
        list.add(999);
        list.add(456);
        list.add(1000);
        list.add(9999);
        list.add(1234);
        list.add(10000);
        list.add(99999);
        list.add(55555);
        list.add(789);

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());

        System.out.println(Collections.max(list)+" is Maximum_ Value ");

        System.out.println(Collections.min(list)+" is Minimum Value ");

    }
}
