/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_funcionario;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Gerente extends Funcionario {
    private int usuario;
    private String senha;
    
    @Override
    public void cadastrar(){
        super.cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o cadastro do usuario: ");
        System.out.println("Usuario: ");
        usuario = leia.nextInt();
        leia.nextLine();
        System.out.println("Insira a senha do usuario: ");
        senha = leia.nextLine();
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("O usuario: "+usuario);
        System.out.println("Com a senha: "+senha);
    }
}
