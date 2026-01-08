package Array_Program;

import java.util.Arrays;

public class BinarySerch
{
    public static void main(String[] args)
    {
        int[] arr = {21, 423, 2, 34, 42, 2, 344, 0};
        int target = 21;

        BubbleSortAscending.bubbleSortAscending(arr);

        int result = search(arr, target);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Index of target (" + target + "): " + result);
    }

    public static int search(int[] nums, int target)
    {
        int start = 0, end = nums.length - 1 , mid = (start + end) / 2;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++)
//            {
//                if (nums[j] > nums[j + 1])
//                {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }

        while (start <= end)
        {


            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            } else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
