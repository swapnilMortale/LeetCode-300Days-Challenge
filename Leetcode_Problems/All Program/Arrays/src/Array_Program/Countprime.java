package Array_Program;

public class Countprime
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int count = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            int num = arr[i] ;

            boolean isPrime = true ;

            if (num <= 1)
            {
                isPrime = false ;
            }
            else
            {
                for (int j = 2 ; j <=  num / 2 ; j++)
                {
                    if (num % j == 0)
                    {
                        isPrime = false ;
                        break;
                    }
                }
            }
            if (isPrime)
            {
                System.out.println(num+" ");
                count++ ;
            }

        }
        System.out.println("---------------");
        System.out.println(count);
    }
}
