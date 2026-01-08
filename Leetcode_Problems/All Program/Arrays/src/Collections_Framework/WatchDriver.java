package Collections_Framework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class WatchDriver
{
    public static void main(String[] args)
    {

        Comparator<Watch> comparator = (t1, t2) -> t1.prise > t2.prise ? 1 : (t1.prise == t2.prise ? 0 : 1) ;
//        Comparator<Watch> comparator = (t1, t2) -> t1.color.compareTo(t2.color);

        TreeSet<Watch> treeSet = new TreeSet<>(comparator) ;
        treeSet.add(new Watch("Rolex","r13x",1534999.23,"Navi Blue")) ;
        treeSet.add(new Watch("Titan","a55",198123.21,"black")) ;
        treeSet.add(new Watch("Fastrack","note4",185123.21,"black")) ;
        treeSet.add(new Watch("wrang grand","4V1",228123.21,"")) ;
        treeSet.add(new Watch("timex","1l",1981342.1,"gray")) ;
        treeSet.add(new Watch("flip","9xm",198121.34,"grad white")) ;
        treeSet.add(new Watch("Titan","m31",19875.2421,"shrink gray")) ;


        Iterator<Watch> itr = treeSet.iterator() ;
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
//
//        PriorityQueue<Watch> watches = new PriorityQueue<>() ;
//
//        watches.add(new Watch("wrang grand","4V1",228123.21,"")) ;
//        watches.add(new Watch("timex","1l",1981342.1,"gray")) ;
//        watches.add(new Watch("flip","9xm",198121.34,"grad white")) ;
//        watches.add(new Watch("Titan","m31",19875.2421,"shrink gray")) ;
//        Iterator<Watch> itr = watches.iterator() ;
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }


    }

}
