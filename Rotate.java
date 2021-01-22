public class Rotate
{
    public static int[] leftRotateByOne(int[] arr, int n)
    {
        int temp = arr[0];
        for(int i=1;i<n;i++)
            arr[i-1] = arr[i];
        
        arr[n-1] = temp; 
        
        return arr;
    }

    public static int[] leftRotateByD(int[] arr, int n, int d)
    {
        int[] temp = arr;
        while(d>0)
        {
            temp = leftRotateByOne(arr, n);
            d--;
        }
        return temp;
    }

    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 2;
        int[] result = leftRotateByD(arr, n, d);
        for(int i:result)
            System.out.print(i+" ");
    }
}