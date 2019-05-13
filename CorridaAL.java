

/**Classe que permite criar uma lista de circuitos */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;


public class CorridaAL implements Serializable {
      
   private ArrayList<Carros> lstCarros; 
   private ArrayList<Circuito> lstCircuitos;
    
/**construtor vazio */
  public CorridaAL() {
     this.lstCarros =new ArrayList<Carros>();
     this.lstCircuitos =new ArrayList<Circuito>();
    }    
 /**Construtore das partes */
  public CorridaAL(ArrayList<Carros> lstCar,ArrayList<Circuito> lstCir) {    
      this.lstCarros = lstCar;
      this.lstCircuitos = lstCir;
    }
  
 /**Construtor de copia */
   public CorridaAL(CorridaAL r) { 
     this(r.getLstCarro(),r.getLstCircuito() ); 
     
   } 
    
 //Metodos  
/**@return lista de carros  */ 
  public ArrayList<Carros> getLstCarro(){ return this.lstCarros; } 
  
/**@return lista de circuitos */  
  public ArrayList<Circuito> getLstCircuito(){return this.lstCircuitos;} 
  
/**@param lstCarros. Adicionar um carro ao arraylist 
  public void setLstCarros(ArrayList<Carros> lstCarros) {
        this.lstCarros = lstCarros;
   } */

/**@param lstCir. Adicionar um circuito ao arraylist    */
  public void setLstCircuitos(ArrayList<Circuito> lstCir) {
        this.lstCircuitos = lstCir;
   } 
 
    
    
/**CARRROS */
/**Metodos usuais /inserir/remover/procurar/listar/
 */  
 

 /**@param po. Adicionar um carro ao arraylist */
  public void adCarro(ArrayList<Carros> ca){ 
     lstCarros.addAll(ca);
   }
  
  
/**@param numeroDosCarros.Numeros dos carros dos circuitos criados */
  public ArrayList<Carros> numeroDosCarros() {
   ArrayList lst = new ArrayList();
  
   for(Iterator it = lstCircuitos.iterator(); it.hasNext();) {
      ArrayList numero = ((Circuito) it.next()).getCarros();
       lst.add(numero);
    }
    return lst;
  } 

/**@return o numero de carros */
   public int getQt(){
     ArrayList lst = new ArrayList();
     int soma=0;
   for(Iterator it = lstCircuitos.iterator(); it.hasNext();) {
      ArrayList numero = ((Circuito) it.next()).getCarros();
       soma=numero.size(); 
    }  
     
     return soma;
   }    
   
  
      
   
  /**consulta carro de um circuito */
   public ArrayList coCircuito(String idcircuito){
   ArrayList lst = new ArrayList();
   Circuito c= new Circuito(); 
   boolean existe=false;   
   
     Iterator<Circuito> it = lstCircuitos.iterator();
      while(it.hasNext() ) { 
          if(it.next().getId().equals(idcircuito)) existe = true; {
             ArrayList numero = ((Circuito) it.next()).getCarros();
             lst.add(numero);                                                 
          }
       }   
    return lst;
   }  
   
   
    

   
/**CIRCUITOS como arraylist*/
/**Metodos usuais /inserir/remover/procurar/listar/
 */   
   
 /**@param ct.Criar um novo circuito */
  public void adCircuitos(Circuito ct){
    this.lstCircuitos.add(ct.clone());
  }   
  
  /**usei para ler ficheiros */
  public void adlstCircuitos(ArrayList ci){  
     lstCircuitos.addAll(ci);
   }
   
 
  
 /**@return lista todos os circuitos */ 
  public List<Circuito> coCirc() {
   ArrayList circlst = new ArrayList();
  //   if(this.lstproduto != null) {
       for (Circuito c : this.lstCircuitos) {  
          if(c.getId().equals(c.getId()))  
            circlst.add(c.clone());
          }
     return circlst;
   }  
   
 /**@return Lista com os codigo de todos os circuitos  */  
  public ArrayList<Circuito> NomeDosCircuitos() { 
   ArrayList nomesList = new ArrayList();
    String nomes="";
     for(Iterator it = lstCircuitos.iterator(); it.hasNext();) {
        nomes = ((Circuito) it.next()).getId();
        nomesList.add(nomes);  
     }
    return nomesList;
  }  
     
 /**@return o numero de circuitos */
   public int getQtc(){
     return lstCircuitos.size();
   }   
      
 /**@param no. Verifica se existe circuito dado o nome */
   public boolean existeCircuitos(String no) {
     boolean existe = false;
     Iterator<Circuito> it = lstCircuitos.iterator();
       while(it.hasNext() && !existe) { 
          if(it.next().getId().equals(no)) existe = true; 
       } 
      return existe; 
    }    


    
     
//Metodos complementares
  
 /** Equals */ 
 public boolean equals(Object o) {
  if (o == null) { return false;
    }
  if (getClass() != o.getClass()) { return false;
    }   
  CorridaAL other = (CorridaAL) o;
  if (this.lstCarros != other.lstCarros && 
  (this.lstCarros == null || !this.lstCarros.equals (other.lstCarros))) {
   return false;
        } 
  if (this.lstCircuitos != other.lstCircuitos && 
  (this.lstCircuitos == null || !this.lstCircuitos.equals(other.lstCircuitos))) {
   return false;
        }
   return true;
  }
    
 /** toString  */
   public String toString() {
    StringBuilder s = new StringBuilder(); 
     for(Circuito m : lstCircuitos)
         s.append(m.toString());          
      return s.toString();
   }   
   
 /** clone */ 
  public CorridaAL clone() {return new CorridaAL(this); }   
   
  }


   
   
   


