package String_Program;

public class LongestPalindrome
{
    public static void main(String[] args)
    {
        String str = "babad";
        System.out.println("Longest Palindromic Substring: " + toLongestPalindrome(str));
    }

    public static String toLongestPalindrome(String str)
    {

        String space = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (i < str.length() - 1)
            {
                space += str.charAt(i)+"_";
            }
            else
            {
                space += str.charAt(i);
            }
        }

        int i = 0, j = i, k = i;
        int max = 0;
        int start = 0, end = 0;

        while (i < space.length())
        {
            if (j >= 0 && k < space.length() && space.charAt(j) == space.charAt(k))
            {
                j--;
                k++;
            }
            else if (j >= 0 && k < space.length() && space.charAt(j) != space.charAt(k))
            {
                int diff = k - j ;
                if (diff >= max)
                {
                    max = diff ;
                    start = j+1;
                    end = k ;
                }
                i++;
                j = i ;
                k = i ;
            }
            else if (j < 0)
            {
                int diff = k - 0 ;
                if (diff >= max)
                {
                    max = diff ;
                    start = 0;
                    end = k ;
                }
                i++;
                j = i ;
                k = i ;
            }
            else if (k == space.length())
            {
                int diff = space.length() - j ;
                if(diff >= max)
                {
                    max = diff ;
                    start = j+1 ;
                    end = k ;
                }
                i++ ;
                j= i;
                k = i;
            }
        }
        String ans = space.substring(start,end);
        String result = "";
        for (int x = 0; x < ans.length(); x++)
        {
            if (space.charAt(x) == '_')
            {
                result += ans.charAt(x);
            }
        }
        return result;
    }
}