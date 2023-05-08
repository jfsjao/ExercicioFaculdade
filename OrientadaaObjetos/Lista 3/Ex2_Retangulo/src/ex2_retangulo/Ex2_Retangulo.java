
package ex2_retangulo;

import java.util.Scanner;

public class Ex2_Retangulo {

    public static void main(String[] args) {
       
        double largura, largura1, comprimento, comprimento1;
        
        
        Scanner leia = new Scanner(System.in);
        
        Retangulo r = new Retangulo();
        Retangulo r1 = new Retangulo();
        
        System.out.println("Insira o comprimento: ");
        comprimento = leia.nextDouble();
        r.setComprimento(comprimento);

        System.out.println("Insira a largura: ");
        largura = leia.nextDouble();
        r.setLargura(largura);
        r.setComprimento(comprimento);
        r.calArea();
        r.calPer();
        
        System.out.println("Insira o comprimento: ");
        comprimento1 = leia.nextDouble();
        r1.setComprimento(comprimento1);

        System.out.println("Insira a largura: ");
        largura1 = leia.nextDouble();
        r1.setLargura(largura1);
        
        r1.calArea();
        r1.calPer();
        
        System.out.println("Perimetro: "+r.getPerimetro());
        System.out.println("Area: "+r.getArea());
        
        System.out.println("Perimetro: "+r1.getPerimetro());
        System.out.println("Area: "+r1.getArea());
        
    }
    
}
