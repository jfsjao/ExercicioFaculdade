/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_sala_herança;

/**
 *
 * @author joaof
 */
public class Ex_Sala_Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        Professor p = new Professor();

        Aluno a[] = new Aluno[3];
        for(i=0;i<3;i++){
            System.out.println("Aluno "+i+": ");
            a[i] = new Aluno();
            a[i].cadastrar();
            a[i].imprimir();
        } 
        p.cadastrar();
        p.imprimir();
        
        
    }
    
}
