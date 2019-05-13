
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.Serializable;
import java.util.ArrayList;


public class PC2 extends Carros implements Serializable {
    
//construtor vazio
 public PC2() { 
   super();       
 }    
    
//construtor das partes
 public PC2(String numero,String marca, String modelo, int cilindrada,ArrayList<Piloto> pl) {
    super(numero,marca, modelo, cilindrada, pl);
  }   
 
//construtor de copia   
 public PC2(Carros c) {
    super(c);
  }
    
    
    
 
    
    
    
//metodo abstracto    
  public double tempoProximaVolta() {
        throw new UnsupportedOperationException("Not supported yet.");
   }

    
    
    
//METODOS COMPLEMENTARES    
 /**toString
 */
  public String toString() {
     return "Prototipo Classe-2" + "::" + super.toString();
  }  
 
 /**clone
 */
  public PC2 clone() { return new PC2(this); }    
        
    
    
}
