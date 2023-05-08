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
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    protected void cadastrar(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Preencha o cadastros do usuario: ");
        System.out.println("NOME: ");
        nome = leia.nextLine();
        System.out.println("CPF: ");
        cpf = leia.nextLine();
        System.out.println("IDADE: ");
        idade = leia.nextInt();
    }
    protected void imprimir(){
        System.out.println("NOME: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("IDADE: "+idade);
    }
}
