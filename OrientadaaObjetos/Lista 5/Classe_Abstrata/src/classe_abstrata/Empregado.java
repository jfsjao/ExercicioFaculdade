/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata;

/**
 *
 * @author joaof
 */
public abstract class Empregado {
    
    private String nome;
    private String sobrenome;
    
    public Empregado(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
            
    }
    public abstract double retornarSalario();
 
}
