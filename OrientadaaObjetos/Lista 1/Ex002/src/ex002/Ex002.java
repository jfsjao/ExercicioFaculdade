/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex002;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Ex002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[6];
        int i, idx_maior;
        int maior   =0;
        Scanner leia = new Scanner(System.in);
        
        for ( i = 0; i<6; i++) {
            System.out.println("Preencha o vetor :  "); 
            a[i]= leia.nextInt();
        
        if (a[i]>maior){
             maior = a[i];
         }
        }
        System.out.println("o maior numero e: " + maior);
    }
    
}
