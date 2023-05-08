/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.pkg2;

/**
 *
 * @author joaof
 */
public class Livro {
    String titulo, editora, autor;
    int ano;
    boolean aberto;
    void abrir(){
        aberto = true; 
        System.out.println("O livro foi aberto.");            
    }
    void estudar(){
        if (aberto) {
            System.out.println("Bons estudos!");
        }
        if(aberto == false){
            System.out.println("Você precisa abrir antes de anotar");
        }
                        
    }
    void mostrar(){
        System.out.println("\nTitulo: "+titulo+"\nEditora: "+editora+"\nAno: "+ano+"\nautor: "+autor);
        if (aberto) {
            System.out.println("o livro esta aberto");    
        }
        if (aberto==false) {
            System.out.println("o livro esta fechado");                  
        }
    }
}