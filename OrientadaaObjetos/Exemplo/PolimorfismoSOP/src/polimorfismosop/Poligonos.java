/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismosop;

/**
 *
 * @author joaof
 */
public class Poligonos {
    public int angulo;
    public String forma;
    public String cor;
    public int qtd_lados;
    

    public int calculoperimetro(int lado1,int lado2,int lado3){
        
        return lado1+lado2+lado3;
    }
    public int calculoperimetro(int lado1,int lado2,int lado3,int lado4){
        return lado1+lado2+lado3+lado4;
    }
    public int calculoperimetro(int lado1,int lado2,int lado3, int lado4, int lado5){
        return lado1+lado2+lado3+lado4+lado5;
    }
    public int calculoperimetro(int lado1,int lado2,int lado3, int lado4, int lado5, int lado6){
        return lado1+lado2+lado3+lado4+lado5+lado6;
    }
    public int calculoperimetro(int lado1,int lado2,int lado3, int lado4, int lado5, int lado6, int lado7){
        return lado1+lado2+lado3+lado4+lado5+lado6+lado7;
    }
}
