package String_Program;

import java.util.HashSet;

class LongestSubstring
{
    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abcd"));
    }
    public static int lengthOfLongestSubstring(String s)
    {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++)
        {
            HashSet<Character> hs = new HashSet<>();
            int currentLen = 0;

            for (int j = i; j < s.length(); j++)
            {
                char ch = s.charAt(j);

                if (hs.contains(ch))
                {
                    break;
                }
                else
                {
                    hs.add(ch);
                    currentLen++;
                }
                if (currentLen > maxLen)
                {
                    maxLen = currentLen;
                }
            }
        }

        return maxLen;
    }
}
