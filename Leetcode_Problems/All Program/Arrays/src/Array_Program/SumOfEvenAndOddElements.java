package Array_Program;

public class SumOfEvenAndOddElements
{
    public static void main(String[] args)
    {
        int[] arr = {436,43,42,19,6,5,3,4,6,4,2,0,3,3744,94,3,856,83875,652,2,2,72,77,2746,466,37,7,63,90};
        int evenSum= 0 , oddSum = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenSum += arr[i];
            }
            else
            {
                oddSum += arr[i];
            }
        }
        System.out.println("Even Number Additions : "+evenSum);
        System.out.println("Odd Number Additions : "+oddSum);
    }
}
