/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle;

import java.awt.Color;
import wordle.consola.TableroConsola;
import wordle.consola.TecladoConsola;
import wordle.holografico.TableroHolografico;
import wordle.holografico.TecladoHolografico;
import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class Wordle {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       Canvas espacio=new Canvas("Wordle",500,500,Color.WHITE);
       ITablero tablero = new TableroHolografico(espacio);
       ITeclado teclado = new TecladoHolografico(espacio);
       JuegoWordle juego = new JuegoWordle(tablero, teclado,6);//representa el inicio del juego
     juego.jugar();
        //System.out.println(teclado.getIntento());
    }
    
}
