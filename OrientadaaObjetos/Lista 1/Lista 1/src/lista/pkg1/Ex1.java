/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg1;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o valor de A: ");
        a = leia.nextInt();
        System.out.println("Preencha o valor de B: ");
        b = leia.nextInt();
        
        if (a>=0 & b>=0) {
            c = b;
            b = a;
            a = c;
        }
        System.out.println("A = "+a+"\nB = "+b);
    
    }
    
}
