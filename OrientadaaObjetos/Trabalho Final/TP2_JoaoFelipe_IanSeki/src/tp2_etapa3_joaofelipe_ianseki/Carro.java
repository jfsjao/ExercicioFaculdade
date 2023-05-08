/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_etapa3_joaofelipe_ianseki;

import java.io.Serializable;
import java.util.ArrayList;


public class Carro implements Serializable{
    private String nomecli;
    private String nomecar;
    private String placa;
    private String telefone;


    public Carro(String nomecli, String nomecar, String placa, String telefone) {
        this.nomecli = nomecli;
        this.nomecar = nomecar;
        this.placa = placa;
        this.telefone = telefone;
     
    }

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro() {
    }



    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getNomecar() {
        return nomecar;
    }

    public void setNomecar(String nomecar) {
        this.nomecar = nomecar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome Cliente: " + nomecli + ", carro: "  + nomecar + ", placa: " + placa + ", telefone: " + telefone ;
    }
    
    
    
}
