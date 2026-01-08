package LeetcodeProblems;
import Array_Program.BubbleSort;


public class LongestConsecutiveSequence
{
    public static void main(String[] args)
    {
        int[] arr = {398,6671793,80906,21041,32861,22284,16161,23619,17492,4383,34103,55668,62086,3355,71041,1188,10824,98761,78288,45260,18343,49499,73947,90254,6116,79622,74452,83698,19951,35025,254,4370} ;

        System.out.println(longestConsecutive(arr)+" .................");
    }
    public static int longestConsecutive(int[] nums)
    {
        if (nums.length == 0) return 0;

        // Manual bubble sort (simple and clear)
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = 0; j < nums.length - 1 - i; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        int count = 1;
        int maxCount = 1;

        // Find longest consecutive sequence
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                continue; // skip duplicates
            }
            else if (nums[i] == nums[i - 1] + 1)
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if (count > maxCount)
            {
                maxCount = count;
            }
        }

        return maxCount;
    }
}
