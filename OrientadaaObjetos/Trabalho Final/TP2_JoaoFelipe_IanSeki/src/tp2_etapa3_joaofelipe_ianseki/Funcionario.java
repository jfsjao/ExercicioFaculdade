package tp2_etapa3_joaofelipe_ianseki;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author joaof
 */
public class Funcionario implements Serializable{
    private String nome;
    private String cpf;
    private int id;
    

    public Funcionario() {
    }
  
    public Funcionario(int id,String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;  
    }

    public Funcionario(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    @Override
    public String toString() {
        return "Funcionario " + "nome: " + nome + ", cpf: " + cpf + ", id:" + id ;
    }
    
}
