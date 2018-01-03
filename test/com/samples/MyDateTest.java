/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ken
 */
public class MyDateTest {
    
    public MyDateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDay method, of class MyDate.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        MyDate instance = null;
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class MyDate.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        MyDate instance = null;
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class MyDate.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        MyDate instance = null;
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonth method, of class MyDate.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 0;
        MyDate instance = null;
        instance.setMonth(month);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class MyDate.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        MyDate instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class MyDate.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        MyDate instance = null;
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDateValid method, of class MyDate.
     */
    @Test
    public void testIsDateValid() {
        System.out.println("isDateValid");
        MyDate instance = null;
        boolean expResult = false;
        boolean result = instance.isDateValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeapYear method, of class MyDate.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        MyDate instance = null;
        boolean expResult = false;
        boolean result = instance.isLeapYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
