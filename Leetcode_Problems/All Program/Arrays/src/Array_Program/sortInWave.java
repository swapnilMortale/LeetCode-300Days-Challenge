package Array_Program;

import java.util.Arrays;

public class sortInWave
{
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 7, 8, 9, 10};
        sortWave(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    public static void sortWave(int[]arr)
    {

        for (int i=0; i< arr.length; i += 2)
        {
            arr[i] = arr[i] + arr[i+1] ;
            arr[i+1] = arr[i] - arr[i+1] ;
            arr[i] = arr[i] - arr[i+1] ;
        }
    }
}
