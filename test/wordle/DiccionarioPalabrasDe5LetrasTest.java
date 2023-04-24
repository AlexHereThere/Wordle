/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import java.util.ArrayList;
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
public class DiccionarioPalabrasDe5LetrasTest {
    
    public DiccionarioPalabrasDe5LetrasTest() {
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
     * Test of getPalabras method, of class DiccionarioPalabrasDe5Letras.
     */
    @Test
    public void testGetPalabras() throws Exception {
        System.out.println("getPalabras");
        DiccionarioPalabrasDe5Letras instance = new DiccionarioPalabrasDe5Letras();
        ArrayList<String> result = instance.getPalabras();
        assertNotNull(result);
    }

    /**
     * Test of darPalabraAleatoria method, of class DiccionarioPalabrasDe5Letras.
     */
    @Test
    public void testDarPalabraAleatoria() throws Exception {
        System.out.println("darPalabraAleatoria");
        DiccionarioPalabrasDe5Letras instance = new DiccionarioPalabrasDe5Letras();
        String result = instance.darPalabraAleatoria();
        assertNotNull(result);
    }
    
}
