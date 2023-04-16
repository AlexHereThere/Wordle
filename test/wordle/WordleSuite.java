/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package wordle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 01806
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({wordle.JuegoWordleTest.class, wordle.IntentoTest.class, wordle.holografico.HolograficoSuite.class, wordle.consola.ConsolaSuite.class, wordle.LetraTest.class, wordle.interfaces.InterfacesSuite.class, wordle.WordleTest.class, wordle.DiccionarioPalabrasDe5LetrasTest.class})
public class WordleSuite {

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
    
}
