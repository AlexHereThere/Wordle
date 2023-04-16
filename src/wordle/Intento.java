/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.util.ArrayList;
import java.util.Objects;


/**
 *modela todos los intentos del juego
 * @author 01806
 */
public class Intento {
 private static String palabra_correcta;
 private String palabra;
 private Letra[] letras;
 
 public Intento(String palabra)
 {
 this.palabra=palabra;
 letras=new Letra[palabra_correcta.length()];
 for(int i=0;i<letras.length;i++)
 {
 letras[i]=new Letra(null,null,null);    
 }
 revisarIntento();
 }
 /*
 para cambiar la palabra correcta
 */
 public static void setPalabraCorrecta(String palabra)
 {
 Intento.palabra_correcta=palabra;
 }
 public static String getPalabraCorrecta()
 {
  return palabra_correcta;   
 }
 /*
 para revisar cuantas letras estab bien ubicadas, cuantas no y las que no estan
 */
 private void revisarIntento()
 {
      for(int i=0;i<palabra.length();i++)
     {
     letras[i].SetLetra(palabra.charAt(i));
     if(letras[i].getLetra()==palabra_correcta.charAt(i)) letras[i].setSignos('(',')');
     else if(estaEnPalabra(letras[i]))letras[i].setSignos('[',']');
     else letras[i].setSignos('<','>');
     }
   
 }
/*
 verificar si esta la letra en la palabra_correcta
 */
 private boolean estaEnPalabra(Letra letra)
 {
 for(Character l:palabra_correcta.toCharArray())
  {
  if(Objects.equals(letra.getLetra(), l))return true;   
  }
 return false;
 }
 /**
  * regresar las letras para actualizar el qwerty que se presenta
  * @return 
  */
 public Letra[] getLetras()
 {
 return letras;    
 }
    /**
     *regresar como cadena
     * @return
     */
    @Override
 public String toString()
 {
 String aRegresar="";
 for(int i=0;i<palabra_correcta.length();i++)
 {
    aRegresar+="{"+letras[i]+"}";   
 }
 return aRegresar;
 }
}
