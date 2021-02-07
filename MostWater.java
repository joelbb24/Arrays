


public class MostWater
{
    public static void main(String [] args)
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }

    public static int mostWater(int[] height)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<height.length; i++)
        {
            for(int j=i+1; j<height.length; j++)
            {
                int min = Math.min(height[i], height[j]);
                max = Math.max(max, min * (j-i));
            }
        }

        return max;
    }

}
