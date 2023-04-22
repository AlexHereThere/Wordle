/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *para tener todas las palabras
 * @author ACR
 */
public class DiccionarioPalabrasDe5Letras {
    File doc;
    Scanner palabra;
    ArrayList<String> palabras;
    
    /**
     *constructor, aqui se saca todas las palabras del juego, a partir de un  documento texto y los guarda en un arraylist
     * @throws Exception
     */
    public DiccionarioPalabrasDe5Letras() throws Exception
    {
    doc =new File("C:\\Users\\01806\\Desktop\\Alejandro Castro Renteria\\Cosas Uni\\Trabajos Uni\\Semestre 4\\POO\\Practica 5\\Wordle\\src\\wordle\\PalabrasDe5LetrasSinAccento.txt"); 
    palabra =new Scanner(doc);
    palabras =new ArrayList<>();
     while(palabra.hasNextLine())
     {
      palabras.add(palabra.nextLine().toUpperCase());
     }
    }
    /*
    regresar las palabras para ver las que hay disponible
    */
    public ArrayList<String> getPalabras()
    {
    return palabras;    
    }
    /**
     * para regresar una palabra aleatoriamente del diccionario
     * @return 
     */
    public String darPalabraAleatoria()
    {
    Random rmd =new Random();
    return palabras.get(rmd.nextInt(palabras.size()));
    }
}
