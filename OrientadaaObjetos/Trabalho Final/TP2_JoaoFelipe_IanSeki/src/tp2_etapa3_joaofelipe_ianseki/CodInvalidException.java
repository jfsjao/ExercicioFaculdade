/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_etapa3_joaofelipe_ianseki;

/**
 *
 * @author jonathan
 */
public class CodInvalidException extends RuntimeException{

     public CodInvalidException() {
        super("Codigo de lavagem ja cadastrado!");
    }    
}
