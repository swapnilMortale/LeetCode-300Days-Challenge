package String_Program;

public class ExtractString
{
    public static void main(String[] args)
    {
        String str = "Hello@123World!";
        isExtractString(str);
    }

    public static void isExtractString(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
