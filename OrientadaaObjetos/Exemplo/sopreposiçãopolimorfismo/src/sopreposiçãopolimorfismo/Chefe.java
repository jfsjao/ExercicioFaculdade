/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopreposiçãopolimorfismo;

/**
 *
 * @author joaof
 */
public class Chefe extends Empregado{
    double salariomensal;
    
    
    @Override
    public double calcularSalario(){
        salariomensal = 50000;
        return salariomensal;
    }
    
}
