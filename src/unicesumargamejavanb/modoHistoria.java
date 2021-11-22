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

/**
 *
 * @author beto_
 */
public class modoHistoria {
    public static void metodoHistoria(){
    
    Scanner sc = new Scanner (System.in);
    String jogadorUm = null, jogadorAdd = null;
    int pontos = 0, vida = 3, opcao = 0, pergunta = 0;
    double stage = 1.1;
    //Instrução de teste. Remover depois e criar classe "Pergunta"
    
    System.out.println("Modo História");
    System.out.println("Introdução à história do jogo");
    System.out.println("Tutorial");
    
//PARÂMENTRO PARA STAGES E PERGUNTAS - Entrava em looping.
    /*do{
       do{
           
       }while (stage < 1.2); 
    } while(vida > 0);*/
    
//Perguntas
//stage 1.1 - PERGUNTA 1
    if (vida > 0){
       System.out.println("Pergunta Teste 1 - stage 1.1\n"+ pergunta);
       pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta certa 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           //stage = 1.1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 1.2;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 1.2 - PERGUNTA 2
       System.out.println("Pergunta Teste 2 - stage 1.2"+ pergunta);
       pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta certa 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 1.3;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
           
//stage 1.3 - PERGUNTA 3
       System.out.println("Pergunta Teste 3"+ pergunta);
       pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           stage = 1.3;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 1.4;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 1.4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           stage = 1.4;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 1.5;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }

//chefao1 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao1 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao1 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao1 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao1 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 2.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        System.out.println("Você vai para a fase 2.1 "+ stage);
        stage = sc.nextDouble();
       }
       
//FASE 2
//stage 2.1 - PERGUNTA 1
        System.out.println("Pergunta Teste 1 - stage 2.1"+ pergunta);
       pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1."+ opcao);
       System.out.println("Resposta certa 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           //stage = 1.1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 2.2;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 2.2 - PERGUNTA 2
       System.out.println("Pergunta Teste 2 - stage 1.2"+ pergunta);
       pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta certa 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 1.3;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
           
//stage 2.3 - PERGUNTA 3
       System.out.println("Pergunta Teste 3"+ pergunta);
       pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 2.4;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 2.4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 2.5;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }

//chefao2 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao2 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao2 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao2 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao2 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 3.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        System.out.println("Você vai para a fase 3.1 "+ stage);
        stage = sc.nextDouble();
       }
       
//FASE 3
//stage 3.1 - PERGUNTA 1
        System.out.println("Pergunta Teste 1 - stage 3.1"+ pergunta);
       pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1."+ opcao);
       System.out.println("Resposta certa 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           //stage = 1.1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 3.2;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 3.2 - PERGUNTA 2
       System.out.println("Pergunta Teste 2 - stage 1.2"+ pergunta);
       pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta certa 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 3.3;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
           
//stage 3.3 - PERGUNTA 3
       System.out.println("Pergunta Teste 3"+ pergunta);
       pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 3.4;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 3.4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 3.5;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }

//chefao3 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao3 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao3 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao3 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao3 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 4.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        System.out.println("Você vai para a fase 4.1 "+ stage);
        stage = sc.nextDouble();
       }
       
//FASE 4
//stage 4.1 - PERGUNTA 1
       System.out.println("Pergunta Teste 1 - stage 4.1"+ pergunta);
       pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1."+ opcao);
       System.out.println("Resposta certa 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           //stage = 1.1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 4.2;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 4.2 - PERGUNTA 2
       System.out.println("Pergunta Teste 2 - stage 4.2"+ pergunta);
       pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta certa 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 4.3;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
           
//stage 4.3 - PERGUNTA 3
       System.out.println("Pergunta Teste 3"+ pergunta);
       pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 4.4;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 4.4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 4.5;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }

//chefao4 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao4 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao4 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao4 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 5.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        System.out.println("Você vai para a fase 5.1 "+ stage);
        stage = sc.nextDouble();
       }

//FASE 5
//stage 5.1 - PERGUNTA 1
       System.out.println("Pergunta Teste 1 - stage 5.1"+ pergunta);
       pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1."+ opcao);
       System.out.println("Resposta certa 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           //stage = 1.1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 5.2;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 5.2 - PERGUNTA 2
       System.out.println("Pergunta Teste 2 - stage 4.2"+ pergunta);
       pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta certa 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta errada 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 5.3;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
           
//stage 5.3 - PERGUNTA 3
       System.out.println("Pergunta Teste 3"+ pergunta);
       pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida > 0 && pergunta < 5){
       stage = 5.4;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
  
//stage 5.4 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida > 0 && pergunta < 5){
       stage = 5.5;
       }
       else if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }

//chefao5 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao5 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao5 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao5 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao5 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 6.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        System.out.println("Você vai para a fase 6.1 "+ stage);
        stage = sc.nextDouble();
       }

//FASE 6 - ÚLTIMA
//stage 6.1
//chefao6 - PERGUNTA 1
      System.out.println("Pergunta Teste 1"+ pergunta);
      pergunta = 1;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       }
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao6 - PERGUNTA 2
      System.out.println("Pergunta Teste 2"+ pergunta);
      pergunta = 2;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao6 - PERGUNTA 3
      System.out.println("Pergunta Teste 3"+ pergunta);
      pergunta = 3;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao6 - PERGUNTA 4
      System.out.println("Pergunta Teste 4"+ pergunta);
      pergunta = 4;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
//chefao6 - PERGUNTA 5
      System.out.println("Pergunta Teste 5"+ pergunta);
      pergunta = 5;
       //Opções de resposta.
       System.out.println("Resposta errada 1"+ opcao);
       System.out.println("Resposta errada 2"+ opcao);
       System.out.println("Resposta certa 3"+ opcao);
       opcao = sc.nextInt();

       switch (opcao){
           case 1: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 2: System.out.println("Você errou!"+ vida + pontos);
           vida = vida -1;
           pontos = pontos *1;
           break;
           case 3: System.out.println("Resposta certa!"+ vida + pontos);
           vida = vida *1;
           pontos = pontos +1;
           break;
       } 
       if (vida <= 0){
            System.out.println("Game Over!");
            System.out.println("Sua pontuação foi "+ pontos);
        }
       if (vida > 0 && pergunta == 5){
        stage = 7.1;
        System.out.println("Você completou esta fase!");
        System.out.println("Sua pontuação foi "+ pontos);
        System.out.println("Sua vida é "+ vida);
        System.out.println("Você ganhou mais uma vida "+ pontos);
        vida = vida + 3;
        vida = sc.nextInt();
        System.out.println("VOCÊ COMPLETOU O DESAFIO. PARABÉNS!!! "+ stage);
        stage = sc.nextDouble();
       }
//PARTE FINAL!!!
    } //if (vida > 0)
    else if (vida <= 0){
        System.out.println("Game Over!");
        System.out.println("Sua pontuação foi "+ pontos);
    }
    

    

}//public static void metodoHistoria
 
}//public class modoHistoria
