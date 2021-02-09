/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chandra Saputra
 */
public class AddSubTest {
    
    @Test
    public void testAddPass(){
        assertEquals("Error in add()", 3, Calculator.add(1, 2));
        assertEquals("Error in add()", -3, Calculator.add(-1, -2));
        assertEquals("Error in add()", 9, Calculator.add(9, 0));
    }
    @Test
    public void testAddFail(){
        assertNotEquals("Error in add()", 0, Calculator.add(1, 2));
    }
    
    @Test
    public void testSubPass(){
      assertEquals("error in sub()",  1, Calculator.sub(2, 1));
      assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
      assertEquals("error in sub()",  0, Calculator.sub(2, 2));
    }
    @Test
    public void testSubFail(){
        assertNotEquals("Error in sub()", 0, Calculator.add(2, 1));
    }
   @Test
    public void testMulPass(){
      assertEquals("error in mul()",  2, Calculator.mul(2, 1));
      assertEquals("error in mul()", 2, Calculator.mul(-2, -1));
      assertEquals("error in mul()",  4, Calculator.mul(2, 2));
    }
    @Test
    public void testMulFail(){
        assertNotEquals("Error in mul()", 0, Calculator.mul(2, 1));
    }
    @Test
    public void testdivIntPass(){
      assertEquals("error in divInt()",  2, Calculator.divInt(2, 0));
    }
    @Test
    public void testdivRealPass(){
      assertEquals("error in divReal()",  2, Calculator.divReal(2, 0));
    }
}
