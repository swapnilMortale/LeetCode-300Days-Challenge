package Array_Program;


public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 5, 32, 3, 5, 2, 4, 3, 3};
        removeDuplicateElemrnt(arr);
    }
    public static void removeDuplicateElemrnt(int[] arr)
    {
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
