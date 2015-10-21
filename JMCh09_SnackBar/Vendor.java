import java.lang.reflect.*;


/**
 * This class implements a vendor that sells one kind of item. A vendor carries
 * out sales transactions.
 * 
 * @author Alex Xu
 * @version 9/28/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class Vendor
{
    // Fields
    private int itemPrice;

    private int itemStock;

    private int change;

    private int depositedMoney = 0;

    private static double totalSales = 0;

    /**
     * constructor for this class
     * 
     * @param price
     *            price of single item
     * @param items
     *            number of items to place in stock
     */
    public Vendor( int price, int items )
    {
        itemPrice = price;
        itemStock = items;
    }
    public static double getTotalSales()
    {
        double tempSales;
        tempSales = totalSales;
        totalSales = 0;
        return tempSales;
    }

    /**
     * sets the quantity of items
     * 
     * @param items
     *            number of items to place in stock
     */
    public void setStock( int items )
    {
        itemStock = items;
    }


    /**
     * returns the number of items in stock
     * 
     * @return number of items in stock
     */
    public int getStock()
    {
        return itemStock;
    }


    /**
     * adds amount of money to deposited amount
     * 
     * @param money
     *            number of cents to be added
     */
    public void addMoney( int money )
    {
        if (itemStock != 0)
        depositedMoney += money;
    }


    /**
     * returns the currently deposited amount in cents
     * 
     * @return number of cents in current deposit
     */
    public int getDeposit()
    {
        return depositedMoney;
    }


    /**
     * Implements a sale. If there are items in stock and // the deposited
     * amount is greater than or equal to // the single item price, then adjusts
     * the stock // and calculates and sets change and returns true; //
     * otherwise refunds the whole deposit (moves it into change) // and returns
     * false.
     * 
     * @return boolean successful sale (true) or failure (false)
     */
    public boolean makeSale()
    {
        if ( itemStock > 0 && depositedMoney >= itemPrice )
        {
            itemStock--;
            change = depositedMoney - itemPrice;
            depositedMoney = 0;
            totalSales += ((double)itemPrice)/100;
            return true;
        }
        else if (depositedMoney < itemPrice)
        {
            change = depositedMoney;
            depositedMoney = 0;
            return false;
        }
        else if (itemStock <= 0)
        {
            
            return false;
        }
        else
            return false;
    }



    /**
     * Returns and zeroes out the amount of change (from the last // sale or
     * refund).
     * 
     * @return number of cents in the current change
     */
    public int getChange()
    {
        return change;
    }


    /**
     * Intended only for debugging.
     * 
     * <p>
     * A generic toString implementation that uses reflection to print names and
     * values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     * </p>
     * 
     * @return a string representation of this Vendor.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }
}
