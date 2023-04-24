/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 01806
 */
public class IntentoTest {
    
    public IntentoTest() {
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
     * Test of setPalabraCorrecta method, of class Intento.
     */
    @Test
    public void testSetPalabraCorrecta() {
        System.out.println("setPalabraCorrecta");
        String palabra = "";
        Intento.setPalabraCorrecta(palabra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPalabraCorrecta method, of class Intento.
     */
    @Test
    public void testGetPalabraCorrecta() {
        System.out.println("getPalabraCorrecta");
        String expResult = "";
        String result = Intento.getPalabraCorrecta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLetras method, of class Intento.
     */
    @Test
    public void testGetLetras() {
        System.out.println("getLetras");
        Intento instance = null;
        Letra[] expResult = null;
        Letra[] result = instance.getLetras();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurasLetras method, of class Intento.
     */
    @Test
    public void testGetPurasLetras() {
        System.out.println("getPurasLetras");
        Intento instance = null;
        String expResult = "";
        String result = instance.getPurasLetras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPalabra method, of class Intento.
     */
    @Test
    public void testGetPalabra() {
        System.out.println("getPalabra");
        Intento instance = null;
        String expResult = "";
        String result = instance.getPalabra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verSiCorrecto method, of class Intento.
     */
    @Test
    public void testVerSiCorrecto() {
        System.out.println("verSiCorrecto");
        Intento instance = null;
        boolean expResult = false;
        boolean result = instance.verSiCorrecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Intento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Intento instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
