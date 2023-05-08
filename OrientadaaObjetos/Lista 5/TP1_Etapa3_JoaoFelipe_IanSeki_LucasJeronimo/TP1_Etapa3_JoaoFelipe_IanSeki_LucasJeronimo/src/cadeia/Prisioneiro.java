package cadeia;

import java.util.Scanner;

public class Prisioneiro extends Pessoa{
    private String identificacaoP;
    private String setortrabalho;
    private String ala;
    private String sentenca;

    public Prisioneiro(String identificacaoP, String setortrabalho, String ala, String sentenca, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.identificacaoP = identificacaoP;
        this.setortrabalho = setortrabalho;
        this.ala = ala;
        this.sentenca = sentenca;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nIndentificacao do prisioneiro: "+identificacaoP+"\nSenteca: "+sentenca+"\nSetor do trabalho: "+setortrabalho+"\nALA: "+ala;
    }
    
}
