/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sopreposiçãopolimorfismo;

/**
 *
 * @author joaof
 */
public class Sopreposiçãopolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Chefe ch = new Chefe();
        Comissionado co = new Comissionado(5,6);
        
        System.out.println(ch.calcularSalario());
        System.out.println(co.calcularSalario());
        
        
    }
    
}
