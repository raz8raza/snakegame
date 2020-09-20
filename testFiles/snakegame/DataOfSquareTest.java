
package snakegame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataOfSquareTest {
    
    public DataOfSquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        System.out.println("lightMeUp");
        int c = 1;
        DataOfSquare instance = new DataOfSquare(c);
        instance.lightMeUp(c);
       
    }
}
