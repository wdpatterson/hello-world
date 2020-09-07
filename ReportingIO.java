import java.util.Scanner;
import java.util.ArrayList;
/**
 * Presents the user with a menu (printed to the console) of features:
 * enter District data
 * enter Incident data
 * provide reporting stats on highest value incident, 
 * highest incident ever reported
 * all incidents with value greater than a given amount; or exit

 * Takes user input from the console to choose one of the menu features
 * Allows the user to input, via the console, the details of districts
 * and incidents
 * After executing one of the features, returns the user to
 * the menu to choose another option
 */
public class ReportingIO
{
    // instance variables including menu to return to
    private static Reporting r = new Reporting(10, new ArrayList<District>());
    public static void main(String args[]){
        menu(); 
    }
    //Features for user to choose
    public static void menu() 
    {
        int selection;      
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter District Data");
        System.out.println("2 - Enter Incident Data");
        System.out.println("3 - Value Comparison");
        System.out.println("4 - Exit");

        selection = input.nextInt();
        
        //Gives user option to input district; return to menu
        if (selection == 1) 
        {
            System.out.println("District Name?");
            String dName;
            dName = input.next();
            r.getDistrict().add(new District(dName, new ArrayList<Incident>()));
            menu();
        }
       // User option for Value, Postcode, Month, Year
        if(selection == 2)
        {
            System.out.println("Value?");
            int aValue;
            aValue = input.nextInt();

            System.out.println("Postcode?");
            int aPostcode;
            aPostcode = input.nextInt();

            System.out.println("Month");
            String aMonth;
            aMonth = input.next();

            System.out.println("Year");
            int aYear;
            aYear = input.nextInt();

        }
        //User input option to input year and/or largest amount
        if(selection == 3)
        {
            System.out.println("Chosen Year?");
            int bYear;
            bYear = input.nextInt();

            System.out.println("Largest Amount?");
            int aLargestAmount;
            aLargestAmount = input.nextInt();
            System.out.println (r.getLargestValue());
            System.out.println (r.getLargestAverage(bYear));
            System.out.println (r.getGreaterList(aLargestAmount));
            menu();
        }   
        //exits user back to menu
        if(selection == 4)
        {
            System.out.println("Exit");
        }
    }

}
