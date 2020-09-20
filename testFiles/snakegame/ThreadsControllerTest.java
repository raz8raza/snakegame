package snakegame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static snakegame.ThreadsController.directionSnake;


public class ThreadsControllerTest {
    
    public ThreadsControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        ThreadsController instance = new ThreadsController() ;
        instance.start();
    }
 
}
