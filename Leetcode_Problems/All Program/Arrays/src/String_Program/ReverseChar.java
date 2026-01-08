package String_Program;



public class ReverseChar
{
    public static void main(String[] args)
    {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
        System.out.print("Reversed: ");
        for (char c : ch) {
            System.out.print(c);
        }
    }
    public static void reverseString(char[] s)
    {
        int left = 0 , right = s.length-1 ;
        while (left < right)
        {
            char  temp = s[left] ;
            s[left] = s[right] ;
            s[right] = temp ;
            left++;
            right-- ;
        }

    }
}
