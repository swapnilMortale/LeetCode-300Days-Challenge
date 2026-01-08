package String_Program;
public class ReversString
{
    public static void main(String[] args)
    {
        String str = "Hello@123World!";

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " +isRevers(str));
    }
    public static String isRevers(String str)
    {
        String rev = "" ;
        for (int i = str.length() - 1 ; i >= 0; i--)
        {
            rev += str.charAt(i) ;
        }
        return rev ;
    }
}
