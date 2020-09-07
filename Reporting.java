import java.util.ArrayList;
/**
 * Reporting class holds info about all districts
 */
public class Reporting
{
    // Highest Value variable and District Arraylist
    private int highestvalue;
    private ArrayList<District> district; 
    public Reporting(int hValue, ArrayList<District> d){
    this.highestvalue = hValue;
    this.district = d;
    }
    
    /**
     * Constructor for objects of class Reporting
     * Returns district name
     */
    public ArrayList<District> getDistrict()
    {
        return district;
    }

    public void setDistrict (ArrayList district){
        this.district = district;
    }

    /**
     * Methods to return: The district with the largest average value 
     * incident for a given year.
     */
    public double getLargestAverage(int year) {
        double largestAverage = 0;
        if(!district.isEmpty()) {
            for (int i = 0; i < district.size(); i++ ) {
                if (district.get(i).getAverage(year) > largestAverage){
                    largestAverage = district.get(i).getAverage(year);
                }
            }
        }
        return largestAverage;
    }
    //The largest value incident ever recorded.
    public double getLargestValue()
    {
        double largestValue = 0;
        for (int i = 0; i < district.size(); i++ ) {
            if (district.get(i).getHighest() > largestValue)
                largestValue = district.get(i).getHighest();
        }
        return largestValue;
    }

    /**
     * A list of all incidents recorded with value greater 
     * than a given amount of money.
     */
    public ArrayList<Incident> getGreaterList(int amount)
    {
        ArrayList<Incident> greatestList = new ArrayList<Incident>();
        {
            for (int i = 0; i < district.size(); i++ ) {
                greatestList.addAll(district.get(i).getGreaterValue(amount));
            }
            return greatestList;
        }  

    }
}
