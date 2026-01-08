package Array_Program;

import java.util.Arrays;

public class SeparatePositiveNegative
{
    public static void main(String[] args)
    {
        int[] arr = {-1,4,6,-97,-55,-8,-876,7,68,80,-9,9};
        sagrateNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sagrateNumbers(int arr[])
    {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i < arr.length && arr[i] < 0)
            {
                i++;
            }
            while (j >= 0 && arr[j] >= 0)
            {
                j--;
            }
            if (i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
