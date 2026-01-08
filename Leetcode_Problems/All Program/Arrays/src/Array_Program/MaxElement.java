package Array_Program;

public class MaxElement
{
        public static void main(String[] args)
        {
            int arr[] = {1, 3, 2, 4, 57, 68, 79, 8, 65, 65, 90, 987, 90, 98, 856, 78, 789, 8789, 87, 70, 988, 869, 87, 987};

            int max = arr[0];

            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }

            System.out.println("Maximum element in the array is: " + max);
        }
}
