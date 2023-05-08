/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_retangulo;

/**
 *
 * @author joaof
 */
public class Retangulo {
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;
    
    public Retangulo(){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public double calArea(){
        area = largura * comprimento;
        return area;
    }
    public double calPer(){
        perimetro = (largura*2)+(comprimento*2);
        return perimetro;
    }
    
    //metodos especiais(get e set)

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

}
