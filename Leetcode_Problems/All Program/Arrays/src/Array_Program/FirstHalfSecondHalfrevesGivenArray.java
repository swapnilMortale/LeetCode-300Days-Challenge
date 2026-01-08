package Array_Program;

public class FirstHalfSecondHalfrevesGivenArray
{
    public static void main(String[] args)
    {
        int arr[] = {13,3,4,5,6,7,89,90,7,5,5,4,22,3,345,9}    ;

        for (int i = 0; i < arr.length; i++)
        {
            if (i < arr.length / 2)
            {
                System.out.println(" "+arr[i]);
            }
            else
            {
                System.out.println(arr[arr.length - 1 - (i - arr.length / 2)]+" ");
            }
        }

    }
}
