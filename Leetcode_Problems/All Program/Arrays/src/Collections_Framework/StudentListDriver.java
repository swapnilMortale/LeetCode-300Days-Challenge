package Collections_Framework;


import java.util.*;
public class StudentListDriver
{
    public static void main(String[] args)
    {
        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(new StudentList("Pavan",  "DCL", "CS", 'A', 88.5f, 1));
        arrayList.add(new StudentList("Yogesh", "DCL", "CS", 'D', 76.0f, 2));
        arrayList.add(new StudentList("Rohan",  "DCL", "IT", 'B', 67.5f, 3));
        arrayList.add(new StudentList("Sneha",  "DCL", "CS", 'A', 91.2f, 4));
        arrayList.add(new StudentList("Meera",  "DCL", "ME", 'C', 72.4f, 5));
        arrayList.add(new StudentList("Sohan",  "DCL", "EE", 'B', 81.6f, 6));
        arrayList.add(new StudentList("Karan",  "DCL", "CE", 'A', 69.0f, 7));
        arrayList.add(new StudentList("Asha",   "DCL", "CS", 'D', 74.9f, 8));
        arrayList.add(new StudentList("Raj",    "DCL", "IT", 'C', 57.3f, 9));
        arrayList.add(new StudentList("Komal",  "DCL", "CS", 'A', 95.0f, 10));

        // print one-by-one with separator line
        for (Object o : arrayList)
        {
            System.out.println("=================================================================================");
            System.out.println(o);
        }
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.get(7));

        System.out.println();


        Iterator<Object> stud  = arrayList.iterator() ;
        while (stud.hasNext())
        {
            System.out.println(stud.next());
        }
    }
}
