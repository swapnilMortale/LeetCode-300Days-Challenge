package LeetcodeProblems;

public class TwoSum
{
    public static void main(String[] args)
    {
            int[] arr = {1,4,5,7,9,5,2};
            int target = 7
                    ;

            int[] result = twoSum(arr,target);
            if (result != null )
            {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
                System.out.println("Numbers: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
            }
            else
            {
                System.out.println("No pair found.");
            }
    }

    public static int[] twoSum(int[] arr , int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] + arr[i+1] == target)
            {
                return new int[] {i, i+1};
            }
        }
        return null;
    }
}
