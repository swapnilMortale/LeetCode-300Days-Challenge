package Array_Program;

public class SecondLargestElement
{
    public static void main(String[] args)
    {
        float arr[] = {12.1f, 23.2f, 24.9f, 86.322f, 1f, 32.3f};

        float largest = arr[0];
        float secondLargest = arr[0];

        // Find largest number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find second largest number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        // Print results
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nLargest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}

