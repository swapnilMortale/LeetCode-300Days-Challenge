package String_Program;

public class NonRepeatingCharacter
{
    public static void main(String[] args)
    {
        String s = "racecar";
        System.out.println(nonRepeting(s));
    }

    public static char nonRepeting(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            boolean found = false ;

            for (int j = 0; j < str.length(); j++)
            {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    found = true ;
                    break;
                }
            }
            if (!found)
                return str.charAt(i);
        }
        return '$' ;
    }
}
