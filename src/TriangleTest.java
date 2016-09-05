/*
 * JUnit test for the Triangle class
 * This class works inside Netbeans -- See JUnit documentation for more info
 * http://www.junit.org/
 */
// package junitexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dfleck
 */
public class TriangleTest {
    // Create a new Triangle
    public TriangleTest() {
    }

    @BeforeClass
    public static void initClass() throws Exception {
        System.out.println("\nINIT CLASS RUNNING -- Nothing to do though");
    }

    @AfterClass
    public static void destroyClass() throws Exception {
        System.out.println("\nDESTROY CLASS RUNNING -- Nothing to do though");
    }

    @Before
    public void initCode() {
        System.out.println("\nINIT CODE IS RUNNING -- Nothing to do though");
    }

    @After
    public void destroyCode() {
        System.out.println("DESTROY CODE IS RUNNING -- Nothing to do though");
    }

    @Test
    public void checkScaleneA() {
        System.out.println("Checking Scalene A");

        Triangle instance = new Triangle("30", "40", "60");
        String expResult = "Scalene";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkScaleneB() {
        System.out.println("Checking Scalene B");

        Triangle instance = new Triangle("30", "60", "40");
        String expResult = "Scalene";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkScaleneC() {
        System.out.println("Checking Scalene C");

        Triangle instance = new Triangle("60", "30", "40");
        String expResult = "Scalene";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkEquilateral() {
        System.out.println("Checking Equilateral");
        Triangle instance = new Triangle("1", "1", "1");
        String expResult = "Equilateral";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesA() {
        System.out.println("Checking Isoceles A");
        Triangle instance = new Triangle("30", "30", "40");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesB() {
        System.out.println("Checking Isoceles B");
        Triangle instance = new Triangle("30", "40", "30");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesC() {
        System.out.println("Checking Isoceles C");
        Triangle instance = new Triangle("40", "30", "30");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesD() {
        System.out.println("Checking Isoceles D");
        Triangle instance = new Triangle("40", "40", "30");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesE() {
        System.out.println("Checking Isoceles E");
        Triangle instance = new Triangle("40", "30", "40");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkIsocelesF() {
        System.out.println("Checking Isoceles F");
        Triangle instance = new Triangle("30", "40", "40");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkRightAngledA() {
        System.out.println("Checking Right Angled A");
        Triangle instance = new Triangle("3", "4", "5");
        String expResult = "Right Angled";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkRightAngledB() {
        System.out.println("Checking Right Angled B");
        Triangle instance = new Triangle("3", "5", "4");
        String expResult = "Right Angled";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkRightAngledC() {
        System.out.println("Checking Right Angled C");
        Triangle instance = new Triangle("5", "4", "3");
        String expResult = "Right Angled";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkGiantTriangle() {
        System.out.println("Checking Giant Triangle");
        Triangle instance = new Triangle("3000000", "4000000", "3000000");
        String expResult = "I feel your triangle is too big\n";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkInvalidTriangleA() {
        System.out.println("Checking Invalid Triangle A");
        Triangle instance1 = new Triangle("3", "4", "8");
        String expResult = "The lengths of the triangles do not form a valid triangle!\n";
        String result = instance1.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkInvalidTriangleB() {
        System.out.println("Checking Invalid Triangle B");
        Triangle instance1 = new Triangle("3", "8", "4");
        String expResult = "The lengths of the triangles do not form a valid triangle!\n";
        String result = instance1.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkInvalidTriangleC() {
        System.out.println("Checking Invalid Triangle C");
        Triangle instance1 = new Triangle("8", "4", "3");
        String expResult = "The lengths of the triangles do not form a valid triangle!\n";
        String result = instance1.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void checkAreaA() {
        System.out.println("Checking Area A");
        Triangle instance1 = new Triangle("5", "4", "3");
        double expResult = 6.0;
        double result = instance1.Area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void checkAreaB() {
        System.out.println("Checking Area B");
        Triangle instance1 = new Triangle("7", "4", "3");
        double expResult = 0.0;
        double result = instance1.Area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void checkAreaC() {
        System.out.println("Checking Area C");
        Triangle instance1 = new Triangle("0", "4", "4");
        double expResult = 0.0;
        double result = instance1.Area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void checkAreaInvalid() {
        System.out.println("Checking Area A");
        Triangle instance1 = new Triangle("8", "4", "3");
        double expResult = -1.0;
        double result = instance1.Area();
        assertEquals(expResult, result, 0.0);
    }
}
