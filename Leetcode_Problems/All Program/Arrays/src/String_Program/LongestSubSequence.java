package String_Program;

public class LongestSubSequence
{
    public static void main(String[] args)
    {
        String str = "aabbbccccddeee";
        System.out.println("Longest repeating subsequence: " + longestRepeatingSubsequence(str));
    }

    public static String longestRepeatingSubsequence(String str)
    {
        if (str == null || str.isEmpty())
            return "";

        int count = 1, max = 1;
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i - 1))
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if (count > max)
            {
                max = count;
                ch = str.charAt(i);
            }
        }

        return (ch + "").repeat(max);
    }
}
