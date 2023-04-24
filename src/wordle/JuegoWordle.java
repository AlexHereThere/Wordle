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
 *clase que modela el juego
 * @author molguin
 */
public class JuegoWordle {
    ITablero tablero;
    ITeclado teclado;
    ArrayList<Letra> qwerty;
    ArrayList<Intento> intentos;
    DiccionarioPalabrasDe5Letras dicc;
    int numeroDeIntentos;

    public JuegoWordle(ITablero tablero, ITeclado teclado,int intentosDisponibles) throws Exception {
        this.tablero = tablero;
        this.teclado = teclado;
        qwerty =new ArrayList<>();
    for(Character letra:"QWERTYUIOPASDFGHJKLÑZXCVBNM".toCharArray())
    {
     qwerty.add(new Letra(letra,' ',' '));
    }
    intentos=new ArrayList<>();
    dicc = new DiccionarioPalabrasDe5Letras();
    numeroDeIntentos=intentosDisponibles;
    }
    /**
     * hace todo lo de jugar 
     */
    public void jugar(){
        boolean seGano=false;
        tablero.despliegaPrincipio();
        teclado.getIntento();
        String correcto=dicc.darPalabraAleatoria();
       // System.out.println(correcto);  // es para probar el juego
        Intento.setPalabraCorrecta(correcto);
        tablero.despliegaEstado(qwerty,intentos,numeroDeIntentos,correcto.length());
        for(int i=0;i<numeroDeIntentos;i++)
        {
        if(seGano=ronda())break;//si se encontro la palabra, se va hacia el fin
        tablero.despliegaEstado(qwerty,intentos,numeroDeIntentos,correcto.length());
        }
        tablero.despliegaEstado(qwerty, intentos,numeroDeIntentos,correcto.length());// ultimo despliegue
        tablero.despliegaFin(seGano,correcto);//indica resultados
    }
    /**
     * ejecuta todo lo que se hace en una ronda
     */
    private boolean ronda()
    {
    
    Intento deRonda;
    do{
    deRonda=new Intento(teclado.getIntento());
    if(!verExiste(dicc,deRonda)) System.out.println("ERROR: NO EXISTE PALABRA");
    }while(!verExiste(dicc,deRonda));//sigue pidiendo si no esta la palabra en dicc
    actualizarQwerty(deRonda);
    intentos.add(deRonda);
        return deRonda.verSiCorrecto();
    }
    /**
     *es para actualizar las letras del qwerty para ser reflejado al respecto la palabra correcta 
     */
    private void actualizarQwerty(Intento intento)
    {
    for(Letra letra_qwerty:qwerty)      
     for(Letra letra_intento:intento.getLetras())
     {
      if(Objects.equals(letra_qwerty.getLetra(), letra_intento.getLetra()) && letra_qwerty.getSignoAntes()!='(')
      letra_qwerty.setSignos // si son la misma letra y la letra del qwerty no ha sido nominado () entonces se modifica su estado en qwerty
        (letra_intento.getSignoAntes(),letra_intento.getSignoDespues());
     }
    }
    /**
     * ver si existe la palabra en el diccionario
     * @param dicc 
     */
    private boolean verExiste(DiccionarioPalabrasDe5Letras dicc,Intento intento)
    {
        return dicc.getPalabras().contains(intento.getPalabra());
    }
}

