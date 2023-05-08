/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

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
        Scanner leia = new Scanner(System.in);
        Livro l = new Livro();
        l.cadastrar();
        l.imprimir();
        /*System.out.println("MENU:\n"
                + "Cadastrar          1\n"
                + "Imprimir           2\n"
                + "Sair               0\n");
        int op = leia.nextInt();
        do {
            switch (op) {
                case 1:
                    l.cadastrar();
                    break;
                case 2:
                    System.out.println(l.toString());
                    break;
            }
        }while (op != 0);*/
                
            
    }
    
}
