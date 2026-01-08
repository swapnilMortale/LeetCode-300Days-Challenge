package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods
{
    public static void main(String[] args)
    {
        List<String> student = new ArrayList<>();
        //add() element in List
        student.add("Riya");
        student.add("Amit");
        student.add("Priya");
        student.addFirst("Mr.");
        student.addLast(".......!!!");

        student.add(1,"Mortale");
        student.add(2,"Swapnil");
        student.add(3,"Vainkatrao");


        System.out.println("After Adding Student in List : \n"+student);
        System.out.println("-----*******************************************************-----");

        //Get() Get element by index
        System.out.println("Get Element By id in The List Second place : "+student.get(2));
        System.out.println("-----********************************************************-----");

        //set()  Change (update) element at index
        student.set(4,"from pune ");
        System.out.println("After updating index 4: " + student);
        System.out.println("-----******************************************************-----");

        //remove() By name and index
        student.remove(5);
        System.out.println("After removing index 5: " + student);
        student.remove("Priya");
        System.out.println("After removing 'Priya': " + student);

        System.out.println("-----******************************************************-----");

        //Check if list contains an element
        System.out.println("\"Contains 'Riya'? \""+student.contains("Riya"));
        System.out.println("\"Contains 'Mr.'? \""+student.contains("Mr."));

        System.out.println("-----******************************************************-----");

        //Find size of list
        System.out.println("Total student[] List length :"+student.size());

        System.out.println("-----******************************************************-----");


        // Iterate using for loop
        for(String s : student)
        {
            System.out.println(s);
        }

        System.out.println("-----******************************************************-----");

        //Iterate using Iterator
        Iterator<String> it = student.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("-----******************************************************-----");
        //Check if list is empty
        System.out.println(student.isEmpty());

        System.out.println("-----******************************************************-----");
        student.clear();


        System.out.println();

        Iterator<String> ii =  student.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
