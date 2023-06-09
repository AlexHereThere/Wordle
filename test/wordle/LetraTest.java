/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import java.util.Objects;
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
public class LetraTest {
    
    public LetraTest() {
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
     * Test of SetLetra method, of class Letra.
     */
    @Test
    public void testSetLetra() {
        System.out.println("SetLetra");
        Character letra;
        letra = 'A';
        Letra instance = new Letra('A','<','>');
        instance.SetLetra(letra);
        assertEquals(instance.getLetra(),letra);
    }

    /**
     * Test of getLetra method, of class Letra.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Letra instance = new Letra('A','<','>'); 
        Character expResult = 'A';
        Character result = instance.getLetra();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSignos method, of class Letra.
     */
    @Test
    public void testSetSignos() {
        System.out.println("setSignos");
        Character signo_antes = '<';
        Character signo_despues = '>';
        Letra instance =new Letra(null,null,null);
        instance.setSignos(signo_antes, signo_despues);
        assertTrue(Objects.equals(instance.getSignoAntes(), signo_antes) && 
                Objects.equals(instance.getSignoDespues(), signo_despues));
    }

    /**
     * Test of getSignoAntes method, of class Letra.
     */
    @Test
    public void testGetSignoAntes() {
        System.out.println("getSignoAntes");
        Letra instance = new Letra('A','<','>'); 
        Character expResult = '<';
        Character result = instance.getSignoAntes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSignoDespues method, of class Letra.
     */
    @Test
    public void testGetSignoDespues() {
        System.out.println("getSignoDespues");
        Letra instance = new Letra('A','<','>'); 
        Character expResult = '>';
        Character result = instance.getSignoDespues();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Letra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Letra instance = new Letra('A','<','>'); 
        String expResult = "<A>";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    
}
