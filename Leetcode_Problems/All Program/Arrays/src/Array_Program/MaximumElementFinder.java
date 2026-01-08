package Array_Program;

public class MaximumElementFinder
{
    public static void main(String[] args)
    {
        int arr[] = {13, 3, 4, 5, 6, 7, 89, 90, 7, 5, 5, 4, 22, 3, 345, 9};
        System.out.println("Maximum element is: " + maximumElement(arr));
    }

    public static int maximumElement(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
