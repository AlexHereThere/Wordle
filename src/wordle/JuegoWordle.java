/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.util.ArrayList;
import java.util.Objects;
import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class JuegoWordle {
    ITablero tablero;
    ITeclado teclado;
    ArrayList<Letra> qwerty;
    ArrayList<Intento> intentos;

    public JuegoWordle(ITablero tablero, ITeclado teclado) {
        this.tablero = tablero;
        this.teclado = teclado;
        qwerty =new ArrayList<>();
    for(Character letra:"QWERTYUIOPASDFGHJKLÑZXCVBNM".toCharArray())
    {
     qwerty.add(new Letra(letra,' ',' '));
    }
    intentos=new ArrayList<>();
    }
    
    public void jugar() throws Exception {
        tablero.despliegaPrincipio();
        DiccionarioPalabrasDe5Letras dicc = new DiccionarioPalabrasDe5Letras();
        String correcto=dicc.darPalabraAleatoria();
        System.out.println(correcto);
        Intento.setPalabraCorrecta(correcto);
        tablero.despliegaEstado(qwerty,intentos);
        for(int i=0;i<6;i++)
        {
        ronda();
        tablero.despliegaEstado(qwerty,intentos);
        }
      
    }
    
    private void ronda()
    {
    Intento deRonda=new Intento(teclado.getIntento());
    actualizarQwerty(deRonda);
    intentos.add(deRonda);
    }
    
    private void actualizarQwerty(Intento intento)
    {
    for(Letra letra_qwerty:qwerty)      
     for(Letra letra_intento:intento.getLetras())
     {
      if(Objects.equals(letra_qwerty.getLetra(), letra_intento.getLetra()))
      letra_qwerty.setSignos
        (letra_intento.getSignoAntes(),letra_intento.getSignoDespues());
     }
    }
}

