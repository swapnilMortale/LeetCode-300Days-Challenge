package Array_Program;

public class HalfReversGivenArray
{
    public static void main(String[] args)
    {
        int arr[] = {12,3,4,56,7,89,9,1,2,3,4,9} ;
        for (int i = arr.length / 2; i >= 0; i--)
        {
                System.out.println(arr[i]);
        }
    }
}
