/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3_joaofelipesilva;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Data {
    Scanner leia =  new Scanner(System.in);
    
    private int ano, a;
    private int mes, m;
    private int dia, d;
    private int data1, data2;
    
    private int mes1[] = {31, 19, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Data(){
        dia = 01;
        mes = 01;
        ano = 1900;
    }
    public Data(int d1, int m1, int a1){
        if (d<0 || d>mes1[m1-1]){
            dia = 01;
            mes = 01;
            ano = 1900;
            System.out.println("Erro!, a data foi inserida incorreta!");
        }else{
            dia = d1;
            mes = m1;
            ano = a1;
        }
    }
    
    public void mostrar(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
    public void conferir(){
        System.out.println("Insira a data para comparacao: ");
        System.out.println("Dia: ");
        d = leia.nextInt();
        System.out.println("Mes: ");
        m = leia.nextInt();
        System.out.println("Ano: ");
        a = leia.nextInt();
        
        data1  = a*1000+m*100+d;
        data2 =  ano*1000+mes*100+dia;
    
        if(data1<data2){
            System.out.println("A data mais antiga e: "+d+"/"+m+"/"+a);
        }
        else if(data2<data1){
            System.out.println("A data mais antiga e: "+dia+"/"+mes+"/"+ano);
        }else{
            System.out.println("Datas sao iguais!!");
        }
    }
}
