

import java.io.*;
import java.util.*;

public class Piloto implements Serializable {
   
  private String nome;
  private String nacionalidade;
  private String palmares;
  private String qualidade;

  
//construtor vazio
   public Piloto() {
    this.nome="";
    this.nacionalidade="";
    this.palmares="";
    this.qualidade="";            
    }
  
//construtor das partes
    public Piloto(String no, String nac, String pal, String cap) {
     this.nome = no;
     this.nacionalidade = nac;
     this.palmares = pal;
     this.qualidade = cap;
    }
    
 //construtor de copia   
   public Piloto (Piloto p) {
     this(p.getNome(),p.getPalmares(),p.getQualidade(),p.getQualidade());  
   } 
    
    
    /**@return the value of qualidade */
    public String getQualidade() {
        return qualidade;
    }
    private String capacidade;

    /**@return the value of capacidade */
    public String getCapacidade() {
        return capacidade;
    }

    /**@param capacidade new value of capacidade */
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    /**@param qualidade new value of qualidade */
    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
          
    /**@return the value of palmares */
    public String getPalmares() {
        return palmares;
    }

    /**@param palmares, valor de palmares */
    public void setPalmares(String palmares) {
        this.palmares = palmares;
    }

    /**@return  nacionalidade  */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**@param nacionalidade nova naconalidade*/
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**@return nome do piloto*/
    public String getNome() {
        return nome;
    }

    /**@param nome do piloto */
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    
//Metodos complementares
 /**toString */
  public String toString() {
   StringBuilder s = new StringBuilder();  
    //s.append();s.append("\n");
    s.append("\n");
    s.append("      "+"nome=" + this.nome); s.append(" ");
    s.append("nacionalidade=" + this.nacionalidade); s.append(" ");
    s.append("palmares=" + this.palmares);s.append(" ");
    s.append("qualidade=" + this.qualidade); s.append(" ");
    //s.append(""); s.append("\n");
  return s.toString();
 }

 /**clone*/    
   public Piloto clone() {return new Piloto(this); }   
    
    
}
