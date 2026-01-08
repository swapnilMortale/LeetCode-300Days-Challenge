package String_Program;

class Anagram
{
    public static void main(String[] args)
    {
        String str1 = "allergy";
        String str2 = "allergy";

        if (isAnagram(str1, str2))
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are NOT Anagram");
    }

    public static boolean isAnagram(String str1, String str2)
    {

        if (str1.length() != str2.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++)
        {
            char ch = str2.charAt(i);
            count[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++)
        {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
}
