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
public class PorItem extends Empregado{
    private String nome;
    private String sobrenome;
    private double salariof = 1200;
    private double salario;
    private double valprod;
    private int quantprod;
    
    public PorItem(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        
    }
    public double retornarSalario(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantidade produzida: ");
        quantprod = leia.nextInt();
        System.out.println("Valor por produto: ");
        valprod = leia.nextDouble();
        salario = salariof+(quantprod*valprod);
        
        System.out.println("O salario do empregado por item: "+salario);
        return salario;
        
    } 
}
