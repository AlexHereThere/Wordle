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
public interface ITablero {
    
    public void despliegaPrincipio();
    public void despliegaEstado(ArrayList<Letra> letras,ArrayList<Intento> intentos);
    public void despliegaIntento(String palabra);    
}
