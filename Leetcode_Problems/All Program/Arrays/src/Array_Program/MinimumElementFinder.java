package Array_Program;

public class MinimumElementFinder
{
    public static void main(String[] args)
    {
        int arr[] = {13, 3, 4, 5, 6, 7, 89, 90, 7, 5, 5, 4, 22, 3, 345, 9};
        System.out.println("Minimum element is: " + minimumElement(arr));
    }

    public static int minimumElement(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) {

            }
        }
        return min;
    }
}
