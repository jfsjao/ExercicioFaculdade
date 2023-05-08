/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_tv;

/**
 *
 * @author joaof
 */
public class TV {
    private String marca;
    private String modelo;
    private int tamanho;
    private boolean ligar = false;
    private boolean volume;
    private boolean diminuir;
    public void ligarTv(){
        ligar = true;
         
    }    
    public void mostrarStatus(){
        if(ligar == true){
            System.out.println("TV - LIGADA!!");  
        }else{
            System.out.println("TV - DESLIGADA!!");
        }
        if(volume == true){
            System.out.println("A TV FOI AUMENTADA!!");  
        }else{
            System.out.println("A TV NAO FOI AUMENTADA!!");
        }
    }
    public void aumentarTv(){
       volume = true;
               }
    public void diminuirTv(){
       volume = false;
               }
}
