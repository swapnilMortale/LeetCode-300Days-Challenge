package Collections_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterator
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>() ;
        treeSet.add("java") ;
        treeSet.add("python") ;
        treeSet.add("c++") ;
        treeSet.add("python") ;
        treeSet.add("java script") ;

        Iterator<String> itr = treeSet.iterator() ;
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
