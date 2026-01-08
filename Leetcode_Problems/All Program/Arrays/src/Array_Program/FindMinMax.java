package Array_Program;

public class FindMinMax
{
    public static void main(String[] args)
    {
        int arr[] = {3, 8, 15, 2, 98,5, 10, 15, 30};
        int max = arr[0] ;
        int min = arr[0] ;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >  max)
            {
                max = arr[i] ;
            }
            if(arr[i] < min)
            {
                min = arr[i] ;
            }
        }
        System.out.println("maximum element in array : "+max);
        System.out.println("minimum element in array : "+min);
    }
}
