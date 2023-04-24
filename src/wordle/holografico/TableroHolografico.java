/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.holografico;


import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import wordle.Canvas;
import wordle.Intento;
import wordle.Letra;
import wordle.interfaces.ITablero;

/**
 *
 * @author molguin
 */
public class TableroHolografico implements ITablero{
     Canvas p = new Canvas("Wordle",500,500,Color.WHITE);
     final int numeroDeLetrasQueCaben=10;
     
    @Override
    public void despliegaIntento(String palabra) {
        System.out.println("Despliegue Holografico de "+palabra);
    }
    
    
    @Override
    public void despliegaEstado(ArrayList<Letra> letras,ArrayList<Intento> intentos,int numeroDeIntentos,int tamanoDePalabra ) {
      p.erase();
      p.setForegroundColor(Color.BLACK);
      Iterator<Intento> it=intentos.iterator();
       Letra[] letrasIntento = null;
       int xPosicionador; //indica los desplazamientos que se hace para que se presente bien cada recuadro
      
       int yPosicionador=50;
         for(int i=0;i<6;i++)//por linea
         {
            xPosicionador=140;//posicion inicial para los recuadros
            if(it.hasNext())
             {
              letrasIntento=it.next().getLetras(); //agarra todas las letras del intento
              for(Letra letra:letrasIntento)
              {
              switch (letra.getSignoAntes()) 
              {
               case '(' -> p.setForegroundColor(Color.green);
               case '[' -> p.setForegroundColor(Color.yellow);
               default -> p.setForegroundColor(Color.gray);
              }
              p.fillRectangle(xPosicionador,yPosicionador,30,30);
              p.setForegroundColor(Color.BLACK);
              p.drawString(letra.getLetra().toString(), xPosicionador+5, yPosicionador+25);
              xPosicionador+=45;//se le modifica para realizar el desplazamiento para el siguiente recuadro
              }
              yPosicionador+=45;//tambien se modifica el desplazamiento en y
            }
           else
            {
             for(int j=0;j<tamanoDePalabra;j++)
             {
              p.draw(new Rectangle(xPosicionador,yPosicionador,30,30));
              xPosicionador+=45;
             }
             yPosicionador+=45;
            }
         }
         xPosicionador=30;//posicion ininial para el qwerty
         yPosicionador=350;
         int contadorDeLetra=0;// contador para saber cuando brincar a la siguiente para presentar el resto del qwerty
         for(Letra letra:letras)
        {
           
           switch (letra.getSignoAntes()) 
              {
               case '(' -> p.setForegroundColor(Color.green);
               case '[' -> p.setForegroundColor(Color.yellow);
               case '<' -> p.setForegroundColor(Color.gray);
               default -> p.setForegroundColor(Color.white);
              }
              p.fillRectangle(xPosicionador,yPosicionador,30,30);
              p.setForegroundColor(Color.BLACK);
              p.drawString(letra.getLetra().toString(), xPosicionador+5, yPosicionador+25);
              xPosicionador+=45;
              contadorDeLetra+=1;
          if(contadorDeLetra==numeroDeLetrasQueCaben)//cuando se cumple, se recorre el despliegue del qwerty
          {
              yPosicionador+=45;
              xPosicionador=30;
              contadorDeLetra=0;
          }
        }
      p.setVisible(true);
    }

    
    @Override
    public void despliegaPrincipio() {
       p.setFont(new Font("Tahoma",Font.CENTER_BASELINE,12));
       p.drawString("Hola vamos a jugar Wordle ", 150, 15);
       p.drawString("adivina la palabra de 5 letras...", 150, 25);
       
      
       p.setForegroundColor(Color.GREEN);
       p.fillRectangle(70, 35, 30, 30);
       p.setForegroundColor(Color.BLACK);
       p.drawString("A", 80, 55);
       p.drawString("significa que esta ubicado en la posicion correcta.", 120, 55);
       
       p.setForegroundColor(Color.yellow);
       p.fillRectangle(40, 75, 30, 30);
       p.setForegroundColor(Color.BLACK);
       p.drawString("B", 50, 95);
       p.drawString("significa que esta en la palabra pero no en la ubicacion correcta.", 90, 95);
       p.setVisible(true);
       
       p.setForegroundColor(Color.gray);
       p.fillRectangle(90, 115, 30, 30);
       p.setForegroundColor(Color.BLACK);
       p.drawString("C", 100, 135);
       p.drawString("significa que NO esta en la palabra", 150, 135);
       p.setVisible(true);
       
       p.setFont(new Font("Tahoma",Font.CENTER_BASELINE,25));
       p.drawString("HAZ CLICK PARA EMPEZAR",90,300);
      
    }

    @Override
    public void despliegaFin(boolean caso,String correcto) {
       if(caso==true)p.drawString("FELICIDADES!!!",170, 25);
       else{
          p.setFont(new Font("Tahoma",Font.CENTER_BASELINE,12));
          p.drawString("La palabra era "+correcto+"...", 170, 25);  
       }     
       p.setFont(new Font("Tahoma",Font.CENTER_BASELINE,12));
       p.drawString("CLICK PARA TERMINAR",170,35);
       p.wait(10);
       p.setVisible(false);
    }

}
