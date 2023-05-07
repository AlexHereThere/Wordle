/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.consola;
import java.util.ArrayList;
import wordle.interfaces.ITeclado;
import java.util.Scanner;
import wordle.Letra;

/**
 *clase para modelar la lectura en consola
 * @author molguin
 */
public class TecladoConsola implements ITeclado {

    @Override
    public String getIntento(ArrayList<Letra> qwerty) {
       Scanner in = new Scanner(System.in);
       
       for(Letra letra:qwerty) System.out.print(letra);
       System.out.print("\n");
       
       System.out.print("Palabra: ");
       return in.nextLine().toUpperCase();
       
       
    }
    
}
