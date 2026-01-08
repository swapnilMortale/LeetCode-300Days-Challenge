package Array_Program;

public class CopyOneArrayIntoAnother
{
    public static void main(String[] args)
    {
        int arr1[] = {10, 20, 30, 40};
        int arr2[] = new int[arr1.length] ;

        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i] ;
        }

        for (int x : arr2)
        {
            System.out.println(x+" ");
        }
    }
}
