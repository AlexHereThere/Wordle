/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.interfaces;

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
public class ITecladoTest {
    
    public ITecladoTest() {
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
     * Test of getIntento method, of class ITeclado.
     */
    @Test
    public void testGetIntento() {
        System.out.println("getIntento");
        ITeclado instance = new ITecladoImpl();
            assertNotNull(instance);
    }

    public class ITecladoImpl implements ITeclado {

        @Override
        public String getIntento() {
            return "";
        }
    } 

    public class ITecladoImpl implements ITeclado {

        public String getIntento() {
            return "";
        }
    }

    public class ITecladoImpl implements ITeclado {

        public String getIntento() {
            return "";
        }
    }

    public class ITecladoImpl implements ITeclado {

        public String getIntento() {
            return "";
        }
    }
}
