

public class Wave
{
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5};
        int[] res = makeWave(arr);
        for(int i: res)
            System.out.print(i+" ");
    }


    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static int[] makeWave(int[] arr)
    {
        for(int i=0; i<arr.length-1; i=i+2)
        {
            swap(arr, i, i+1);
        }

        return arr;
    }

}