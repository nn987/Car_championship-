

/**Esta classe permite adicionar uma lista de carros a um circuito
   circuito -->{list de carros} */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Circuito implements Serializable {

//variaveis de instancia
  private String id;  //nome do circuito  
  private String tempomedio;
  private String distancia;
  private String numvoltas;
  private String desviotempomedio;
  private String tempPerdido;
  private String temporecordpista;
  private Boolean chove;
  private ArrayList<Carros> lstcarros;

  
  //Construtor vazio
   public Circuito() {
     this.id="";  
     this.tempPerdido="";        
     this.desviotempomedio="";
     this.distancia="";
     this.numvoltas="";
     this.tempPerdido="";
     this.temporecordpista="";
     this.chove=false;
     this.lstcarros = new ArrayList(); 
   }

//construtor das partes
    public Circuito(String id,String tmed,String dist, String nvoltas, String desv, 
             String tperd, String trec,Boolean pm,ArrayList <Carros>ca) {
      this.id= id;
      this.tempomedio = tmed;
      this.distancia = dist;
      this.numvoltas = nvoltas;
      this.desviotempomedio = desv;
      this.tempPerdido = tperd;
      this.temporecordpista = trec;
      this.chove = pm;
      this.lstcarros = ca;
    }
   
 //costrutor de copia 
    public Circuito (Circuito c) {
       this(c.getId(),c.getDistancia(),c.getNumvoltas(),c.getTempPerdido(),
            c.getTempomedio(),c.getTemporecordpista(),c.getDesviotempomedio(),
            c.getpiso(),c.getCarros()); 
     }
  
  
/**@return lista de carros de um circuito */
   public ArrayList<Carros> getCarros() { return lstcarros; } 

    
   
        
   
//CARROS   
/**@param adiciona carro a um circuito */
  public ArrayList setCarros(Carros c ) {
     ArrayList lst = new ArrayList();   
      lstcarros.add(c);
   return lstcarros;
 }
      
   
   
 
/**lista numeros dos carros de todos os circuitos */
   public List<Carros> coCircuito(){
   ArrayList lst = new ArrayList();
   Circuito c= null; 
   String carros="";
   boolean existe=false;
     for(Iterator it = lstcarros.iterator(); it.hasNext();) {
        carros = ((Carros) it.next()).getNumero();
        lst.add(carros);  
     }
      return lst;  
        
  } 
   

  
   

//CIRCUITOS   


/**@return nome da pista */    
    public String getId() { return id; }

/**@return valor do Tempo record da pista */    
    public String getTemporecordpista() { return temporecordpista; } 
    
/**@return  o tempPerdido na box */
    public String getTempPerdido() { return tempPerdido; }
    
/**@return o valor do desvio tempo medio */
    public String getDesviotempomedio() { return desviotempomedio; }
   
/**@return numero de voltas */
    public String getNumvoltas() { return numvoltas; } 
    
/**@return ovalor do tempomedio */    
    public String getTempomedio() { return tempomedio; }
    
/**@return distancia precorrida */    
    public String getDistancia() { return distancia; }
    
/**@return tipo de piso. seco ou molhado */    
    public boolean getpiso(){ return this.chove; }
    
/**@param nomeDoCircuito. novo nome de uma pista*/
    public void setId(String nomeDoCircuito) {this.id = nomeDoCircuito; }
    
/**@param Temporecordpista. novo valor de Tempo record pista*/
    public void setTemporecordpista(String temporecordpista) {
        this.temporecordpista = temporecordpista;
    }

/**@param tempPerdido. novo valor do tempo perdido */
    public void setTempPerdido(String tempPerdido) {
        this.tempPerdido = tempPerdido;
    }
  
/**@param desviotempomedio. novo valor do desviotempomedio */    
    public void setDesviotempomedio(String desviotempomedio) {
        this.desviotempomedio = desviotempomedio;
    }

/**@param numvoltas. novo valor de numvoltas */ 
    public void setNumvoltas(String numvoltas) {
        this.numvoltas = numvoltas;
    }
   
/**@param tempomedio. new value of tempomedio */
    public void setTempomedio(String tempomedio) {
      this.tempomedio = tempomedio;
    }

/**@param distancia. novo valor de disntancia */
    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    
/**@param pm. estado da pista */
    public void setpiso(boolean pm) {
      this.chove = pm;
    }

  
  
 //Metodos complementares   
 
/**toString */
  public String toString() {
   StringBuilder s = new StringBuilder();  
    s.append("Circuitos:");s.append("\n");
    s.append("");
    s.append("id=" + this.id); s.append("\n");
    s.append("tempo medio=" + this.tempomedio); s.append("\n");
    s.append("distancia=" + this.distancia);s.append("\n");
    s.append("numero de voltas=" + this.numvoltas); s.append("\n");
    s.append("desvio do tempo medio=" + this.desviotempomedio); s.append("\n");
    s.append("tempo perdido=" + this.tempPerdido); s.append("");
    s.append("tempo recorde da pista=" + this.temporecordpista); s.append("\n");
    s.append("chove S/N =" + this.chove ); s.append("\n");
    s.append("Carros=" + this.lstcarros ); s.append("\n");    
    s.append("\n+++++++++++++++ "); s.append("\n");
  return s.toString();
 }
 
  /** equals 
  */
 public boolean equals(Object o){
    if(o==this) return true;
    if(o==null || o.getClass()!=this.getClass()) return false;
       Circuito c = (Circuito) o;
   return this.id.equals(c.getId());
}

 /**clone */
  public Circuito clone(){ return new Circuito(this); }

 }

