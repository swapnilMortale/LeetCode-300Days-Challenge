package Collections_Framework;




public class LinkedList
{
    class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data ;
            this.next = null ;
        }
    }
    Node head ;
    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList()
    {
        Node temp = head ;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Singly LinkedList:");
        list.printList();
    }

}
