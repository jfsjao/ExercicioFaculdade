/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_ventilador;

/**
 *
 * @author joaof
 */
public class Ventilador{
    private boolean status;
    private int velocidade;
    private int x = 1;
    
    public void ligar(){
        status = true;
        velocidade = x;
        
    }
    public void desligar(){
        status = false;
        velocidade = x;
        
    }
    public void mostrar(){
        if(status == true){
            System.out.println("O ventilador esta ligado!!");
            System.out.println("A velocidade: "+velocidade);
        }else{
            System.out.println("O ventilador esta desligado!!");
       
        }
        
    }
    public void aumentarvel(){
        x = x + 1;
        velocidade = x;
        if(velocidade>=3){
            System.out.println("A velocidade do ventilador vai de 1 a 3");
            velocidade = 3;
        }
    }
    public void diminuirvel(){
        x = x -1;
        velocidade = x;
        if(velocidade<=1){
            System.out.println("A velocidade do ventilador vai de 1 a 3");
            velocidade = 1;
        }
    }
}

