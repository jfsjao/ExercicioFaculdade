package cadeia;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String identificacaoA;
    private String expediente;
    private String cargo;
    private double salario;

    public Funcionario(String identificacaoA, String expediente, String cargo, double salario, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.identificacaoA = identificacaoA;
        this.expediente = expediente;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nIdentificacao do agente: " + identificacaoA + " \nCargo: " + cargo + "\nExpediente: " + expediente + "\nSalario: R$" + salario;
    }

}
