


public class MaxDifference
{
    public static int maxDifference(int[] arr)
    {
        int res = arr[1] - arr[0];
        int minVal = arr[0];


        for(int j=1 ; j<arr.length ; j++)
        {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }

        return res;
    }

    public static void main(String [] args)
    {
        int[] arr = {2,4,10,3,1};
        System.out.println(maxDifference(arr));
    }
}
