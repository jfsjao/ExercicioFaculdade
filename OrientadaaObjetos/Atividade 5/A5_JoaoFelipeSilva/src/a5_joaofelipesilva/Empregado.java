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
public class Empregado extends Pessoa{
    private int codigoSetor;
    private double imposto;
    private double salarioBase;
    private double salario;
    
    protected void Cadastrar(){
        super.Cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Codigo do setor: ");
        codigoSetor = leia.nextInt();
        System.out.println("Salario Base: ");
        salarioBase = leia.nextDouble();
        System.out.println("Imposto: ");
        imposto = leia.nextDouble();
        
    }
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Codigo do setor: "+codigoSetor+"\nSalario base: "+salarioBase+"\nImposto: "+imposto+"\nSalario liquido: "+salario);
    }
     protected void calcularSalario(){
        salario = salarioBase * imposto;
    }
}
