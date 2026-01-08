package Array_Program;

public class SumOfAllElements
{
    public static void main(String[] args)
    {
        int arr[] = {1,322,42,4,2,4,2,3,2,3,2424,43,98,5,35,35,35,53,53,553,34,25,54,45,34,24,};
        int sum = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of all elements in array : "+sum);
    }
}
