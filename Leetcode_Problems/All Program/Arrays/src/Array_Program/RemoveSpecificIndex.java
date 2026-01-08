package Array_Program;

import java.util.Arrays;

public class RemoveSpecificIndex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 57, 68, 79, 8, 65, 65, 90, 987, 869, 87, 987};

        System.out.println(Arrays.toString(removeSpecificElement(arr, 8)));
    }

    public static int[] removeSpecificElement(int arr[], int index)
    {
        if (index >= 0 && index < arr.length)
        {
            int ans[] = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++)
            {
                if (i != index)
                {
                    ans[j++] = arr[i];
                }
            }
            return ans; 
        }
        return arr;
    }
}
