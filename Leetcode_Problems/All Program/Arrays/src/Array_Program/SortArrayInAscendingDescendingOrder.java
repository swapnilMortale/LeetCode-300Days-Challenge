package Array_Program;

public class SortArrayInAscendingDescendingOrder
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,4,545,6,67,87,8,22,99,7,96,4,34,2,2,8};


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nDescending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}