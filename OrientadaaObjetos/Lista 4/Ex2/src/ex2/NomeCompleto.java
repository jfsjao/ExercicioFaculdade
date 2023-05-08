/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Arrays;

/**
 *
 * @author joaof
 */
public class NomeCompleto {
    private String primeironome;
    private String nomedomeio;
    private String nomefamilia;
    
    public NomeCompleto(String nomecompleto){
        String p1[] = nomecompleto.split(" ");
        String p2[] = nomecompleto.split(" ");
        String p3[] = nomecompleto.split(" ");
        
        String[] textoSeparado = nomecompleto.split(";");  
        System.out.println(Arrays.toString(textoSeparado));
        for (String first : p1){
            primeironome = first;
        }
        for (String meio : p2){
            nomedomeio = meio;
        }
        for (String f : p3){
            nomefamilia = f;
        }
        
        System.out.println(primeironome + "::" + nomedomeio + "::" + nomefamilia);
                        
    }
    public NomeCompleto(String pn, String nm, String nf){
        
    }
    
}

