package Collections_Framework;

import Collections_Dsa.ArrayList.ArrayList;
import Collections_Dsa.ArrayList.Iterator;

public class StudentEncapDriver
{
    public static void main(String[] args)
    {
        ArrayList<StudentEncap>  arrayList = new ArrayList<>() ;
        arrayList.add(new StudentEncap("Sai", 86.73F,12)) ;
        arrayList.add(new StudentEncap("SaiRam", 56.73F,14)) ;
        arrayList.add(new StudentEncap("Akash", 43.37F,13)) ;
        arrayList.add(new StudentEncap("Shree", 74.23F,15)) ;
        arrayList.add(new StudentEncap("Yogesh", 43.23F,16)) ;
        arrayList.add(new StudentEncap("Ganesh", 53.25F,17)) ;

        Iterator<StudentEncap> iterator = arrayList.iterator() ;
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
