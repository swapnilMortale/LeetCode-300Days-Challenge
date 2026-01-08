package Array_Program;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {5, 5, 6, 1, 3, 4, 3, 3};

        arr = bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubblesort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i == 0 || arr[i] != arr[i - 1])
            {
                temp[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }
}
