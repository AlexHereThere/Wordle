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
import wordle.Intento;
import wordle.Letra;

/**
 *
 * @author 01806
 */
public class ITableroTest {
    
    public ITableroTest() {
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
     * Test of despliegaPrincipio method, of class ITablero.
     */
    @Test
    public void testDespliegaPrincipio() {
        System.out.println("despliegaPrincipio");
        ITablero instance = new ITableroImpl();
        instance.despliegaPrincipio();
        assertNotNull(instance);
    }

    /**
     * Test of despliegaEstado method, of class ITablero.
     */
    @Test
    public void testDespliegaEstado() {
        System.out.println("despliegaEstado");
        ArrayList<Letra> letras =new ArrayList<>();
        ArrayList<Intento> intentos =new ArrayList<>();
        int numeroDeIntentos = 0;
        int TamanoDePalabra = 0;
        ITablero instance = new ITableroImpl();
        instance.despliegaEstado(letras, intentos, numeroDeIntentos, TamanoDePalabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaIntento method, of class ITablero.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "";
        ITablero instance = new ITableroImpl();
        instance.despliegaIntento(palabra);
        assertNotNull(instance);
    }

    /**
     * Test of despliegaFin method, of class ITablero.
     */
    @Test
    public void testDespliegaFin() {
        System.out.println("despliegaFin");
        boolean caso = false;
        String Correcto = "";
        ITablero instance = new ITableroImpl();
        instance.despliegaFin(caso, Correcto);
        assertNotNull(instance);
    }

    public class ITableroImpl implements ITablero {

        @Override
        public void despliegaPrincipio() {
        }

        @Override
        public void despliegaEstado(ArrayList<Letra> letras, ArrayList<Intento> intentos, int numeroDeIntentos, int TamanoDePalabra) {
        }

        @Override
        public void despliegaIntento(String palabra) {
        }

        @Override
        public void despliegaFin(boolean caso, String Correcto) {
        }
    }
    
}
