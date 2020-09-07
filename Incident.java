
/**
 *This class represents the various burglaries
 */
public class Incident
{
    // instance variables - replace the example below with your own
    private int value;
    private int postcode;
    private String month;
    private int year;
    /**
     * Constructor for objects of class Incident
     */
    public Incident(int value, int postcode, String month, int year)
    {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }

    /**
     * Method for returning incidents based on different variable
     */
    public int getPostcode()
    {
        return postcode;
    }

    public int getValue()
    {
        return value;
    }

    public String getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }
    /**
     * Methods for setting incidents
     */
    public void setValue(int value){
        this.value = value;
    }

    public void setPostcode(int postcode){
        this.postcode = postcode;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

}