/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismosop;

/**
 *
 * @author joaof
 */
public class PolimorfismoSOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int perimetro;
        Poligonos p = new Poligonos();
        
        System.out.println(p.calculoperimetro(2, 3, 4));
        System.out.println(p.calculoperimetro(3, 5, 6, 7));
        System.out.println(p.calculoperimetro(3, 5, 6, 7, 5, 6));
        System.out.println(p.calculoperimetro(3, 5, 6, 7, 5, 5, 9));
        System.out.println(p.calculoperimetro(3, 5, 6, 7, 5));
    }
    
}
