import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DistrictTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestDistrict {
    public void ReportingTest()
    {
        District i = new District("St Louis", );
        System.out.println(i.getDistrict());

        i.setDistrict("St Louis");
        System.out.println(i.getDistrict()); 
    }
}


/**
 * Tears down the test fixture.
 *
 * Called after every test case method.
 */

