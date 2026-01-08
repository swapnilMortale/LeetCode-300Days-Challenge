package String_Program;

public class ZigZagUpperLower
{
    public static void main(String[] args)
    {
        String str = "SSSSwWAUUUUUUUU";
        ZigZagUpperLower obj = new ZigZagUpperLower();
        String result = obj.zigZig(str);
        System.out.println("ZigZag Case: " + result);
    }

    public String zigZig(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (i % 2 == 0)
            {
                if (ch >= 'a' && ch <= 'z')
                    ch = (char)(ch - 32);
            }
            else
            {
                if (ch >= 'A' && ch <= 'Z')
                    ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }
}
