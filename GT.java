

import java.io.Serializable;
import java.util.ArrayList;


   
public class GT extends Carros implements Serializable{

//construtor vazio 
  public GT() {
   super();
  } 

  public GT(String numero,String marca, String modelo, int cilindrada, ArrayList<Piloto> pl) {
        super(numero,marca, modelo, cilindrada, pl);
    }

//construtor de copia 
 public GT(Carros c) {
     super(c);
  }  

//metodos  
  
  
 //este metodo e diferente em todas as classes de carros
 public double tempoProximaVolta() {
     throw new UnsupportedOperationException("Not supported yet.");
 } 
 
  
//METODOS COMPLEMENTARES
/**toString
 */
 public String toString() {
  return "Grande Turismo" + "::" + super.toString();
 }  
  
/**clone
 */
  public GT clone() { return new GT(this); }  

   
}

    

    
    

