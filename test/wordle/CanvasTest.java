/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
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
public class CanvasTest {
    
    public CanvasTest() {
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
     * Test of setVisible method, of class Canvas.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = true;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.setVisible(visible);
       assertEquals(visible,instance.isVisible());
    }

    /**
     * Test of isVisible method, of class Canvas.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Canvas instance = new Canvas("HELLO KITTY");
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
    }

    /**
     * Test of draw method, of class Canvas.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Shape shape = new Rectangle(1,2,3,4);
        Canvas instance = new Canvas("HELLO KITTY");
        instance.draw(shape);
        assertNotNull(instance);
    }

    /**
     * Test of fill method, of class Canvas.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        Shape shape = new Rectangle(1,2,3,4);
        Canvas instance = new Canvas("HELLO KITTY");
        instance.fill(shape);
        assertNotNull(instance);
    }

    /**
     * Test of fillCircle method, of class Canvas.
     */
    @Test
    public void testFillCircle() {
        System.out.println("fillCircle");
        int xPos = 0;
        int yPos = 0;
        int diameter = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.fillCircle(xPos, yPos, diameter);
        assertNotNull(instance);
    }

    /**
     * Test of fillRectangle method, of class Canvas.
     */
    @Test
    public void testFillRectangle() {
        System.out.println("fillRectangle");
        int xPos = 0;
        int yPos = 0;
        int width = 0;
        int height = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.fillRectangle(xPos, yPos, width, height);
        assertNotNull(instance);
    }

    /**
     * Test of erase method, of class Canvas.
     */
    @Test
    public void testErase_0args() {
        System.out.println("erase");
        Canvas instance = new Canvas("HELLO KITTY");
        instance.erase();
        assertNotNull(instance);
    }

    /**
     * Test of eraseCircle method, of class Canvas.
     */
    @Test
    public void testEraseCircle() {
        System.out.println("eraseCircle");
        int xPos = 0;
        int yPos = 0;
        int diameter = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.eraseCircle(xPos, yPos, diameter);
        assertNotNull(instance);
    }

    /**
     * Test of eraseRectangle method, of class Canvas.
     */
    @Test
    public void testEraseRectangle() {
        System.out.println("eraseRectangle");
        int xPos = 0;
        int yPos = 0;
        int width = 0;
        int height = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.eraseRectangle(xPos, yPos, width, height);
        assertNotNull(instance);
        
    }

    /**
     * Test of erase method, of class Canvas.
     */
    @Test
    public void testErase_Shape() {
        System.out.println("erase");
        Shape shape = new Rectangle(1,2,3,4);
        Canvas instance = new Canvas("HELLO KITTY");
        instance.erase(shape);
        assertNotNull(instance);
    }

    /**
     * Test of eraseOutline method, of class Canvas.
     */
    @Test
    public void testEraseOutline() {
        System.out.println("eraseOutline");
        Shape shape = new Rectangle(1,2,3,4);
        Canvas instance = new Canvas("HELLO KITTY");
        instance.eraseOutline(shape);
        assertNotNull(instance);
    }

    /**
     * Test of drawImage method, of class Canvas.
     */
    @Test
    public void testDrawImage() {
        System.out.println("drawImage");
        Image image = null;
        int x = 0;
        int y = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        boolean expResult = true;
        boolean result = instance.drawImage(image, x, y);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of drawString method, of class Canvas.
     */
    @Test
    public void testDrawString() {
        System.out.println("drawString");
        String text = "";
        int x = 0;
        int y = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.drawString(text, x, y);
        assertNotNull(instance);
    }

    /**
     * Test of eraseString method, of class Canvas.
     */
    @Test
    public void testEraseString() {
        System.out.println("eraseString");
        String text = "";
        int x = 0;
        int y = 0;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.eraseString(text, x, y);
        assertNotNull(instance);
    }

    /**
     * Test of drawLine method, of class Canvas.
     */
    @Test
    public void testDrawLine() {
        System.out.println("drawLine");
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.drawLine(x1, y1, x2, y2);
        assertNotNull(instance);
    }

    /**
     * Test of setForegroundColor method, of class Canvas.
     */
    @Test
    public void testSetForegroundColor() {
        System.out.println("setForegroundColor");
        Color newColor = Color.BLACK;
        Canvas instance = new Canvas("HELLO KITTY");
        instance.setForegroundColor(newColor);
        assertEquals(newColor,instance.getForegroundColor());
    }

    /**
     * Test of getForegroundColor method, of class Canvas.
     */
    @Test
    public void testGetForegroundColor() {
        System.out.println("getForegroundColor");
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setForegroundColor(Color.yellow);
        Color result = instance.getForegroundColor();
        assertEquals(Color.YELLOW, result);
     
    }

    /**
     * Test of setBackgroundColor method, of class Canvas.
     */
    @Test
    public void testSetBackgroundColor() {
        System.out.println("setBackgroundColor");
        Color newColor = Color.YELLOW;
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setBackgroundColor(newColor);
       assertEquals(newColor,instance.getBackgroundColor());
    }

    /**
     * Test of getBackgroundColor method, of class Canvas.
     */
    @Test
    public void testGetBackgroundColor() {
        System.out.println("getBackgroundColor");
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setBackgroundColor(Color.yellow);
        Color result = instance.getBackgroundColor();
        assertEquals(Color.YELLOW, result);
    }

    /**
     * Test of setFont method, of class Canvas.
     */
    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font newFont = new Font("Tahoma",Font.CENTER_BASELINE,12);
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setFont(newFont);
      assertEquals(newFont,instance.getFont());
    }

    /**
     * Test of getFont method, of class Canvas.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        Canvas instance = new Canvas("HELLO WORLD");
        Font expResult = new Font("Tahoma",Font.CENTER_BASELINE,12);
        Font result = instance.getFont();
        assertNotEquals(expResult, result);
       
    }

    /**
     * Test of setSize method, of class Canvas.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int width = 25;
        int height = 25;
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setSize(width, height);
       assertEquals(instance.getSize(),new Dimension(120,25));
       
    }

    /**
     * Test of getSize method, of class Canvas.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Canvas instance = new Canvas("HELLO WORLD");
        instance.setSize(25, 25);
        Dimension result = instance.getSize();
        assertEquals(new Dimension(120,25), result);
       
    }

    /**
     * Test of wait method, of class Canvas.
     */
    @Test
    public void testWait() {
        System.out.println("wait");
        int milliseconds = 10;
        Canvas instance = new Canvas("HELLO WORLD");
        instance.wait(milliseconds);
        assertNotNull(instance);
    }
    
}