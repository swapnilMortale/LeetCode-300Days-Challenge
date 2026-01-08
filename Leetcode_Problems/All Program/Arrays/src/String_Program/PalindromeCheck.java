package String_Program;

public class PalindromeCheck
{
    public static void main(String[] args)
    {
        String str = "madam";
        if (isPalindrome(str))
        {
            System.out.println(str + " is a Palindrome");
        }
        else
        {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    public static boolean isPalindrome(String str)
    {
        String rev = "" ;

        for (int i = str.length() - 1; i >= 0 ; i--)
        {
            rev += str.charAt(i);
        }

        if (rev.equals(str))
        {
            return true ;
        }

        return false ;
    }
}
