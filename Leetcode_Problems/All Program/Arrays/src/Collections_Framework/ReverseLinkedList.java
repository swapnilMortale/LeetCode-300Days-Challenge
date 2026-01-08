package Collections_Framework;


import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Object> linkedlist = new LinkedList<>() ;
        linkedlist.add(11);
        linkedlist.add("object");
        linkedlist.add("reverse");
        linkedlist.add(424);
        linkedlist.add('a');
        linkedlist.add(true);
        linkedlist.add(42.24f);

        System.out.println(linkedlist);
        ListIterator<Object> listIterator = linkedlist.listIterator(linkedlist.size()) ;
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
