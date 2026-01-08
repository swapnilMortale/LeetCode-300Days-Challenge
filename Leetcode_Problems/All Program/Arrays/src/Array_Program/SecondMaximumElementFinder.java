package Array_Program;

public class SecondMaximumElementFinder
{
    public static void main(String[] args)
    {
        int arr[] = {13, 3, 4, 5, 6,3,13,4,3,6,4,3,12,13, 7, 89, 99, 7, 5, 5, 4, 22, 3, 90, 9};
        System.out.println("Second Maximum Element : "+secondMaximumElement(arr));
    }

    public  static int secondMaximumElement(int arr[])
    {
        int max = Integer.MIN_VALUE , secondMax = Integer.MIN_VALUE ;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max ;
                max = arr[i] ;
            } else if (arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i] ;
            }
        }
        return secondMax;

    }
}
