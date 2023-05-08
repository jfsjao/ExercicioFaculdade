/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class PorComissao extends Empregado{
    private String nome;
    private String sobrenome;
    private double salario;
    private double salariof = 1500;
    private int vendas;
    private double comissao = 0.5;
    
    public PorComissao(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public double retornarSalario(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantas vendas o empregado fez: ");
        vendas = leia.nextInt();
        salario = salariof + (comissao*vendas);
        System.out.println("O salario do empregado por comissao: "+salario);
        return salario;
        
    } 
}
