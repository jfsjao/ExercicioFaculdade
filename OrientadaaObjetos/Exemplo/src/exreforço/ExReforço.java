/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exreforço;

/**
 *
 * @author joaof
 */
public class ExReforço {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto,a;
        FabricaCaneta f = new FabricaCaneta("bic","fina","verde",15);
        f.setModelo("fabercastel");
        a = f.getMarca();
        System.out.println(a);
        texto = f.toString();
        System.out.println(texto);
        f.verificarTampa();
        f.verificarTinta();
    }
    
}
