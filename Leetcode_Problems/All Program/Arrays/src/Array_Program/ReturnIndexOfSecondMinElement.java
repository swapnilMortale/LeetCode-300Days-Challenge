package Array_Program;

public class ReturnIndexOfSecondMinElement
{
    public static void main(String[] args)
    {
        int arr[] = {48, 7, 6, 6, 37, 5, 56, 89, 85, 19, 12};
        int index = secondMinElementIndex(arr);
        int value = arr[index];

        System.out.println("Second Minimum element is " + value + " at index " + index);
    }

    public static int secondMinElementIndex(int arr[])
    {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int minIndex = -1, secondIndex = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) {

                secondMin = min;
                secondIndex = minIndex;

                min = arr[i];
                minIndex = i;
            }
            else if (arr[i] < secondMin && arr[i] != min)
            {
                secondMin = arr[i];
                secondIndex = i;
            }
        }
        return secondIndex;
    }
}
