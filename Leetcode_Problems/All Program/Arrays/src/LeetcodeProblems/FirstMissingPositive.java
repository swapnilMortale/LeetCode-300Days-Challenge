package LeetcodeProblems;

import java.util.Arrays;

public class FirstMissingPositive
{
    public static void main(String[] args)
    {
        int[] arr = {3,4,-1,1} ;
        System.out.println(firstMissingPositive(arr)+"  is missing ");
    }
    public static int firstMissingPositive(int[] arr)
    {
        int smallest = 1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == smallest)
            {
                    smallest++ ;
            }
        }
        return smallest ;
    }
}
