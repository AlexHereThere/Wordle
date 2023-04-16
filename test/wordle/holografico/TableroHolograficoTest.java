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
     * Test of despliegaIntento method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        TableroHolografico instance = new TableroHolografico();
        String palabra="ARBOL";
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
        TableroHolografico instance = new TableroHolografico();
        instance.despliegaEstado(letras, intentos);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaPrincipio method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaPrincipio() {
        System.out.println("despliegaPrincipio");
        TableroHolografico instance = new TableroHolografico();
        instance.despliegaPrincipio();
        assertNotNull(instance);
    }
    
}
