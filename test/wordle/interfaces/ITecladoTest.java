/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.interfaces;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wordle.Letra;

/**
 *
 * @author 01806
 */
public class ITecladoTest {
    
    public ITecladoTest() {
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
     * Test of getIntento method, of class ITeclado.
     */
    @Test
    public void testGetIntento() {
        System.out.println("getIntento");
        ITeclado instance = new ITecladoImpl();
        //String expResult = "";
       // String result = instance.getIntento();//lee de teclado
        assertNotNull(instance);
    }

    public class ITecladoImpl implements ITeclado {

        @Override
        public String getIntento(ArrayList<Letra> qwerty) {
           return "";
        }
    }
    
}
