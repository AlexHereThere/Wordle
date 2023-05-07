/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package wordle.interfaces;

import java.util.ArrayList;
import wordle.Letra;

/**
 *
 * @author molguin
 */
public interface ITeclado {// inteface para la lectura

    /**
     *
     * @param qwerty
     * @return
     */
    public String getIntento(ArrayList<Letra> qwerty);
}
