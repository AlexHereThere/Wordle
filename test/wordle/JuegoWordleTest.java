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
import wordle.consola.TableroConsola;
import wordle.consola.TecladoConsola;
import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author 01806
 */
public class JuegoWordleTest {
    
    public JuegoWordleTest() {
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
     * Test of jugar method, of class JuegoWordle.
     * @throws
     */
    @Test
    public void testJugar() throws Exception{
        System.out.println("jugar");
        ITablero tablero = new TableroConsola();
        ITeclado teclado = new TecladoConsola();
        JuegoWordle instance = new JuegoWordle(tablero,teclado,6);
        assertNotNull(instance);
    }
}
