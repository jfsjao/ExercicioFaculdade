/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2_joaofelipesilva_radio;

/**
 *
 * @author joaof
 */
public class A2_JoaoFelipeSilva_Radio {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Radio R[] = new Radio[3];
        for (i = 0; i <3; i++) {            
            R[i] = new Radio();
            System.out.println("Radio "+i+": ");
            R[i].Ligar();
            R[i].Volume();       
            R[i].Frequencia();
        }
        for (i = 0; i < 3; i++) {
            System.out.println("=====================");
            System.out.println("Radio: "+i);
            System.out.println("Ligado: "+R[i].Status);
            System.out.println("Ligado: "+R[i].Volume);
            System.out.println("Ligado: "+R[i].Frequencia);
        }
        
    }
    
    
}
