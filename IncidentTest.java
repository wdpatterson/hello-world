

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IncidentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IncidentTest
{
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    /*public static void main(String[] args)
    {
        System.out.println("test");
        Incident i = new Incident(23, 10, "Jan", 2018);
        System.out.println(i.getPostcode());
        System.out.println(i.getValue());
        
        i.setValue(34);
        System.out.println(i.getValue());
        
    }*/

    @Test
    public void testPostcode()
    {
        Incident i = new Incident(23, 10, "Jan", 2018);
        System.out.println(i.getPostcode());
        
        i.setValue(34);
        System.out.println(i.getPostcode());
    }
}

