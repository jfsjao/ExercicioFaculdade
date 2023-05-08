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
public class Secretaria extends Funcionario{
    private int ramal;
    
    @Override
    public void cadastrar(){
        super.cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Preencha o cadastro do usuario: ");
        System.out.println("Ramal: ");
        ramal = leia.nextInt();
        
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Ramal: "+ramal);
    }
}
    

