package String_Program;

public class SortChar
{
    public static void main(String[] args)
    {
        String str = "Getting job Next 30 days !" ;
        System.out.println(toSort(str));
    }

    public static String toSort(String str)
    {
        int[] count = new int[127];

        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }

        String ans = "";

        for (int i = 0; i < count.length; i++)
        {
            if (count[i] > 0)
            {
                ans += (((char)i) + "").repeat(count[i]);
            }
        }

        return ans;
    }
}
