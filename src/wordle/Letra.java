/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

/**
 *Modela las letras que se presentan
 * @author ACR
 */
public class Letra {
    Character letra;
    Character signo_antes;
    Character signo_despues;
    
    public Letra(Character letra,Character signo_antes,Character signo_despues)
    {
      this.letra=letra;
      this.signo_antes=signo_antes;
      this.signo_despues=signo_despues;
    }
   
    /**
     * setter para la letra
     * @param letra 
     */
    public void SetLetra(Character letra)
    {
    this.letra=letra;
    }
    
    /**
     * getter para la letra
     * @return 
     */
    public Character getLetra()
    {
    return letra;    
    }
    
    /**
     * setter para los signos de la letra
     * @param signo_antes
     * @param signo_despues 
     */
    public void setSignos(Character signo_antes,Character signo_despues)
    {
    this.signo_antes=signo_antes;
    this.signo_despues=signo_despues;    
    }
    
    /**
     * getter de signo antes
     * @return 
     */
    public Character getSignoAntes()
    {
    return signo_antes;   
    }
    /**
     * getter de signo despues
     * @return 
     */
    public Character getSignoDespues()
    {
    return signo_despues;    
    }
    
    /**
     *regresar la letra como cadena
     * @return
     */
    @Override
    public String toString()
    {
    return ""+signo_antes+letra+signo_despues+"";
    }
    
}
