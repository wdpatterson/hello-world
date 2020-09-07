import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ReportingIOTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ReportingIOTest
{
    // instance variables including menu to return to
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
           
            menu();
        }   
        //exits user back to menu
        if(selection == 4)
        {
            System.out.println("Exit");
        }
    }
}
