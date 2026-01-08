package String_Program;

public class PasswordValidation
{
    public static void main(String[] args)
    {
        String password = "av42@Saavae2";

        if (isStrong(password))
        {
            System.out.println("Strong Password");
        } else
        {
            System.out.println("Weak Password");
        }
    }
    public static boolean isStrong(String str)
    {
        boolean isUppercase = false ,isLowercase = false , isDigit = false , isSpecial = false ;

        if (str.length() >= 8)
        {
            for (int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);

                if (ch >= 'A' && ch <= 'Z')
                {
                    isUppercase = true;
                }
                else if (ch >= 'a' && ch <= 'z')
                {
                    isLowercase = true;
                }
                else if (ch >= '0' && ch <= '9')
                {
                    isDigit = true;
                }
                else
                {
                    isSpecial = true;
                }
            }
        }
        return (isUppercase && isLowercase && isDigit && isSpecial);
    }
}
