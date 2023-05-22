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
    
    
    /*
     *  Test Case #3
     *  Input < 55 >
     *  Expected output < F >
     */
    @Test
    public void testGetGrade3() {
        System.out.println("TC#3 for getGrade: Input< 55 >");
        int mark = 55;
        String expected = "F";
        String actual = StudentGrade.getGrade(mark);
        assertEquals(expected, actual);
    }   
    
    /*
     *  Test Case #4
     *  Input < 75 >
     *  Expected output < C >
     */
    @Test
    public void testGetGrade4() {
        System.out.println("TC#4 for getGrade: Input< 75 >");
        int mark = 75;
        String expected = "C";
        String actual = StudentGrade.getGrade(mark);
        assertEquals(expected, actual);
    } 
    
    /*
     *  Test Case #5
     *  Input < 65 >
     *  Expected output < D >
     */
    @Test
    public void testGetGrade5() {
        System.out.println("TC#5 for getGrade: Input< 65 >");
        int mark = 65;
        String expected = "D";
        String actual = StudentGrade.getGrade(mark);
        assertEquals(expected, actual);
    } 
}
