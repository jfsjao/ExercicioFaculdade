/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadeia;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Cadeia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        
        //Prisioneiro p = new Prisioneiro();
        Gerenciadora g = new Gerenciadora();
        Scanner leia = new Scanner(System.in);
        g.exemplo();  //metodos para incersao de construtures de teste
        do{
            System.out.println ("=============MENU=============\nCadastrar....................1\nConsultar....................2\nVerificar.Idade..............3\nExcluir......................4\nRelatorio.Completo...........5\nSair.........................0\n==============================");
            opcao  = leia.nextInt();
            switch (opcao) {
                case 1:
                    g.cadastrar();                  //cadastra um novo usuario
                    break;
                case 2:
                    g.consultar();                  //faz a consulta de 1 usuario usando o cpf
                    break;
                case 3:
                    g.verficaridade();              //usando o cpf monstra a idade do usuario
                    break;
                case 4://exclusao
                    g.excluir();                    //exclui um usuario usando o cpf
                    break;
                case 5:
                    g.relatoriocompleto();          //mostra todos os usuarios cadastrados
                    break;
            }
        }while(opcao != 0);
    
    }            
}
