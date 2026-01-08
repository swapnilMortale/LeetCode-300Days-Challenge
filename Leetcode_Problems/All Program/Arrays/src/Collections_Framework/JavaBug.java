package Collections_Framework;

public class JavaBug
{
    public static void main(String[] args)
    {
        String s1 = "FB" ;
        String s2 = "Ea" ;

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
