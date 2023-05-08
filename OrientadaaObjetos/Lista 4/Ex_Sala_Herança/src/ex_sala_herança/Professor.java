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
public class Professor extends Pessoa {
    private String matriculaprof;
    private String materia;
    
    
    @Override
    public void cadastrar(){
       super.cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o cadastro do professor: ");
        System.out.println("MATRICULA: ");
        matriculaprof = leia.nextLine();
        System.out.println("MATERIA: ");
        materia = leia.nextLine();
        
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("MATRICULA: "+matriculaprof);
        System.out.println("MATERIA: "+materia);
    }
}
