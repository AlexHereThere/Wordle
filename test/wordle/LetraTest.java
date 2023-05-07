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
     * Test of SetLetra method, of class Letra.
     */
    @Test
    public void testSetLetra() {
        System.out.println("SetLetra");
        Character letra = 'a';
        Letra instance = new Letra('b','<','>');
        instance.SetLetra(letra);
        assertEquals(letra,instance.getLetra());
    }

    /**
     * Test of getLetra method, of class Letra.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Letra instance = new Letra('b','<','>');
        Character expResult = 'b';
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
        Letra instance = new Letra('b','(',')');
        instance.setSignos(signo_antes, signo_despues);
        assertEquals(instance.getSignoAntes(),signo_antes);
    }

    /**
     * Test of getSignoAntes method, of class Letra.
     */
    @Test
    public void testGetSignoAntes() {
        System.out.println("getSignoAntes");
        Letra instance = new Letra('b','(',')');
        Character expResult = '(';
        Character result = instance.getSignoAntes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSignoDespues method, of class Letra.
     */
    @Test
    public void testGetSignoDespues() {
        System.out.println("getSignoDespues");
        Letra instance = new Letra('b','(',')');
        Character expResult = ')';
        Character result = instance.getSignoDespues();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of toString method, of class Letra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Letra instance = new Letra('b','(',')');
        String expResult = "(b)";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
