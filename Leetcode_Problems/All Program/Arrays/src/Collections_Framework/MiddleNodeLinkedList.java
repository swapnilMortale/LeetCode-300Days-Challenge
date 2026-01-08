package Collections_Framework;
import java.util.LinkedList;

public  class MiddleNodeLinkedList
{

    public static void main(String[] args)
    {

        java.util.LinkedList<Object> linkedlist = new LinkedList<>() ;
        linkedlist.add(11);
        linkedlist.add("object");
        linkedlist.add("reverse");
        linkedlist.add(424);
        linkedlist.add('a');
        linkedlist.add(true);
        linkedlist.add(42.24f);

        System.out.println(linkedlist);

        for (int i = 0; i < linkedlist.size() / 2; i++)
        {

        }
        if (linkedlist.size() / 2 == 0)
        {
            System.out.println(linkedlist);
        }
    }
}