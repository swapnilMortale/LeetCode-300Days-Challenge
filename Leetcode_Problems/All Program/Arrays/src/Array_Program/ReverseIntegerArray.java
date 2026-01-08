package Array_Program;

public class ReverseIntegerArray
{
    public static void main(String[] args)
    {
        int[] arr = {42,3,5,7,85,-9,17,97,-98} ;
        reverse(arr);

    }

    public  static void reverse(int[] arr)
    {
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max =arr[i] ;
            }
        }
        System.out.println(max);

    }
}
