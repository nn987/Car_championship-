

/** menu do projecto
 */

import java.util.*;
import java.io.*;
import java.lang.*;

public class Menu {

 static String nomecr,nomejr,idcircuito,numCarro,nomeficheiro;
 
 
 private static Campeonato ca = new Campeonato(); 
 private static CorridaAL corr = new CorridaAL();
 private static Circuito ci = new Circuito();
 private static ArrayList tmp = new ArrayList();
 
 

 public static void main(String args[]) {
       
 
  /******************/
 ArrayList pilotoGT,pilotoPC1,pilotoPC2,pilotoSC;
    
    pilotoGT=new ArrayList();
    pilotoPC1=new ArrayList(); 
    pilotoPC2=new ArrayList(); 
    pilotoSC=new ArrayList(); 
    
      
    /*um construtor de pilotos */
    Piloto pt1 = new Piloto("nome1","pt","123","10");
    Piloto pt2 = new Piloto("nome2","pt","12","3");
    Piloto pt3 = new Piloto("nome3","pt","12","3");
    Piloto pt4 = new Piloto("nome4","pt","12","3");
    Piloto pt5 = new Piloto("nome5","pt","12","3");
    Piloto pt6 = new Piloto("nome6","pt","12","3");
    Piloto pt7 = new Piloto("nome7","pt","12","3");
    Piloto pt8 = new Piloto("nome8","pt","12","3");
    
        
    pilotoGT.add(pt1);   //insere piloto1 na classe GT  
    pilotoGT.add(pt2);   //insere piloto2 na classe GT
    pilotoPC1.add(pt3);   //insere piloto na classe PC1  
    pilotoPC1.add(pt4);      // .
    pilotoPC2.add(pt5);      // .   
    pilotoPC2.add(pt6);      // .   
    pilotoSC.add(pt7);  //insere piloto1 na classe SC
    pilotoSC.add(pt8);
    
///////////////////////////
 /**Algumas validacoes necessarias para os carros */
 //validar a qualidade geral do piloto  
   int maxValue= 11;
   int number=2;
   if (number < maxValue){   
     //System.out.println("");  
    }
    else {
     System.out.println("valor errado");
    }
    
   //validar as cilindradas dos carros GT
   int maxCilindrada= 4500;
   int minCilindrada= 3000;
   int cilindradaGT=3500; 
    if (cilindradaGT <= maxCilindrada &&   
          cilindradaGT >= minCilindrada){   
      //System.out.println(cilindradaGT);  
    }
    else {
     System.out.println("valor errado");
    }
    
   //validar as cilindradas dos carros PC2
   int maxCilindPC2= 6000;
   int minCilindPC2= 4000;
   int pc2Cilindrada=4500; 
    if (pc2Cilindrada <= maxCilindPC2 &&   
          pc2Cilindrada >= minCilindPC2){   
      //System.out.println(pc2Cilindrada);  
    }
    else {
     System.out.println("valor errado");
    }   
    
    //validar o numero de pilotos (ainda nao uso este codigo)
    int GTp=0;
    GTp=pilotoGT.size();
    if (GTp > 2) {
      System.out.println("num.max=2"); 
    }  
    
  /////////////////////////////////////////
  //cria informacao dos CARROS 
  
     
      GT g1 = new GT("numero1","marca1","modelo1",cilindradaGT,pilotoGT);
      GT g2 = new GT("numero2","marca2","modelo2",cilindradaGT,pilotoGT);   
      GT g3 = new GT("numero3","marca3","modelo4",cilindradaGT,pilotoGT);
      GT g4 = new GT("numero4","marca4","modelo5",cilindradaGT,pilotoGT);
      GT g5 = new GT("numero5","marca5","modelo6",cilindradaGT,pilotoGT);
      GT g6 = new GT("numero6","marca6","modelo7",cilindradaGT,pilotoGT);
           
      PC1 p1 = new PC1("numero7","marca2","modelo2",6000,pilotoPC1);
      PC1 p2 = new PC1("numero8","marca2","modelo2",6000,pilotoPC1);
      PC1 p3 = new PC1("numero9","marca3","modelo3",6000,pilotoPC1);
      PC1 p4 = new PC1("numero10","marca4","modelo4",6000,pilotoPC1);
      PC1 p5 = new PC1("numero11","marca5","modelo5",6000,pilotoPC1);
      PC1 p6 = new PC1("numero12","marca6","modelo6",6000,pilotoPC1);
      
      PC2 c1 = new PC2("numero13","marca3","modelo3",pc2Cilindrada,pilotoPC2);      
      PC2 c2 = new PC2("numero14","marca2","modelo2",pc2Cilindrada,pilotoPC2);
      PC2 c3 = new PC2("numero15","marca3","modelo3",pc2Cilindrada,pilotoPC2);
      PC2 c4 = new PC2("numero16","marca4","modelo4",pc2Cilindrada,pilotoPC2);
      PC2 c5 = new PC2("numero17","marca5","modelo5",pc2Cilindrada,pilotoPC2);
      PC2 c6 = new PC2("numero18","marca6","modelo6",pc2Cilindrada,pilotoPC2);
      
      SC s1 = new SC("numero19","marca4","modelo4",2500,pilotoSC);
      SC s2 = new SC("numero20","marca2","modelo2",2500,pilotoSC);    
      SC s3 = new SC("numero21","marca3","modelo3",2500,pilotoSC);    
      SC s4 = new SC("numero22","marca4","modelo4",2500,pilotoSC);    
      SC s5 = new SC("numero23","marca5","modelo5",2500,pilotoSC);    
      SC s6 = new SC("numero24","marca6","modelo6",2500,pilotoSC); 
      
//CIRCUITOS
  /*um construtor de circuitos */ 
  /**este contrutor contem uma lista de carros. O ultimo parametro */
   ArrayList carros1,carros2,carros3;
   carros1 = new ArrayList();    
   carros2 = new ArrayList();
   carros3 = new ArrayList(); 
  
   /**carros1 pertencem ao circuito1 */
   /**cria-se uma lista de carros e depois usa-se o metodo definido */
   carros1=ci.setCarros(g1);
   carros1=ci.setCarros(g2);
   carros1=ci.setCarros(g3);
   carros1=ci.setCarros(g4);
   carros1=ci.setCarros(g5);
   carros1=ci.setCarros(g6);
   corr.adCarro(carros1);  //adicionar a lista de carros
  
   /**carros2 pertencem ao circuito2 */
   carros2= ci.setCarros(c1);
   carros2= ci.setCarros(c2);
   carros2= ci.setCarros(c3);
   carros2= ci.setCarros(c4);
   carros2= ci.setCarros(c5);
   carros2= ci.setCarros(c6);
   corr.adCarro(carros2);
   
   /**carros3 pertencem ao circuito3 */
   carros3= ci.setCarros(s1);
   carros3= ci.setCarros(s2);
   carros3= ci.setCarros(s3);
   carros3= ci.setCarros(s4);
   carros3= ci.setCarros(s5);
   carros3= ci.setCarros(s6);
   corr.adCarro(carros3);
      
      
Circuito cr1 = new Circuito("id1","tmed1","dist1","nvoltas1","desv1","tperd1","trec1",false,carros1);
Circuito cr2 = new Circuito("id2","tmed2","dist2","nvoltas2","desv2","tperd2","trec12",false,carros2);
//Circuito cr3 = new Circuito("id","tmed","dist","nvoltas","desv","tperd","trec",false,carroPC2);
//Circuito cr4 = new Circuito("id","tmed","dist","nvoltas","desv","tperd","trec",false,carroSC);
  
    
/** Criar um circuito */

 System.out.println("Identificacao dos parametros de um circuito:");
 System.out.println("Id,TempPerdido,Desviotempomedio,Distancia,Numvoltas,TempPerdido,");
 System.out.println("TempoRecordPista,Chove,ListaDeCarros  \n");
 
 corr.adCircuitos(cr1);
 corr.adCircuitos(cr2);   
   
 System.out.println("Identificacao dos parametros de um carro:");
 System.out.println("Marca,Modelo,Cilindrada,Lista de pilotos \n"); 
 

 System.out.println("---------------");    
 
 /**[ok] Criar jogadores para cada circuito criado */
 ca.criaJogador("gabriel",cr1);
 ca.criaJogador("ricardo",cr1);
 ca.criaJogador("joao",cr2);
        
 System.out.println("---------------");   
 ArrayList apostas,apostas2;
 apostas=new ArrayList();
 apostas2=new ArrayList(); 
  
 apostas.add(g1);
 apostas.add(g2);
 
 apostas2.add(c1);
 apostas2.add(c2);
 apostas2.add(c3);
  
 ca.carrosJogador("gabriel",cr1,apostas); 
 ca.carrosJogador("ricardo",cr2,apostas2);   
 
 
     
 /**MENU */ 
    int opção;          
        System.out.println("RCManager");
        do {
            opção = menu();
            executa(opção);
        } while (opção !=0);
        System.out.println("fim!");
    }

    private static int menu() {
    int op;

    System.out.println(" ** Opções **");
    System.out.println("1 -  Lista todos os circuitos");
    System.out.println("2 -  Codigo dos circuitos");
    System.out.println("3 -  Consulta circuito");
    System.out.println("4 -  Numero dos carros");
    System.out.println("5 -  Verificar se existe circuito");
    System.out.println("6 -  Quantidade de carros nos circuitos");
    System.out.println("7 -  Numero de circuitos");
    System.out.println("8 -  Jogadores inscritos nos circuitos");
    System.out.println("9 -  Lista apostas de todos os jogadores");
    System.out.println("10 - nome dos jogadores");
    System.out.println("11 - apostas de um jogador");
    System.out.println("12 - Abrir Ficheiro");
    
    System.out.println("0 -  SAIR");
    
    do {
         op = Input.lerInt();
         System.out.println("\n");
        } while (op<0 || 12<op);
        
        return op;
    }
    
    private static void executa(int op) {
                                          
        switch(op) {
            case 1: System.out.println("Lista todos os circuitos:");
                    System.out.println(corr.coCirc());  
                    System.out.println("\n\n");
                    
                    break;
                    
            case 2: System.out.println("Codigo dos circuitos:");
                    System.out.println(corr.NomeDosCircuitos());                           
                    System.out.println("\n\n");  
                                        
                    break;
                    
           case 3:  System.out.println("Consulta circuito:");
                    System.out.println("codigo do circuito -->");
                    idcircuito=Input.lerString();
                    System.out.println(corr.coCircuito(idcircuito));
                    System.out.println("\n\n");
                    
                    break;
                    
           case 4:  System.out.println("Numero dos carros dos circuitos:");
                    System.out.println(corr.numeroDosCarros()); 
                    System.out.println("\n\n");
                    
                    break;
                    
           case 5:  System.out.println("Verificar se existe circuito:");
                    System.out.println("codigo do circuito -->");
                    idcircuito=Input.lerString();
                    System.out.println(corr.existeCircuitos(idcircuito));
                    System.out.println("\n\n");
                    
                    break;
                  
           case 6:  System.out.println("Quantidade de carros:");
                    System.out.println(corr.getQt());
                    System.out.println("\n");
           
                    break;
                   
           case 7:  System.out.println("Numero d2 circuitos:");
                    System.out.println(corr.getQtc());
                    System.out.println("\n");
           
                    break;
                    
           case 8:  System.out.println("Jogadores inscritos nos circuitos:"); 
                    System.out.println (ca.getLstJogadores());
                    System.out.println("\n");          
                    
                    break;
                    
           case 9:  System.out.println("Lista apostas de todos os jogadores:");                               
                    System.out.println(ca.getlstapostas());
                    System.out.println("\n");
                    
                    break;
                    
           case 10: System.out.println("nome dos jogadores");                                 
                    System.out.println(ca.coApostadores());  
                    System.out.println("\n"); 
                    
                    break;
                    
           case 11: System.out.println("apostas de um jogador");                                
                    System.out.println("nome do jogador -->");
                    nomejr=Input.lerString();
                    System.out.println(ca.coJogador(nomejr));
                    System.out.println("\n"); 
                                                              
                    break;
                    
            case 12:/*
                    System.out.println("abrir ficheiro");                                
                    System.out.println("nome do ficheiro -->");
                    nomeficheiro=Input.lerString();

                    try {     
                      ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(nomeficheiro));                           
            
                        ArrayList<Carros> car= (ArrayList<Carros>) oIn.readObject(); 
                        ArrayList<Circuito> cir= (ArrayList<Circuito>) oIn.readObject(); 
                         
                        corr.carregarSistema(car,cir);//carregar a informacao da variavel no sistema
                                                  
                        System.out.println("[ok]");       
                       } catch (IOException e) 
                            { System.out.println("[erro]"); } 
                          catch(ClassNotFoundException e)
                            { System.out.println("[erro]"); } 
                      */                                        
                        break;        
                     
                }  
                
                    
            } /**FIM Menu */
            
     }
