/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Capitulo {
    private int numc;
    private String nome;
    private int paginicial;
    
    public Capitulo(int numc, String nome, int paginicial) {
        this.numc = numc;
        this.nome = nome;
        this.paginicial = paginicial;
    }
    
   /* protected void cadastrar(){
        Scanner leia = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
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
    }
    
    public String toString(){
        return ("O nome"+ nome+ "numeros capitulos "+ numc+ "a pagina inicial"+ paginicial);
    }*/

    public int getNumc() {
        return numc;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginicial() {
        return paginicial;
    }

    
}
