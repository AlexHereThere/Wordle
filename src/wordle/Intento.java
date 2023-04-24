/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.util.Objects;


/**
 *modela todos los intentos del juego
 * @author ACR
 */
public class Intento {
 private static String palabra_correcta;
 private final String palabra;
 private final Letra[] letras;
 private boolean correcto;
 public Intento(String palabra)
 {
 this.palabra=palabra;
 letras=new Letra[palabra_correcta.length()];
 for(int i=0;i<letras.length;i++)
 {
 letras[i]=new Letra(null,null,null); //crea las letras como nullo   
 }
 revisarIntento();//hace todo el aspecto de revision
 }
 /**
  * para cambiar la palabra correcta
  * @param palabra
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
 tambien indica si se encontro la palabra oh no
 */
 private void revisarIntento()
 {
     if(palabra.length()==palabra_correcta.length())//debe ser la misma longitud para considerar intento
     {
     int numeroDeCorrectos=0;
     for(int i=0;i<palabra_correcta.length();i++) letras[i].SetLetra(palabra.charAt(i));//se llena letras con la palabra
      for(int i=0;i<palabra_correcta.length();i++)//esto se hace para cada letra en la palabra dada y palabra correcta
     {
      if(letras[i].getLetra()==palabra_correcta.charAt(i)) letras[i].setSignos('(',')');
      else if(estaEnPalabra(letras[i]) && sacarAparicionesEnPalabra(letras[i])<=sacarAparicionesEnCorrecto(letras[i])) 
             letras[i].setSignos('[',']'); //si esta la letra en la palabra correcta y no ha sobrepasado el numero de veces que aparece en                                                                                                           
      else letras[i].setSignos('<','>');  // la palabra correcta en este punto, entonces indicalo como [ ].
      
      if(letras[i].getSignoAntes()=='(' && letras[i].getSignoDespues()==')') numeroDeCorrectos+=1; // cuenta el numero de letras que tienen () 
     }
     correcto = numeroDeCorrectos==palabra_correcta.length();
     }
     //como no se consideran palabras que sean de longitud menor o mayor de 5, va a marcar error
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
  * regresa el valor de veces que esta una letra en la palabra dada en este punto 
  */
 private int sacarAparicionesEnPalabra(Letra letra)
 {
 int contador=0;    
 for(Letra letra_palabra :letras)
 {
  if(Objects.equals(letra.getLetra(),letra_palabra.getLetra()))contador+=1;
 }
 return contador;    
 }
 /**
  * regresa el valor de veces que esta una letra en la palabra correcta
  */
 private int sacarAparicionesEnCorrecto(Letra letra)
 {
 int contador=0;    
 for(Character l:palabra_correcta.toCharArray())
 {
  if(Objects.equals(letra.getLetra(), l))contador+=1;
 }
 return contador;    
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
  * metodo especial para el despliegue holografico
  * @return 
  */
 public String getPurasLetras()
 {
 String cadena="";
  for(Letra letra:letras)
  {
  cadena+=letra.getLetra()+"    ";
  }
  return cadena;
 }        
 /**
  * regresa la palabra dada
  * @return 
  */
 public String getPalabra()
 {
     return palabra;
 }
 /**
  * regresa si la palabra dada es igual a la palabra correcta (significa que fue exitoso el intento)
  * @return 
  */
 public boolean verSiCorrecto()
 {
     return correcto;
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
