package Array_Program;
import java.util.Arrays;

public class RightShift
{
    public static void main(String[] args)
    {
        int[] arr = {1,23,4,55,6,7,8,9} ;
        rightShiftElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void rightShiftElement(int[] arr)
    {
        int last = arr[arr.length - 1] ;
        for (int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1 ];
        }
        arr[0] = last ;
    }
}