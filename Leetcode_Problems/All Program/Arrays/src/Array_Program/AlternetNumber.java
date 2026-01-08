package Array_Program;

public class AlternetNumber
{
    public static void main(String[] args)
    {
        int arr[] = {21,434,64,34,3,2,5,3,6,8,98,8,0,0,3432,909,90,98,7,65,43,11,765,43,7,6,54,32,90,654,3};
        for (int i = 0; i < arr.length; i+= 2)
        {
            System.out.println(arr[i]);
        }
    }
}
