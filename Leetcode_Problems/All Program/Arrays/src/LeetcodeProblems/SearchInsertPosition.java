package LeetcodeProblems;

public class SearchInsertPosition
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 6));  // Output: 3
    }

    public static int searchInsert(int[] arr, int target)
    {
        int start = 0, end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2; // avoids overflow
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return start; // position to insert
    }
}
