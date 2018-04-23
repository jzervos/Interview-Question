/**
 * Assess the previous day's stock prices and determine what would have been
 * the best points to buy or sell
 * 
 * @author (John Zervos
 * @version (1.2 4/22/18)
 */
public class Main
{
    public Main()
    {
        int apple[] = {12,8,5,7,9,11,6,10};
        System.out.println("Profit yesterday could have been $" + profit(apple));
    }
    
    public int profit(int yesterday[])
    {
        int value;
        value = sold(0, yesterday);
        return value;
    }
    
    // bought is called when you have purchased stock
    public int bought (int x, int yesterday[])
    {
        // base case
        if (x == (yesterday.length - 1)) // last value of array
            return yesterday[x];
            
        // recursion
        int holdStock, sellStock;
        holdStock = bought(x+1, yesterday);
        sellStock = sold(x+1, yesterday);
        
        if (sellStock <= holdStock) return (sellStock + yesterday[x]);
        return holdStock;
        
    }
    
    // sold is called when you do not have any stock
    public int sold (int x, int yesterday[])
    {
        // base case
        if (x == yesterday.length - 1) // last value of array
            return 0;
        
        // recursion
        int holdStock, buyStock;
        holdStock = sold(x+1, yesterday);
        buyStock = bought(x+1, yesterday); 
        
        if (buyStock >= holdStock) return (buyStock - yesterday[x]);
        return holdStock;
        
    }
}