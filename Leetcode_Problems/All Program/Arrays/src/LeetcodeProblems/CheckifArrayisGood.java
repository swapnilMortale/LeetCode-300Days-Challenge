package LeetcodeProblems;

public class CheckifArrayisGood
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 3, 2,4,2} ;
        System.out.println(isGood(arr) +" ");
    }
    public static boolean isGood(int[] nums)
    {
        int n = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > n) n = nums[i];
        }

        if (nums.length != n + 1) return false;


        int[] count = new int[n + 1];


        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > n || nums[i] < 1) return false;
            count[nums[i]]++;
        }


        for (int i = 1; i < n; i++)
            {
            if (count[i] != 1) return false;
        }

        if (count[n] != 2) return false;

        return true;
    }
}
