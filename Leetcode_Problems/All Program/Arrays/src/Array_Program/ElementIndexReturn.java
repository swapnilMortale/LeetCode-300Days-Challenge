package Array_Program;

import java.util.Scanner;

public class ElementIndexReturn
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
         int arr[] = {1,2,3,4,4,545,6,67,87,8,22,99,7,96,4,34,2,2,8};
        System.out.println("Enter a Element To serch and retur a Index of element :");
        int target = sc.nextInt() ;
        boolean isfind = false ;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                System.out.println(i);
            }
        }
    }
}
