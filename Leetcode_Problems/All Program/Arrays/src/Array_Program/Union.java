package Array_Program;

import java.util.Arrays;

public class Union
{
    public static void main(String[] args)
    {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {30, 40, 50, 60, 70};

        System.out.println(Arrays.toString(unionSet(arr1, arr2)));
    }

    public static int[] unionSet(int[] arr1 , int[] arr2)
    {
        boolean[] check = new boolean[arr2.length];
        int ct = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j]) {
                    ct++;
                    check[j] = true;
                }
            }
        }

        int[] ans = new int[arr1.length + (arr2.length - ct)];

        for (int i = 0; i < arr1.length; i++)
        {
            ans[i] = arr1[i];
        }

        int k = arr1.length;
        for (int j = 0; j < arr2.length; j++)
        {
            if (!check[j])
            {
                ans[k++] = arr2[j];
            }
        }

        return ans;
    }
}
