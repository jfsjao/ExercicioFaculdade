/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_ventilador;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Ex5_Ventilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        Ventilador v = new Ventilador();
        
        v.mostrar();
        v.ligar();
        v.mostrar();
        v.desligar();
        v.mostrar();
        v.ligar();
        v.aumentarvel();
        v.aumentarvel();
        v.aumentarvel();
        v.aumentarvel();
        v.mostrar();
        v.diminuirvel();
        v.mostrar();  
        v.diminuirvel();
        v.mostrar();  
        v.diminuirvel();
        v.mostrar();             
    }     
    
}
