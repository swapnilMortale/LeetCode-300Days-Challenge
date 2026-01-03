import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4} ;

        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public  static int removeDuplicates(int[] nums)
    {
        int i = 0 ;
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] != nums[i])
            {
                i++ ;
                nums[i] = nums[j] ;
            }
        }
        return i + 1 ;
    }
}
