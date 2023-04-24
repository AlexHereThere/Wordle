/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle;

import wordle.consola.TableroConsola;
import wordle.consola.TecladoConsola;
import wordle.holografico.TableroHolografico;
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
       ITablero tablero = new TableroHolografico();
       ITeclado teclado = new TecladoConsola();
       JuegoWordle juego = new JuegoWordle(tablero, teclado,6);//representa el inicio del juego
      juego.jugar();
    }
    
}
