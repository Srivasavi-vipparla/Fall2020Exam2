/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author S540791
 */
public class TriangleNGTest {
    static Triangle t;
    public TriangleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        t=new Triangle(10,12,2,"green",true);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        t=null;
    }

    /**
     * Test of getArea method, of class Triangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        //Triangle instance = null;
        double expResult = 60;
        double result = t.getArea();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimeter method, of class Triangle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        //Triangle instance = null;
        double expResult = 24;
        double result = t.getPerimeter();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Triangle.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        //Triangle instance = null;
        String expResult = "green";
        String result = t.getColor();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isFilled method, of class Triangle.
     */
    @Test
    public void testIsFilled() {
        System.out.println("isFilled");
        //Triangle instance = null;
        boolean expResult = true;
        boolean result = t.isFilled();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
