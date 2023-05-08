/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe_abstrata;

/**
 *
 * @author joaof
 */
public class Classe_Abstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = joao;
        String sobrenome = silva;
        
        
        Chefe c = new Chefe(nome, nome);
        PorComissao pc = new PorComissao(nome ,sobrenome);
        PorItem pi = new PorItem(nome, sobrenome);
        PorHora ph = new PorHora(nome,sobrenome);
           
        
    }
    
}
