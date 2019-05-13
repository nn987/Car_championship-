

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.Serializable;
import java.util.ArrayList;

public class PC1 extends Carros implements Serializable {


//construtor vazio
 public PC1() { 
   super();       
 }    
    
//construtor das partes
 public PC1(String numero,String marca, String modelo, int cilindrada,ArrayList<Piloto> pl) {
    super(numero,marca, modelo, cilindrada, pl);
  }   
 
//construtor de copia   
 public PC1(Carros c) {
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
     return "Prototipo Classe-1" + "::" + super.toString();
  }  
 
 /**clone
 */
  public PC1 clone() { return new PC1(this); }    
    
    
    
}

