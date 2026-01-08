package String_Program;

public class RotateString
{
    public static void main(String[] args)
    {
        String str = "abcde";
        String goal = "cdeab" ;
        System.out.println(rotateString(str,goal));
    }
    public static boolean rotateString(String str , String goal)
    {
        if (str.length() != goal.length())
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++)
        {
            String rotate = str.substring(i) +str.substring(0,i);
            if (rotate.equals(goal))
            {
                return true;
            }
        }
        return  false;
    }
}
