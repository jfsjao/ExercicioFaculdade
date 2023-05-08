/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg2;

/**
 *
 * @author joaof
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro L = new Livro();
        L.mostrar();
        L.abrir();
        L.titulo = "titulo 1";
        L.autor = "Ian Seki";
        L.editora = "Gustavo vasco";
        Livro A = new Livro();
        A.titulo = "titulo 2";

        L.mostrar();
        A.mostrar();
        
    }
            
}
