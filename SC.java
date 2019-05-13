
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.io.Serializable;
import java.util.ArrayList;

public class SC extends Carros implements Serializable {
 
//construtor vazio
 public SC() { 
   super();       
 }    
    
//construtor das partes
 public SC(String numero,String marca, String modelo, int cilindrada,
                                  ArrayList<Piloto> pl) {
    super(numero,marca, modelo, cilindrada,pl);
  }   
 
//construtor de copia   
 public SC(Carros c) {
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
     return "Stock Cars" + "::" + super.toString();
  }  
 
 /**clone
 */
  public SC clone() { return new SC(this); }    
        
    
}
