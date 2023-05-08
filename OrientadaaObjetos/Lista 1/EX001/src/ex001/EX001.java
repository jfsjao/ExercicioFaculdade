/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex001;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class EX001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,z; 
        Scanner leia = new Scanner(System.in);
        
        System.out.println("De o valor de A: ");
        a=leia.nextInt();
        System.out.println("De o valor de B: ");
        b=leia.nextInt();
        
        if(a>=0 || b>=0){
            z=a;
            a=b;
            b=z;
   
        }
        System.out.println("O valor de A: "+a+"\nO valor de B: "+b);
    }
    
}
