package Array_Program;

public class CountPositiveNegative
{
    public static void main(String[] args)
    {
        int arr[] = {12, 3, 2, 42, -3, 30, 20, -3, -2, 30, 2, -2, 2, 0, 0, 34, -83, 34, 9, 345, 8, -3, -67, 323, 8, 7, 2, -54, 98, 7, 89, -23, 4, 76, 5, 3, -9};

        int pos = 0, neg = 0, zero = 0;

        System.out.print("All Positive numbers: ");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                System.out.print(arr[i]);
                pos++;
                // Add comma if it's not the last positive number
                if (i < arr.length - 1 && hasMorePositives(arr, i))
                {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(); // Move to next line

        System.out.print("All Negative numbers: ");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                System.out.print(arr[i]);
                neg++;
                // Add comma if it's not the last negative number
                if (i < arr.length - 1 && hasMoreNegatives(arr, i))
                {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(); // Move to next line

        // Count zeros
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                zero++;
            }
        }

        System.out.println("\n=== FINAL COUNT ===");
        System.out.println("Total Positive numbers: " + pos);
        System.out.println("Total Negative numbers: " + neg);
        System.out.println("Total Zero values: " + zero);
        System.out.println("Total numbers in array: " + arr.length);
    }

    // Helper method to check if there are more positive numbers ahead
    private static boolean hasMorePositives(int[] arr, int currentIndex)
    {
        for (int i = currentIndex + 1; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if there are more negative numbers ahead
    private static boolean hasMoreNegatives(int[] arr, int currentIndex)
    {
        for (int i = currentIndex + 1; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                return true;
            }
        }
        return false;
    }
}