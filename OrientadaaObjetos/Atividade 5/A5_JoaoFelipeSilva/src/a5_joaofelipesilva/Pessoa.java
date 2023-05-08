/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a5_joaofelipesilva;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    
    }
    
    protected void Cadastrar(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");
        nome = leia.nextLine();
        System.out.println("Digite o endereco do usuario: ");
        endereco = leia.next();
        System.out.println("Digite o telefone do usuario: ");
        telefone = leia.next();
        
    }
    
    protected void Imprimir(){
        System.out.println("O usuario: \nNome: "+nome+"\nEndereco: "+endereco+"\nTelefone: "+telefone);
    }
}
