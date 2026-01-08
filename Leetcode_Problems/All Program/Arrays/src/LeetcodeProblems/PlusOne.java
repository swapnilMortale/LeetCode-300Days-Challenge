package LeetcodeProblems;

import java.util.Arrays;

public class PlusOne
{
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 2, 1};
//        int[] arr = {9,9,9,9,9,otr9,9,9,9} ;
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] arr)
    {
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (arr[i] < 9)
            {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }


        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
