

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ReportingTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ReportingTest
{
    /**
     * Default constructor for test class ReportingTest
     */
    public ReportingTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void ReportingTest()
    {
        District i = new District("St Louis", );
        System.out.println(i.getDistrict());

        i.setDistrict("St Louis");
        System.out.println(i.getDistrict()); 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
