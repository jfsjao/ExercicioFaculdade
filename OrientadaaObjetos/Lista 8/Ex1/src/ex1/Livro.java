/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Livro {
    
    private String titulo;
    private String ISBN;
    private int ano;
    private ArrayList <Capitulo> c = new ArrayList();
    private Capitulo cap;
    
    //atributos capitulo
    private int numc;
    private String nome;
    private int paginicial;
    
    
    protected void cadastrar(){
        Scanner leia = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        System.out.println("qual o titulo do livro: ");
        titulo = leia.nextLine();
        System.out.println("qual o ISBN do livro: ");
        titulo = leia.nextLine();
        System.out.println("qual o ano do livro: ");
        ano = ler.nextInt();
        System.out.println("nome: ");
        nome = leia.nextLine();
        System.out.println("numero de capitulos: ");
        numc = leia.nextInt();
        while(numc >= 30){
            System.out.println("Tem q ser igual ou menor: ");
            System.out.println("numero de capitulos: ");
            numc = leia.nextInt();
        }
        System.out.println("pagina inicial: ");
        paginicial = leia.nextInt(); 
        Capitulo car = new Capitulo (numc,nome,paginicial);
        c.add(car);
        
    }

    protected void imprimir(){
        
        System.out.println(" o titulo do livro: "+titulo);
        
        System.out.println(" o ISBN do livro: "+ISBN);
        
        System.out.println(" o ano do livro: "+ano);
        
        for(int i=0;i<c.size();i++)
        {
            System.out.println("nome"+c.get(i).getNome());
            System.out.println("num cap"+ c.get(i).getNumc());
            System.out.println("pag inicial"+c.get(i).getPaginicial());
           
        }
    }
    
    
}
