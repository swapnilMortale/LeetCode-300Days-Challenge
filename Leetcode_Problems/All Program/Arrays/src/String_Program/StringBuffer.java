package String_Program;

public class StringBuffer
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("SWApnil");
        System.out.println(sb.append(42));
        System.out.println(sb.reverse());
        System.out.println(sb.append(678.0987));
        System.out.println(sb.appendCodePoint(9));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.reverse());
        System.out.println(sb.repeat(2,3));
        System.out.println(sb.delete(1,2));
    }
}
