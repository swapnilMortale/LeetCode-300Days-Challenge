package String_Program;

public class CountUpperLowerDigitSpecial
{
    public static void main(String[] args)
    {
        String str = "Hello@123World!";
        isCount(str);
    }

    public static void isCount(String str)
    {
        int[] ct = new int[4]; // [0]=Upper, [1]=Lower, [2]=Digit, [3]=Special

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
            {
                ct[0]++;
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                ct[1]++;
            }
            else if (ch >= '0' && ch <= '9')
            {
                ct[2]++;
            }
            else
            {
                ct[3]++;
            }
        }

        System.out.println("Uppercase letters: " + ct[0]);
        System.out.println("Lowercase letters: " + ct[1]);
        System.out.println("Digits: " + ct[2]);
        System.out.println("Special characters: " + ct[3]);
    }
}
