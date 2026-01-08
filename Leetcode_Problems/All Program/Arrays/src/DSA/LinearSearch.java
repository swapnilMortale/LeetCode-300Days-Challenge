package DSA;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {98, 76, 34, 65, 21, 83, 34, 15};

        int result = linearSearch(arr, 21);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
