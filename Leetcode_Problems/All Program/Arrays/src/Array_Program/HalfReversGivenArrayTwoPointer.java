package Array_Program;

public class HalfReversGivenArrayTwoPointer
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,34,5,56,7,8,4,90,9,7,65,4,4,12};


        int start = 0, end = arr.length - 1;


        for (int i=0; i<arr.length; i++)
        {
            if (i<= arr.length / 2)
            {
                System.out.println(arr[start]);
                start++;
            } else
            {
                System.out.println(arr[end]);
                end--;
            }
        }

//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[])
    {
        for (int i = arr.length / 2, j = arr.length - 1; i < j; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
