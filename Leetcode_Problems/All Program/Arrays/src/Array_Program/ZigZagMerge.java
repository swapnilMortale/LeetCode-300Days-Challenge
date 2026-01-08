package Array_Program;

import java.util.Arrays;

public class ZigZagMerge {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 32, 45, 75, 75, 7, 57, 878, 99, 9, 45, 67, 8, 6, 75, 7, 90};
        int arr2[] = {5, 6, 7, 8, 1, 2, 3, 4, 32, 45, 75, 75, 7, 8, 99, 9, 45, 6};

        int arr[] = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0; i < arr1.length || j < arr2.length; ) {
            if (i < arr1.length)
            {
                arr[i + j] = arr1[i];
                i++;
            }
            if (j < arr2.length)
            {
                arr[i + j] = arr2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
