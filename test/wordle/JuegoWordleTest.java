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
     * Test of jugar method, of class JuegoWordle.
     */
    @Test
    public void testJugar() throws Exception {
        System.out.println("jugar");
        ITablero tabla = new TableroConsola();
        ITeclado teclado = new TecladoConsola();
        JuegoWordle instance = new JuegoWordle(tabla,teclado,6);
        //instance.jugar(); ocupa entrada de teclado
        assertNotNull(instance);
    }
    
}
