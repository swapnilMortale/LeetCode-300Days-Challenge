package Array_Program;

import java.util.Arrays;

public class MaxProductOfThree
{
    public static void main(String[] args)
    {
        int[] arr = {1, -4, 3, -6, 7, 0};

        int result = findMaxProduct(arr);
        System.out.println("Maximum product of three numbers = " + result);
    }
    public static int findMaxProduct(int[] arr)
    {   Arrays.sort(arr);
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++)
        {
            for (int j = i+1 ; j < arr.length - 1; j++)
            {
                for (int k = j+1; k < arr.length; k++)
                {
                    int product = arr[i] * arr[j] * arr[k] ;
                    if (product > maxProduct) maxProduct = product ;
                }
            }
        }
        return maxProduct;
    }
}
