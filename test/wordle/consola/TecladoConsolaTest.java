/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.consola;

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
public class TecladoConsolaTest {
    
    public TecladoConsolaTest() {
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
     * Test of getIntento method, of class TecladoConsola.
     */
    @Test
    public void testGetIntento() {
        System.out.println("getIntento");
        TecladoConsola instance = new TecladoConsola();
        //String expResult = "";
        //String result = instance.getIntento(); //lectura de teclado
        assertNotNull(instance);
    }
    
}
