package StudentGrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/* 
 * Test class for Grade class.
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
        System.out.println("calling constructor()");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("calling setUpClass()");
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.println("calling tearDownClass()");
    }
    
    @Before
    public void setUp() {
         System.out.println("calling setUp()");
    }
    
    @After
    public void tearDown() {
          System.out.println("calling tearDown()");
    } 
}
