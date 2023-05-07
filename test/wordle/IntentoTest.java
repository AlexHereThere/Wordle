/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        String palabra = "arbol";
        Intento.setPalabraCorrecta(palabra);
        assertEquals(palabra,Intento.getPalabraCorrecta());
    }

    /**
     * Test of getPalabraCorrecta method, of class Intento.
     */
    @Test
    public void testGetPalabraCorrecta() {
        System.out.println("getPalabraCorrecta");
        String expResult = "arbol";
        Intento.setPalabraCorrecta(expResult);
        String result = Intento.getPalabraCorrecta();
         Assert.assertEquals(expResult, result);

    }

    /**
     * Test of getLetras method, of class Intento.
     */
    @Test
    public void testGetLetras() {
        System.out.println("getLetras");
        Intento instance = new Intento("arbol");
        Letra[] result = instance.getLetras();
          Assert.assertArrayEquals(instance.getLetras(), result);
    }
    /**
     * Test of getPalabra method, of class Intento.
     */
    @Test
    public void testGetPalabra() {
        System.out.println("getPalabra");
        Intento instance = new Intento("arbol");
        String expResult = "arbol";
        String result = instance.getPalabra();
       Assert.assertEquals(expResult, result);
       
    }

    /**
     * Test of verSiCorrecto method, of class Intento.
     */
    @Test
    public void testVerSiCorrecto() {
        System.out.println("verSiCorrecto");
         Intento.setPalabraCorrecta("ardor");
        Intento instance = new Intento("arbol");
        boolean expResult = false;       
        boolean result = instance.verSiCorrecto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Intento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Intento.setPalabraCorrecta("ARBOL");
        Intento instance = new Intento("ARBOL");
        String expResult = "{(A)}{(R)}{(B)}{(O)}{(L)}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
