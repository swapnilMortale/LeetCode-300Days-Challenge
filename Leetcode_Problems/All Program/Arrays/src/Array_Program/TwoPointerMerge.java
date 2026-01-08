package Array_Program;

import java.util.Arrays;

public class TwoPointerMerge
{
    public static void main(String[] args)
    {
        int[] a = {0, 2, 7, 12, 23, 34, 45, 56, 67, 78, 88};
        int[] b = {2, 12, 47, 78, 90};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static int[] merge(int[] a, int[] b)
    {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];

        while (i < a.length && j < b.length)
        {
            ans[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        }

        while (i < a.length) ans[k++] = a[i++];
        while (j < b.length) ans[k++] = b[j++];

        return ans;
    }
}
