


/*
 * Carros. Classe abstracta que implementa todos os metod comuns aos carros
 */
 

import java.io.*;
import java.util.*;

public abstract class Carros implements Serializable {
    
   //variaveis de instancia
    private String numero;  //numero do carro
    private String marca;
    private String modelo;
    private int cilindrada;
    private ArrayList<Piloto> pilotos;
    
//construtores
//construtor vazio
    public Carros() {
     this.numero="";   
     this.marca="";
     this.modelo="";
     this.cilindrada=0;
     this.pilotos = new ArrayList();             
    }
    
//construtor das partes
     public Carros(String num,String mar, String mod, int cil, 
                                            ArrayList<Piloto> pl) {
        this.numero = num;
        this.marca = mar;
        this.modelo = mod;
        this.cilindrada = cil;
        this.pilotos = pl;
    }
    
//contrutor de copia
   public Carros (Carros c){
    this(c.getNumero(),c.getMarca(),c.getModelo(),
            c.getCilindrada(),c.getPilotos());          
    }     
    
 
//metodos
 
    public String getNumero() { return numero; } 
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getCilindrada() { return cilindrada; }
    public ArrayList getPilotos() { return pilotos; }

    public void setNumero(String num) { this.numero = num; }
    public void setMarca(String ma) { this.marca = ma; }
    public void setModelo(String mo) { this.modelo = mo; }
    public void setCilindrada(int ci) {this.cilindrada = ci;}   
    public void setPilotos(ArrayList pi) { this.pilotos = pi; }

 //abstractos
    public abstract double tempoProximaVolta();

    
//metodos complementares    
  /**
  * toString
  */
  public String toString() {
   StringBuilder s = new StringBuilder();  
    s.append("");s.append("\n");
    s.append("");
    s.append("      "+"Numero=" + this.numero); s.append(" ");
    s.append("Marca=" + this.marca); s.append(" ");
    s.append("Modelo=" + this.modelo); s.append(" ");
    s.append("Cilindrada=" + this.cilindrada);s.append("\n");
    s.append("Pilotos=" + this.pilotos); s.append(" ");
    s.append("\n                 +++++++++++++++ "); s.append("\n\n");
   // s.append("\n"); 
  return s.toString();
 }
    
   public abstract Carros clone();
    
}
