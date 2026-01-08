package String_Program;

public class MobileNumberValidations
{
    public static void main(String[] args)
    {
        String str = "8767649179" ;
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str)
    {
        if (str.length() != 10)
        {
            return false;
        }

        char firstDigit = str.charAt(0);
        if (firstDigit < '6' || firstDigit > '9')
        {
            return false;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
