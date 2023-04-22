/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.consola;


import java.util.ArrayList;
import java.util.Iterator;
import wordle.Intento;
import wordle.Letra;
import wordle.interfaces.ITablero;

/**
 *clase para modelar el despliegue en consola
 * @author molguin
 */
public class TableroConsola implements ITablero {
    @Override
    public void despliegaIntento(String palabra) {
        System.out.println(palabra);
    }

    @Override
    public void despliegaPrincipio() {
     System.out.println("Hola vamos a jugar wordle");
     System.out.println("Adivina la palabra de 5 letras...");
     System.out.println("()<-Ubicacion Correcta de letra");
     System.out.println("[]<-No esta en la ubicacion correcta");
     System.out.println("<><-No esta en la palabra");
    }

    @Override
    public void despliegaEstado(ArrayList<Letra> letras,ArrayList<Intento> intentos) 
    {
        Iterator<Intento> it=intentos.iterator();
         for(int i=0;i<6;i++)
         {
         if(it.hasNext()) System.out.println(it.next());
         else System.out.println("{   }{   }{   }{   }{   }");
         }
       
        for(Letra letra:letras)System.out.print(letra);System.out.print("\n"); 
    }
    }
    
