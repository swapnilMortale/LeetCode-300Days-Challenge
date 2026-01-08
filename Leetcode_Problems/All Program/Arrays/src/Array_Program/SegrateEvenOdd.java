package Array_Program;

import java.util.Arrays;

public class SegrateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0};
        segrate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segrate(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j)
        {

            while (i < j && arr[i] % 2 == 0)
            {
                i++;
            }


            while (i < j && arr[j] % 2 != 0)
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
