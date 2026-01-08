package Array_Program;

public class FrequencyOfArrayElement
{
    public static void main(String[] args)
    {
        int arr[] = {12, 13, 4, 3, 5, 3, 5, 3, 73, 5, 57, 4, 7, 48, 7, 6, 6, 37, 5, 56, 89, 85, 19, 12};

        frequencyOfElement(arr);
    }

    public static void frequencyOfElement(int arr[])
    {
        int count[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (count[i] == 0)
            {
                int ct = 0;
                for (int j = i; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        ct++;
                        count[j] = -1;
                    }
                }
                count[i] = ct;
            }
        }
        System.out.println("Frequencies of all numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            if (count[i] != -1)
            {
                System.out.println(arr[i] + " occurs " + count[i] + " times");
            }
        }

        System.out.println("\nUnique numbers (occur only once):");
        for (int i = 0; i < arr.length; i++)
        {
            if (count[i] == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
