package Array_Program;

import java.util.Arrays;

public class LeftShift
{
    public static void main(String[] args)
    {
        int[] arr = {1,23,4,55,6,7,8,9} ;
        leftShiftElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void leftShiftElement(int[] arr)
    {
        int first = arr[0] ;
        for (int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = arr[i + 1 ];
        }
        arr[arr.length - 1] = first ;
    }
}
