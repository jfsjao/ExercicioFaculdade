/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_funcionario;

/**
 *
 * @author joaof
 */
public class Ex_funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Gerente g = new Gerente();
        g.cadastrar();
        g.mostrar();
        Secretaria s = new Secretaria();
        s.cadastrar();
        s.mostrar();
  
    }
    
}
