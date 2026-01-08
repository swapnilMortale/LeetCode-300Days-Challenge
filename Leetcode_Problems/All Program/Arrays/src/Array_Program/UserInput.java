package Array_Program;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a size of array : ");
        int size = sc.nextInt() ;
        int arr[] = new int[size];


        System.out.println("Enter a " +size+ "  array : ");

        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter "+i+"index Array :");
            arr[i] = sc.nextInt() ;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(+arr[i]);
        }

    }
}
