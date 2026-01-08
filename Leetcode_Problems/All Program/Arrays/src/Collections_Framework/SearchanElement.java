package Collections_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchanElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(999);
        list.add(456);
        list.add(1000);
        list.add(9999);
        list.add(1234);
        list.add(10000);
        list.add(99999);
        list.add(55555);
        list.add(789);

        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search in given list: ");
        int num = sc.nextInt();

//        if (list.contains(num)) {
//            System.out.println("Number is present at position: " + list.indexOf(num));
//        } else {
//            System.out.println("Number not found in the list!");
//        }
        boolean found = false ;

        for (Integer ele : list)
        {
            if (ele == num )
            {
                found = true ;
                break;
            }
        }
        if (found) {
            System.out.println("Number is present in the list!");
        } else {
            System.out.println("Number not found in the list!");
        }

    }
}