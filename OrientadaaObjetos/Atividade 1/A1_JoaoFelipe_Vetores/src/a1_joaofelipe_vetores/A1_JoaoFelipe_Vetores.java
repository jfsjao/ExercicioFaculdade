/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1_joaofelipe_vetores;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class A1_JoaoFelipe_Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vt1[] = new double[5], vt2[] = new double[5], vt3[] = new double [5], total=0;       //declaração das variaveis
        int i,j;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Preencha o primeiro vetor: ");
        for( i = 0; i < 5; i++) {
            System.out.print("["+i+"]: ");
            vt1[i] = leia.nextDouble();
        }
        System.out.print("=======================\n");
        System.out.println("Preencha o segundo vetor: ");
        for( j = 0; j < 5; j++) {
            System.out.print("["+j+"]: ");
            vt2[j] = leia.nextDouble();
        }
        for ( i = 0; i < 5; i++) {
            for ( j = 0; j < 5; j++) {      
                vt3[i]= vt1[i]*vt2[j];  
            }
        }
        for ( i = 0; i < 5; i++) {
            total=total+vt3[i];
        }
        System.out.println("O total e: "+total);
    }
    
}
