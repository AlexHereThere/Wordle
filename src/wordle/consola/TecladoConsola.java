/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.consola;
import wordle.interfaces.ITeclado;
import java.util.Scanner;

/**
 *clase para modelar la lectura en consola
 * @author molguin
 */
public class TecladoConsola implements ITeclado {

    @Override
    public String getIntento() {
       Scanner in = new Scanner(System.in);
       System.out.print("Palabra: ");
       return in.nextLine().toUpperCase();
    }
    
}
