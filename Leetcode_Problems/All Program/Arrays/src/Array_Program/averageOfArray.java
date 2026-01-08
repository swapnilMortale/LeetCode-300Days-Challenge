package Array_Program;

public class averageOfArray
{
    public static void main(String[] args)
    {
        int arr[] = {12,33,34,4,67,8,8,7,6,5,4,20} ;
        int sum = 0 ;

        for (int i = 0; i < arr.length ; i++)
        {
            sum += arr[i] ;
        }
        double avg =  (double) sum / arr.length ;
        System.out.println(avg);
    }
}
