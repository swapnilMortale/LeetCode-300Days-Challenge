package Array_Program;

import java.util.Arrays;

public class MaxSubArray
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum Subarray Sum: " + maxySubArraySum(arr));
    }
    public static  int maxySubArraySum(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE , currentSum = 0 , previousSum = Integer.MIN_VALUE ;
        int sum = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i] ;
            currentSum += arr[i] ;
        }
        if (currentSum > maxSum)
        {
            previousSum = maxSum ;
            maxSum = currentSum ;
        }
        else if (currentSum < previousSum)
        {
            currentSum = 0 ;
        }
        return maxSum > sum ? maxSum : sum ;
    }
}
