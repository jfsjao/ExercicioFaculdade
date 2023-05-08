/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata;



/**
 *
 * @author joaof
 */
public class Chefe extends Empregado{
    private String nome;
    private String sobrenome;
    private double salario = 5000;
    
   
    public Chefe(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public double retornarSalario(){
        System.out.println("O salario do chefe: "+salario);
        return salario;
    } 
}
