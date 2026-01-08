package Collections_Framework;

import java.util.TreeSet;

public class RemoveDuplicate
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 6, 4, 4, 2, 4, 8, 9, 1, 4};

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer ref : arr) treeSet.add(ref) ;
        System.out.println(treeSet);
    }
}
