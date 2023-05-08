/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_funcionario;

import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Funcionario {
    private String nome;
    private float salario;

    protected void cadastrar(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o cadastro do usuario: ");
        System.out.println("NOME: ");
        nome = leia.nextLine();
        System.out.println("Insira o valor do salario: ");
        salario = leia.nextFloat();
     
    }
    protected void mostrar(){
        
        System.out.println("O nome do usuario e: "+nome);
        System.out.println("O salario do funcionario e: "+salario);
    }
    
}
