package Collections_Framework;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement
{

    public static void main(String[] args)
    {

        int[] arr = {1,43, 33, 432, 33 ,6 , 2, 3, 2, 4, 1, 5, 3};
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        Set<Integer> set = new HashSet<>() ;
        for (int ref : arr)
        {
            set.add(ref) ;
        }
        System.out.println(set);
    }
}
