
/**
 * Assess the previous day's stock prices and determine what would have been the 
 * best points to buy or sell
 * 
 * @author (John Zervos) 
 * @version (1.0 4/21/18)
 */
public class Main
{
    public Main()
{        
        int apple[] = {12,8,5,7,9,11}; // initialise instance variables        
        System.out.println ("Array is " + apple + " with a profit of " + profit(apple));
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int profit(int yesterday[])
    {
        int value;
        int min = yesterday[0];
        int max = 0;
        for (int y = 1; y < yesterday.length; y++)
        {
             if (yesterday[y] < min) min = yesterday[y];
             if ((yesterday[y] - min) > max) max = (yesterday[y] - min);
        }
        
        value = max;
        return value;
    }
}
