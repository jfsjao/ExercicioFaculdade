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
public class PorHora extends Empregado{
    private String nome;
    private String sobrenome;
    private double salario;
    private double salariof;
    private int hora;
    private double vhora = 15.5;
    
    public PorHora(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public double retornarSalario(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantas horas foram trabalhadas: ");
        hora = leia.nextInt();
        
        salario = salariof+(hora*vhora);
          
        System.out.println("O salario do empregado por hora: "+salario);
        return salario;w
    } 
}
