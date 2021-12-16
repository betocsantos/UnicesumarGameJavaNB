/*
UNICESUMAR
Acadêmico: Roberto Carlos dos Santos
R.A.: 1719521-5
Curso: Engenharia de Software
Disciplina: TCC 2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesumargamejavanb;

import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author beto_
 */
public class UnicesumarGameJavaNB {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc = new Scanner (System.in);
        TelaGame telaGame= new TelaGame();
        telaGame.setVisible(true);
        telaGame.setTitle("DESAFIE OS CONHECIMENTOS – GEOGRAFIA E HISTÓRIA");
        System.out.println("Classe principal");
        /*UnicesumarGameJavaNB unicesumargamejavanb = new UnicesumarGameJavaNB();
        UnicesumarGameJavaNB.metodoUnicesumarGameJavaNB();*/

         String jogadorUm = null, jogadorAdd = null, nomeEngine = "JAVA - NetBeans", 
                nomeDesenvolvedora = "Projeto de Roberto Carlos dos Santos, RA 1719521-5 \n Graduando em Engenharia de Software, UNICESUMAR";
        int pontos = 0, vida = 3, opcao = 0;
        double stage = 1.1;
    
        System.out.println(" "+nomeEngine);
        //nomeEngine = sc.nextLine(); 
        System.out.println(" "+nomeDesenvolvedora);
        //nomeDesenvolvedora = sc.nextLine();
        System.out.println("Desafie os Conhecimentos - História e Geografia");
    
//MENU DA TELA DE TÍTULO
        System.out.println("Modo História"+opcao);
        System.out.println("Modo Competição"+opcao);
        System.out.println("Opções do jogo"+opcao);
        opcao = sc.nextInt();
        //Anulando opções desnecessárias.
        while (opcao >= 4){
                System.out.println("Modo História"+opcao);
                System.out.println("Modo Competição"+opcao);
                System.out.println("Opções do jogo"+opcao);
                opcao = sc.nextInt();
            }
//Escolha dos menus.
        switch(opcao){
            //Entra no modo história (single player).
            case 1: System.out.println("INICIAR MODO HISTÓRIA");
                modoHistoria modohistoria = new modoHistoria();
                modoHistoria.metodoHistoria();
            break;
            //Entra no modo competição (compete contra outros jogadores).
            case 2: System.out.println("INICIAR MODO COMPETIÇÃO");
                modoCompeticao modocompeticao = new modoCompeticao();
                modoCompeticao.metodoCompeticao();
            break;
            //Entra nas opões do jogo.
            case 3: System.out.println("OPÇÕES DO JOGO");
                opcaoDoJogo opcaodojogo = new opcaoDoJogo();
                opcaoDoJogo.metodoOpcaoDoJogo();
            break;
        }
    
        System.out.println("Fim do código.");
    }//public static void main   

    public static void metodoUnicesumarGameJavaNB() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//public static void metodoUnicesumarGameJavaNB()

    /*public void setVisible(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*///velho

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//public class UnicesumarGameJavaNB
