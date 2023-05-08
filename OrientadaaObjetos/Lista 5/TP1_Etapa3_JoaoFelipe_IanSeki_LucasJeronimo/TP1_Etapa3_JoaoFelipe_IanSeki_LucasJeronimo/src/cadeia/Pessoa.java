package cadeia;

import java.util.Scanner;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }


    public String toString() {
        return "O usuario: " + nome + " tem as seguintes informacoes: \nIdade: " + idade +"\nCPF: "+cpf;
    }
}
