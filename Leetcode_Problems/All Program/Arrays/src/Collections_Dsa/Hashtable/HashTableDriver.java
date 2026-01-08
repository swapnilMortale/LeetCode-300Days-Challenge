package Collections_Dsa.Hashtable;
//import java.util.Set
public class HashTableDriver
{
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>() ;
        hashtable.put(1,"Pavan");
        hashtable.put(2,"Yogesh");
        hashtable.put(3,"sai");
        hashtable.put(4,"Pavan");
        hashtable.put(1,"Shreee");
        hashtable.put(1,"Seee");
        hashtable.put(1,"ajj");
        hashtable.put(1,"Sh");



        System.out.println(hashtable);

        hashtable.clear();
        System.out.println(hashtable);
    }
}
