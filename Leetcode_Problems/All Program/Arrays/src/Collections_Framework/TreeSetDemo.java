package Collections_Framework;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> treeSet = new TreeSet<>() ;

        treeSet.add(342) ;
        treeSet.add(532) ;
        treeSet.add(92) ;
        treeSet.add(92) ;
        treeSet.add(532) ;


        System.out.println(treeSet.ceiling(93));
    }
}
