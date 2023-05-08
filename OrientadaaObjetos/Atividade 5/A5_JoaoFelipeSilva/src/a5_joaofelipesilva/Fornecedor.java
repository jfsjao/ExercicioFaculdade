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
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida ;
    private double saldo;
    
    
    protected void Cadastrar(){
        super.Cadastrar();
        Scanner leia = new Scanner(System.in);
        System.out.println("Valor do credito do usuario: ");
        valorCredito = leia.nextDouble();
        System.out.println("Valor da divida do usuario: ");
        valorDivida = leia.nextDouble();       
    }
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Valor do credito: "+valorCredito+"\nvalorDivida: "+valorDivida+"\nSaldo: "+saldo);
    }
    
    protected void obterSaldo(){
       saldo = valorCredito - valorDivida;
       
    }
    
}
