package Array_Program;

public class MergeTwoArrays
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int arr[] = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr1.length; i++)
        {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++)
        {
            arr[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}