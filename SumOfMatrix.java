

import java.util.*;

public class SumOfMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,0,1},{-8,9,-2}};
        int sum = 0;

        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum = sum + arr[i][j];
            }
        }

        System.out.println(sum);

    }
}
