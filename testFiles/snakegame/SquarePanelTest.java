
package snakegame;

import java.awt.Color;
import static java.awt.Color.blue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquarePanelTest {
    
    public SquarePanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ChangeColor method, of class SquarePanel.
     */
    @Test
    public void testChangeColor() {
        System.out.println("ChangeColor");
        Color d = blue;
        SquarePanel instance = new SquarePanel(d);
        instance.ChangeColor(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
