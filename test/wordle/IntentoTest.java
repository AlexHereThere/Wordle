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
        System.out.println("ANTES DE CLASE->");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("<-DESPUES DE CLASE");
    }
    
    @Before
    public void setUp() {
        System.out.println("ANTES DE METODO->");
    }
    
    @After
    public void tearDown() {
        System.out.println("<-DESPUES DE METODO");
    }

    /**
     * Test of setPalabraCorrecta method, of class Intento.
     */
    @Test
    public void testSetPalabraCorrecta() {
        System.out.println("setPalabraCorrecta");
        String palabra = "arbol";
        Intento.setPalabraCorrecta(palabra);
        assertEquals(Intento.getPalabraCorrecta(),palabra);
    }

    /**
     * Test of getPalabraCorrecta method, of class Intento.
     */
    @Test
    public void testGetPalabraCorrecta() {
        System.out.println("getPalabraCorrecta");
        String result = Intento.getPalabraCorrecta();
        assertNotNull(result);
  
    }

    /**
     * Test of getLetras method, of class Intento.
     */
    @Test
    public void testGetLetras() {
        System.out.println("getLetras");
        Intento instance = new Intento("arbol");
        Letra[] result = instance.getLetras();
        assertNotNull(result);
       
    }

    /**
     * Test of toString method, of class Intento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Intento.setPalabraCorrecta("ARBOL");
        Intento instance = new Intento("ARBOL");
        String expResult="{(A)}{(R)}{(B)}{(O)}{(L)}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
