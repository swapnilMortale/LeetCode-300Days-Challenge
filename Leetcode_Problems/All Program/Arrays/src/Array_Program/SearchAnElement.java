package Array_Program;

import java.util.Scanner;

public class SearchAnElement
{
    public static void main(String[] args)
    {
        int arr[] = {5, 10, 15, 20, 25};
        System.out.println("Enter a target to serch :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
        { 
            if (arr[i] == target)
            {
                found = true;
                break;
            }
        }
        if (found) System.out.println(target + " found");
        else System.out.println(target + " not found ! ");
    }
}
