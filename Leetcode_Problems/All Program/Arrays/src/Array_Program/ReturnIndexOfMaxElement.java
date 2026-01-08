package Array_Program;

public class ReturnIndexOfMaxElement
{
    public static void main(String[] args)
    {
        int arr[] = {48, 7, 6, 6, 37, 5, 56, 89, 85, 19, 12};
        int index = maxElementIndex(arr);
        int value = arr[index];

        System.out.println("Maximum element is " + value + " at index " + index);
    }

    public static int maxElementIndex(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
