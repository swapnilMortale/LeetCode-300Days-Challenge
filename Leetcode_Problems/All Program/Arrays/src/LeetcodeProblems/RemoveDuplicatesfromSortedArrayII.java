package LeetcodeProblems;

public class RemoveDuplicatesfromSortedArrayII
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,2,2,3,3,3,3,3,4,5,5,5};

        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr)
    {
        int i = 0 ;
        for (int j = 0; j < arr.length-1; j++)
        {
            if (i < 2 || arr[j] != arr[i -2 ])
            {
                arr[i] = arr[j] ;
                i++ ;
            }
        }
        return i;
    }

}
