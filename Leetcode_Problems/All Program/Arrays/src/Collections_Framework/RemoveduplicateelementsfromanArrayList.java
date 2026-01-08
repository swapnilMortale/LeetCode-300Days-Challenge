package Collections_Framework;

import Collections_Dsa.ArrayList.ArrayList;

import java.util.Scanner;

public class RemoveduplicateelementsfromanArrayList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        ArrayList<Object> list = new ArrayList<>() ;

        System.out.println("Enter a Size of List : ");
        int size = sc.nextInt() ;

        sc.nextLine();
        for (int i = 0; i < size ; i++)
        {
            System.out.print("Enter value " + (i + 1) + ": ");
            String value = sc.nextLine() ;
            list.add(value);
        }

        System.out.println("\nArrayList elements:");
        System.out.println(list);


    }
}
