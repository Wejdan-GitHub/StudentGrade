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
    
    
    /*
     *  Test Case #1
     *  Input < 95 >
     *  Expected output < A >
     */
    @Test
    public void testGetGrade1() {
        System.out.println("TC#1 for getGrade: Input< 95 >");
        int mark = 95;
        String expected = "A";
        String actual = StudentGrade.getGrade(mark);
        assertEquals(expected, actual);
    }
    
        
    /*
     *  Test Case #2
     *  Input < 85 >
     *  Expected output < B >
     */
    @Test
    public void testGetGrade2() {
        System.out.println("TC#2 for getGrade: Input< 85 >");
        int mark = 85;
        String expected = "B";
        String actual = StudentGrade.getGrade(mark);
        assertEquals(expected, actual);
    }
}
