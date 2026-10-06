/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha;

/**
 *
 * @author veronica62924506
 */
public class Tabuleiro {
    private int notaJ1;
    private int notaJ2;
    private String regras;
    public boolean houveGanhadorUltRodada;
    private int jogadorDaVez;
    private char a1 = ' ',a2 = ' ',a3 = ' ',b1 = ' ',b2 = ' ',b3 = ' ',c1 = ' ',c2 = ' ',c3 = ' ';

    public boolean isHouveGanhadorUltRodada() {
        return houveGanhadorUltRodada;
    }

    public void setHouveGanhadorUltRodada(boolean houveGanhadorUltimaRodada) {
        this.houveGanhadorUltRodada = houveGanhadorUltimaRodada;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }
    public Tabuleiro (String regras){
        this.regras = regras;
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.houveGanhadorUltRodada = false;
        this.jogadorDaVez = 1;
  }

    public int getJogadorDaVez() {
        return this.jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }
    public void verificarGanhador (char simbolo){
    if(a3 == simbolo && b2 == simbolo && c1 == simbolo){

    }else if( a1 == simbolo &&  a2 == simbolo &&  a3 == simbolo){
        
    }else if( a2 == simbolo &&  b2 == simbolo &&  c2 == simbolo){
        
    }else if( a3 == simbolo && b3 == simbolo &&  c3 == simbolo){
        
    }else if( a1 == simbolo &&  b2 == simbolo &&  c3 == simbolo){
        
    }else if( c1 == simbolo && c2 == simbolo && c3 == simbolo){
        
    }else if( b1 == simbolo && b2 == simbolo && b3 == simbolo){
        
    }else if( a1 == simbolo && b1 == simbolo && c1 == simbolo){
            
    }else if( c1 == simbolo && b2 == simbolo && a3 == simbolo){
}
    }
    public void organizar (){
    
}
    public void mostrarTabuleiro(){
        System.out.printf( """
                            A       B       C
                                |       |       
                      1     %C  |   %C  |  %C
                                |       |       
                         -------+-------+-------
                                |       |       
                      2     %C  |   %C  |  %C  
                                |       |       
                         -------+-------+-------                       
                                |       |       
                      3     %C  |   %C  |  %C   
                                |       |       
                         """, a1, b1 , c1 , a2 , b2 , c2 , a3 , b3 , c3);
    }
    
    public void marcarJogada(char simbolo,String coordenada){
     switch(coordenada){
         case "A1" -> this.a1 = simbolo;
             
         case "A2" -> this.a2 = simbolo;
             
         case "A3" -> this.a3 = simbolo;
             
         case "B1" -> this.b1 = simbolo;
             
         case "B2" -> this.b2 = simbolo;
             
         case "B3" -> this.b3 = simbolo;
             
         case "C1" -> this.c1 = simbolo;
             
         case "C2" -> this.c2 = simbolo;
             
         case "C3" -> this.c3 = simbolo;
     }   
    }

    void marcarJogador(char simbolo, String local) {
    }
            
}
