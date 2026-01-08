package Array_Program;

public class SumOfAllSubarrays
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 5, 3, 2};
        sumSubArray(arr);
    }
    public  static void sumSubArray(int[] arr)
    {
        int n = arr.length;
        int total = 0;

        for (int i = 0; i < n; i++)
        {
            int sum = 0;

            for (int j = i; j < n; j++)
            {
                sum += arr[j];
                total += sum;
            }
        }

        System.out.println("Sum of all subarrays = " + total);
    }
}
