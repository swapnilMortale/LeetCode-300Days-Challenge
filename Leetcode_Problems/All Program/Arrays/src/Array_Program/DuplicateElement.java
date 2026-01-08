package Array_Program;

public class DuplicateElement
{
    public static void main(String[] args)
    {
        int arr[] = {12,13,4,3,5,3,5,3,73,5,57,4,7,48,7,6,6, 37,5,56,89,85,19,12} ;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1 ; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

}