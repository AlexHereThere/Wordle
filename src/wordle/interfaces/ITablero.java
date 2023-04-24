/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package wordle.interfaces;

import java.util.ArrayList;
import wordle.Intento;
import wordle.Letra;

/**
 *
 * @author molguin
 */
public interface ITablero {//interface para el despliuegue del tablero
    
    public void despliegaPrincipio();
    public void despliegaEstado(ArrayList<Letra> letras,ArrayList<Intento> intentos,int numeroDeIntentos,int TamanoDePalabra);
    public void despliegaIntento(String palabra);    
    public void despliegaFin(boolean caso,String Correcto);
}
