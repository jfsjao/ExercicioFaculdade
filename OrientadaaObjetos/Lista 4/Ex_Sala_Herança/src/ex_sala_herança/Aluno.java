/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_sala_herança;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Aluno extends Pessoa {
    private String matricula;
    private float nota;
    private String curso;
    
       public void cadastrar(){
        super.cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o cadastro do professor: ");
        System.out.println("MATRICULA: ");
        matricula = leia.nextLine();
        System.out.println("curso: ");
        curso = leia.nextLine();
        System.out.println("NOTA: ");
        nota = leia.nextInt();
        
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("MATRICULA: "+matricula);
        System.out.println("CURSO: "+curso);
        System.out.println("NOTA: "+nota);
    }
}
