

public class AddOne
{
    public static void main(String [] args)
    {
        int[] arr = {9,9,9};
        int n = arr.length;
        int[] res = addOne(arr,n);
        for(int ar : res)
            System.out.print(ar + " ");

    }

    public static int[] addOne(int[] arr,int n)
    {
         

        if(arr[n-1]<9)
            arr[n-1] = arr[n-1] + 1;

        else
        {

            arr[n-1] = 0;
            addOne(arr,n-1);
        }

        return arr;
    }
}    
            
            


