

/**classe jogador.Onde se gere o campeonato 
 * Onde criam podem criar apostas e os dados do jogador
 * Um HashMap : jogador ---> circuitos 
 */

import java.util.*;
import java.io.*;

public class Campeonato implements Serializable {
    
//variaveis de instancia   
  private Map<String,Circuito> jmap; 
  private CorridaAL lstcircuito; 
  private String nome;
  private String morada;
  private Map<String,ArrayList> apostas;
  private double conta;
   
  
//Construtores      
/** construtor vazio */
 public Campeonato(){
  this.jmap=new HashMap<String,Circuito>(); 
  this.lstcircuito = new CorridaAL();
  this.nome = "";
  this.morada = "";
  this.apostas = new HashMap();
  this.conta = 0.0;
 }

/**construtor das partes */
 public Campeonato(Map<String,Circuito> jm,CorridaAL lstci,
        String jg,String mor,Map<String,ArrayList> apo,double con) {
   this.jmap = jm;
   this.lstcircuito = lstci;  
   this.nome = jg;
   this.morada = mor;
   this.apostas = apo; 
   this.conta = con;
 }
  
/**construtor de copia  */
 public Campeonato(Campeonato j ){
  this(j.getLstJogadores(),j.getlstcircuito(),j.getNome(),
          j.getMorada(),j.getlstapostas(),j.getConta()); 

 } 
 
 
/**@return Lista jogadores */   
 public Map<String,Circuito> getLstJogadores(){ return this.jmap; }   

/**@return Lista circuitos */ 
 public CorridaAL getlstcircuito() {return this.lstcircuito; }
 
/**@return Lista apostas */ 
 public Map<String,ArrayList> getlstapostas() {return this.apostas; }
 
 
//METODOS
/**Criar um hashmap de jogador para listaDeCircuitos.
/**inscreve jogador num circuito. Nome do jogador--> [circuitos]*/  
/**@param nome do jojador. nome do circuito  */
  public void criaJogador(String no,Circuito c) {    
  jmap.put(no,c.clone()); 
   lstcircuito.adCircuitos(c);
  }   
 
/**criar as apostas */
/**apostar nos carros de um circuito */
/**@param nome,Circuito,ArrayList<Carros>  */
 public void carrosJogador(String nome,Circuito id,ArrayList<Carros> c) {
  CorridaAL ci= null;  
  ArrayList ap=new ArrayList();
   if(jmap.containsKey(nome));    //se existe jogador 
    Circuito ca = this.jmap.get(id); //codigo do circuito
    ap.add(c);
    apostas.put(nome,ap);                                                                  
 }       
  
/**@return o nome dos jogadores */
 public  Object coApostadores(){
   return apostas.keySet();  
 }    
 

 /**@return as apostas de um jogador */   
 /**@param nome */
 public Map coJogador(String nome){
  Map<String,ArrayList> jo= new HashMap<String,ArrayList>();   
  Carros ca=null;   
  if(jmap.containsKey(nome)); 
    ArrayList<Carros> ap = apostas.get(nome);
      jo.put(nome,ap);   
   return jo; 
  }
   
  
/**--------------*/    
/**FICHEIROS*/    
/**--------------*/
    
/**Gravar em Ficheiro */
public void gravarFicheiro(String fich) throws IOException { 
      ObjectOutputStream oos = new ObjectOutputStream( 
                                new FileOutputStream(fich)); 
    Campeonato ca=null;                            
    oos.writeObject(ca); 
    
    //oos.writeObject(lstCarros);    /**guarda os dados do sistema [ok]*/
    //oos.writeObject(lstCircuitos);
    
    oos.flush(); 
    oos.close(); 
  } 
   

  
  
/**Ler Ficheiro */  
  public static Object lerFicheiro(String fich) 
                           throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fich));
    
    Campeonato te = new Campeonato();
    
    try { 
     te= (Campeonato) ois.readObject();     
     
    } finally {
       ois.close();
      }
    return te ;
  }      
    
  
  
 
//Metodos Get e set  

/** @return jogador */
  public String getNome() { return nome; }    
  
/** @return morada */
  public String getMorada() { return morada; }  

/** @return contaCorrente */
  public double getConta() { return conta; }

/** @param jogador. Novo valor de morada */
  public void setNome(String mo) { this.morada = morada; }
 
/** @param morada. Novo valor de morada */
  public void setMorada(String morada) { this.morada = morada; }  

    
//metodos complementares

 /**clone */
  public Campeonato clone(){return new Campeonato(this); }


  
  
 }

