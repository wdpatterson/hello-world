import java.util.ArrayList;
/**
 * The District class stores and retrieves names of the local districts
 * Lists burglary incidents
 */
public class District
{
    // ArrayList variable and string district variable
    private ArrayList<Incident> incident;
    private String district;
    /**
     * Constructor for objects of class District
     */
    public District(String district, ArrayList<Incident> incident)
    {
        this.district = district;
        this.incident = incident;
    }
    // Method for returning districts.
    public String getDistrict()
    {
        return district;
    }

    public void setDistrict (String district){
        this.district = district;
    }

    //Method that returns incident with highest value recorded in the district
    public double getHighest()
    {
        double highestValue = 0;
        for (int i = 0; i < incident.size(); i++ ) {
            if (incident.get(i).getValue() > highestValue)
                highestValue = incident.get(i).getValue();
        }
        return highestValue;
    }
    //Returns average incident value in district in a given year
    public double getAverage(int year) {
        int sum = 0;
        int valueofIncident = 0;
        if(!incident.isEmpty()) {
            for (int i = 0; i < incident.size(); i++ ) {
                if(incident.get(i).getYear()== year){
                    sum += incident.get(i).getValue();
                    valueofIncident++; 
                }
            }
            return sum/ valueofIncident;
        }
        return sum;
    }
    /**
     * Returns list of incidents in the district with value greater than 
     * user input amount of money
     */ 
    public ArrayList<Incident> getGreaterValue(int amount)
    {
        ArrayList<Incident> greaterList = new ArrayList<Incident>();
        if(!incident.isEmpty()) {
            for (int i = 0; i < incident.size(); i++ ) {
                if (incident.get(i).getValue() > amount)
                {
                    greaterList.add(incident.get(i));
                }
              }
        }
        return greaterList;
    }
}
    

