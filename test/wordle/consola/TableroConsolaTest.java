/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.consola;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wordle.Intento;
import wordle.Letra;

/**
 *
 * @author 01806
 */
public class TableroConsolaTest {
    
    public TableroConsolaTest() {
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
     * Test of despliegaIntento method, of class TableroConsola.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "";
        TableroConsola instance = new TableroConsola();
        instance.despliegaIntento(palabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaPrincipio method, of class TableroConsola.
     */
    @Test
    public void testDespliegaPrincipio() {
        System.out.println("despliegaPrincipio");
        TableroConsola instance = new TableroConsola();
        instance.despliegaPrincipio();
         assertNotNull(instance);
    }

    /**
     * Test of despliegaEstado method, of class TableroConsola.
     */
    @Test
    public void testDespliegaEstado() {
        System.out.println("despliegaEstado");
        ArrayList<Letra> letras = new ArrayList<>();
        ArrayList<Intento> intentos = new ArrayList<>();
        int NumeroDeIntentos = 0;
        int tamanoDePalabra = 0;
        TableroConsola instance = new TableroConsola();
        instance.despliegaEstado(letras, intentos, NumeroDeIntentos, tamanoDePalabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaFin method, of class TableroConsola.
     */
    @Test
    public void testDespliegaFin() {
        System.out.println("despliegaFin");
        boolean caso = false;
        String correcto = "";
        TableroConsola instance = new TableroConsola();
        instance.despliegaFin(caso, correcto);
        assertNotNull(instance);
    }
    
}
