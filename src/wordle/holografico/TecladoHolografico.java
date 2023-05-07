/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.holografico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import wordle.Canvas;
import wordle.Letra;
import wordle.interfaces.ITeclado;

/**
 *
 * @author 01806
 */
public class TecladoHolografico extends JPanel implements ITeclado{
    Canvas p;
    final int numeroDeLetrasQueCaben=10;
    int xPosicionadorParaLetra=150,tamanoDePalabra=5;
    JButton BotonDeLetra;
    HashMap<Letra,JButton> letraYBoton;
    String palabra="";
    int selecciones;
    public TecladoHolografico(Canvas p)
    {
    this.p=p;
    p.getFrame().setLayout(null);
    p.getFrame().setLocationRelativeTo(null);
    }
    
   
    @Override
    public String getIntento(ArrayList<Letra> qwerty)
    {
       selecciones=0;
       letraYBoton= new HashMap();
       BotonDeLetra=null;
       int xPosicionador=30;//posicion ininial para el qwerty
       int yPosicionador=350;
       int contadorDeLetra=0;// contador para saber cuando brincar a la siguiente para presentar el resto del qwerty
         for(Letra letra:qwerty)
        {
           BotonDeLetra =new JButton();
           BotonDeLetra.setFont(new Font("Tahoma",Font.CENTER_BASELINE,10));
           BotonDeLetra.setText(letra.getLetra().toString());
           switch (letra.getSignoAntes()) 
              {
               case '(' -> BotonDeLetra.setBackground(Color.green);
               case '[' -> BotonDeLetra.setBackground(Color.yellow);
               case '<' -> BotonDeLetra.setBackground(Color.gray);
               default -> BotonDeLetra.setBackground(Color.white);
              }
              BotonDeLetra.setLocation(xPosicionador,yPosicionador);
              BotonDeLetra.setBounds(new Rectangle(xPosicionador,yPosicionador,45,45));
              BotonDeLetra.addActionListener((ActionEvent e) -> {
                  selecciones+=1;
                  palabra+=letra.getLetraString();
                  p.drawString(letra.getLetra().toString(),xPosicionadorParaLetra ,300);
                  xPosicionadorParaLetra+=45;
                  if(selecciones==tamanoDePalabra) xPosicionadorParaLetra=150;     
              });
              BotonDeLetra.setVisible(true);
              p.getFrame().add(BotonDeLetra);
              letraYBoton.put(letra,BotonDeLetra);
              xPosicionador+=45;
              contadorDeLetra+=1;
          if(contadorDeLetra==numeroDeLetrasQueCaben)//cuando se cumple, se recorre el despliegue del qwerty
          {
              yPosicionador+=45;
              xPosicionador=30;
              contadorDeLetra=0;
          }
        }
        p.getFrame().setVisible(true);
        Scanner seguir = new Scanner(System.in);
        seguir.nextLine();
        String palabra_a_regresar=palabra;
        palabra="";
        return palabra_a_regresar;
         
    }
    
  

    
}

 