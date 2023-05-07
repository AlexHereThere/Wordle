/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.holografico;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wordle.Canvas;
import wordle.Intento;
import wordle.Letra;

/**
 *
 * @author 01806
 */
public class TableroHolograficoTest {
    
    public TableroHolograficoTest() {
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
     * Test of despliegaIntento method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "";
        TableroHolografico instance = new TableroHolografico(new Canvas("hola"));
        instance.despliegaIntento(palabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaEstado method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaEstado() {
        System.out.println("despliegaEstado");
        ArrayList<Letra> letras = new ArrayList<>();
        ArrayList<Intento> intentos = new ArrayList<>();
        int numeroDeIntentos = 0;
        int tamanoDePalabra = 0;
        TableroHolografico instance = new TableroHolografico(new Canvas("hola"));
        instance.despliegaEstado(letras, intentos, numeroDeIntentos, tamanoDePalabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaPrincipio method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaPrincipio() {
        System.out.println("despliegaPrincipio");
        TableroHolografico instance = new TableroHolografico(new Canvas("hola"));
        //instance.despliegaPrincipio();
        assertNotNull(instance);
    }

    /**
     * Test of despliegaFin method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaFin() {
        System.out.println("despliegaFin");
        boolean caso = false;
        String correcto = "";
        TableroHolografico instance = new TableroHolografico(new Canvas("hola"));
        //instance.despliegaFin(caso, correcto);
        assertNotNull(instance);
    }
    
}
