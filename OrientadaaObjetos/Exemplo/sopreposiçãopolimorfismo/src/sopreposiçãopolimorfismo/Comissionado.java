/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopreposiçãopolimorfismo;

/**
 *
 * @author joaof
 */
public class Comissionado extends Empregado{
    double salario;
    double salariobase = 2000;
    double comissao;
    double quantidade;

    public Comissionado( double comissao, double quantidade) {
       
        this.comissao = comissao;
        this.quantidade = quantidade;
    }
    
    @Override
    public double calcularSalario(){

        salario = salariobase+(comissao*quantidade);
        return salario;
    }
 

}
