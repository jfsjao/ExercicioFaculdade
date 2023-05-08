/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex004;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Pessoa {
    private String nome;
    private String anoN;
    private String tel;
    private String cpf;
    
     Pessoa(String nome, String anoN,String tel,String cpf){
        this.nome = nome;
        this.anoN = anoN;
        this.tel = tel;
        this.cpf = cpf;       
    }
    public void imprimir(){
        System.out.println("========================");
        System.out.println("Nome: "+nome);
        System.out.println("Ano de nascimento: "+anoN);
        System.out.println("Telefone: "+tel);
        System.out.println("CPF: "+cpf);
        System.out.println("========================");
    }
    public void verficarIgualdade(){
    }
    
    
}
