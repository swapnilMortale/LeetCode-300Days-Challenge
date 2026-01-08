package Array_Program;

public class ReturnIndexOfMinElement
{
    public static void main(String[] args)
    {
        int arr[] = {48, 7, 6, 6, 37, 5, 56, 89, 85, 19, 12};
        int index = minElementIndex(arr);
        int value = arr[index];

        System.out.println("Minumin element is " + value + " at index " + index);
    }
    public static int minElementIndex(int arr[])
    {
        int min = Integer.MAX_VALUE;
        int minIndex = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i] ;
                minIndex = i ;
            }
        }
        return minIndex ;
    }
}
