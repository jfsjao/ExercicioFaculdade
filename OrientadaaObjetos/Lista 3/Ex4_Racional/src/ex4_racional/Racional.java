/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_racional;

/**
 *
 * @author joaof
 */
public class Racional {
    private int p;
    private int q;
    
    public Racional(){
        p = 0;
        q = 1;
        
    }
    public Racional(int p){
        this.p = p;
        this.q = q;
        q = 1;
 
    }
    public Racional(int p, int q){
        this.p = p;
        this.q = q;
        if(q==0){
            this.q = 1;
        }
    }    
    public void exibeRacional(){
        System.out.println(p+"/"+q);
   
    }
   
}
