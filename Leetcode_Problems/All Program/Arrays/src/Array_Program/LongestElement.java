package Array_Program;

public class LongestElement
{
    public static void main(String[] args)
    {
        int[] arr = {-876, -97, -55, 9, 4, 4,4 , 4,4, 5,45, 6, 67, 87, 8, 22, 9, -9, -9, -8, -1, 4, 6, 7, 68, 80};

        continueLongestElement(arr);
    }

    public static void continueLongestElement(int[] arr)
    {
        int maxCount = 0 ;
        int maxElement = arr[0] ;
        int count = 1 ;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++ ;
            }
            else
            {
                if (count > maxElement)
                {
                    maxCount = count;
                    maxElement = arr[i];
                }
                count = 1 ;
            }
        }
        System.out.println("Element with longest occurrence: " + maxElement);
    }
}
