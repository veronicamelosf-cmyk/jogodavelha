/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodavelha;

/**
 *
 * @author veronica62924506
 */
public class JogoDaVelha {
          public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Tabuleiro tabuleiro = new Tabuleiro ("1 - Cada jogador deve escolher um simbolo; 2 - O jogador 1 inicia a partida");
        
        Jogador jogador1 = new Jogador (1,"Ana Beatrice",'X');
        Jogador jogador2 = new Jogador (2,"Marina",'O');
        
        tabuleiro.mostrarTabuleiro();
         
        do{
            tabuleiro.mostrarTabuleiro();
            
            if(tabuleiro.getJogadorDaVez() == 1){
            System.out.println("Jogador 1 , escolha onde jogar :");
            String local = entrada.nextLine();
            
            tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
        }
        else{
                System.out.println("Jogador 2 , escolhar onde jogar : ");
            }
            
            tabuleiro.setHouveGanhadorUltimaRodada(true);
        while (tabuleiro.isHouveGanhadorUltimaRodada() == false)
        }
        
        
        
