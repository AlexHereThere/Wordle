/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.holografico;

import java.util.ArrayList;
import wordle.Intento;
import wordle.Letra;
import wordle.interfaces.ITablero;

/**
 *
 * @author molguin
 */
public class TableroHolografico implements ITablero {

    @Override
    public void despliegaIntento(String palabra) {
        System.out.println("Despliegue Holografico de "+palabra);
    }
    @Override
    public void despliegaEstado(ArrayList<Letra> letras,ArrayList<Intento> intentos ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     */
    @Override
    public void despliegaPrincipio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
