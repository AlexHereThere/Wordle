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
@Suite.SuiteClasses({wordle.CanvasTest.class, wordle.JuegoWordleTest.class, wordle.IntentoTest.class, wordle.holografico.HolograficoSuite.class, wordle.consola.ConsolaSuite.class, wordle.LetraTest.class, wordle.interfaces.InterfacesSuite.class, wordle.WordleTest.class, wordle.DiccionarioPalabrasDe5LetrasTest.class})
public class WordleSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
