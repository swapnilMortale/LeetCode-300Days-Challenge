package Array_Program;

public class CheckPailndrom
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,1} ;
        checkPalindrome(arr) ;
    }

    public static boolean checkPalindrome(int[] arr)
    {
        int i = 0 , j = arr.length - 1 ;
        for (; i < j ; i++ , j--)
        {
            if (arr[i] != arr[j])
            {
                return false ;
            }
        }
        return true ;
    }
}
