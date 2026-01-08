package Array_Program;

public class    ReturnIndexOfSecondMaxElement
{
    public static void main(String[] args)
    {
        int arr[] = {48, 7, 6, 6, 37, 5, 56, 89, 85, 19, 12};
        int index = secondMaxElementIndex(arr);
        int value = arr[index];

        System.out.println("Second Maximum element is " + value + " at index " + index);
    }

    public static int secondMaxElementIndex(int arr[])
    {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int maxIndex = -1, secondIndex = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max;
                secondIndex = maxIndex;

                max = arr[i];
                maxIndex = i;
            }
            else if (arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i];
                secondIndex = i;
            }
        }
        return secondIndex;
    }
}
