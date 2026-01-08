package Array_Program;

import java.util.Arrays;

public class BubbleSortAscending
{

    public static void main(String[] args)
    {
        int[] arr = {5,2,3,1};
        bubbleSortAscending(arr);
        System.out.println("bubble Sort Ascending Order : "+Arrays.toString(arr));
    }

    public static void bubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
