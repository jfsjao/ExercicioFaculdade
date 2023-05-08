/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2_joaofelipesilva_radio;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Radio {
    boolean Status;
    float Frequencia;
    int Volume;
    int vrad[] = new int[3];
    
    Scanner leia = new Scanner(System.in);
    public void Ligar(){
      
        if(Status == true){
            Status = false;
            System.out.println("O radio esta desligado!");
        }else
            Status = true;
            System.out.println("O radio esta ligado");
    }
    public void Volume(){
        System.out.println("O volume do radio atual: "+Volume);
        System.out.println("De o volume do radio: ");
        Volume = leia.nextInt();
        while(Volume>10 || Volume<0){
            System.out.println("O volume do radio vai de 0 a 10!");
            System.out.println("De o volume do radio: ");
            Volume = leia.nextInt();
      }
              
    }
    public void Frequencia(){
        System.out.println("A frequencia do radio atual: "+Frequencia);
        System.out.println("De o frequencia do radio: ");
        Frequencia = leia.nextInt();
    }
   

}
