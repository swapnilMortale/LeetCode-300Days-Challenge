package Array_Program;

public class RemoveDuplicatesFromArray
{
    public static void main(String[] args)
    {
        int arr[] = {12,21,12,12, 3, 2, 42, -3, 30, 20, -3, -2, 30, 2, -2, 2, 0, 0, 34, -83, 34, 9, 345, 8, -3, -67, 323, 8, 7, 2, -54, 98, 7, 89, -23, 4, 76, 5, 3, -9};

        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            boolean duplicate = false ;
            for (int j = 0; j < i; j++)
            {
                if (arr[i] == arr[j])
                {
                    duplicate = true ;
                    break;
                }
            }
            if (!duplicate)
            {
              System.out.println(" "+arr[i]);
            }
        }
    }
}
