/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadeia;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Gerenciadora {

    //atributos auxiliares
    int flag = 0;
    int i;
    private int pos = 0;
    private String codcpf;
    private int opcao;
    private int contador;
    //atributos classe mae
    private String nome;
    private String cpf;
    private int idade;
    //atributos do funcionario
    private String identificacaoA;
    private String expediente;
    private String cargo;
    private double salario;
    //atributos do prisioneiro
    private String identificacaoP;
    private String setortrabalho;
    private String ala;
    private String sentenca;

    Pessoa p[] = new Pessoa[30];
    Scanner leia = new Scanner(System.in);

    protected void exemplo() {
        //construtores armazenando os exemplos de teste
        //funcionarios
        p[pos] = new Funcionario("12565", "Matutino", "Supervisor", 4183.00, "Ronaldo", "12345678910", 50);
        pos++;
        p[pos] = new Funcionario("12345", "Vespertino", "Diretor penitenciario", 6460.00, "Claudia", "5123456918", 60);
        pos++;
        p[pos] = new Funcionario("12565", "Noturno", "Agente penitenciario", 2116.92, "Joao", "01987654321", 25);
        pos++;
        p[pos] = new Funcionario("12565", "Matutino", "Agente penitenciario", 2116.92, "Eduardo", "98732165420", 31);
        pos++;
        p[pos] = new Funcionario("12565", "Noturno", "Supervisor", 4183.00, "Richarlison", "76543211050", 32);
        pos++;
        //prisioneiros
        p[pos] = new Prisioneiro("310002", "Cozinha", "ALA B", "81", "Gabriel", "12378932125", 63);
        pos++;
        p[pos] = new Prisioneiro("987510", "Lavanderia", "ALA C", "Perpetua", "Jorge", "85236974126", 56);
        pos++;
        p[pos] = new Prisioneiro("920582", "Limpeza", "ALA D", "2", "Kleber", "98752634178", 32);
        pos++;
        p[pos] = new Prisioneiro("123987", "Lavanderia", "ALA A", "Perpetua", "Cristiano", "32165826325", 45);
        pos++;

    }

    protected void cadastrar() {
        System.out.println("=========CADASTRANDO==========");
        System.out.println("Cadastre o usuario:");
        if (flag == 1) {
            leia.nextLine();
        }
        System.out.println("Nome: ");
        nome = leia.nextLine();
        //leia.nextLine();
        System.out.println("Idade: ");
        idade = leia.nextInt();
        boolean flag1 = false;
        leia.nextLine();
        System.out.println("CPF(Insira sem o uso de pontuacao): ");
        cpf = leia.nextLine();
        
        
        while (flag1 == false) {
            for (i = 0; i < pos; i++) {                                 //percorrer o vetor
                if (cpf.equals(p[i].getCpf())) {
                    System.out.println("ERRO!!\nNao podem haver CPF iguais!!!");
                    System.out.println("CPF(Insira sem o uso de pontuacao): ");
                    cpf = leia.nextLine();
                }
                flag1 = true;
            }
        }
        System.out.println("===========CADASTRAR==========\nFuncionario..................1\nPrisioneiro..................2");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                leia.nextLine();
                System.out.println("Informe a identificacao do funcionario: ");
                identificacaoA = leia.nextLine();
                leia.nextLine();
                contador = identificacaoA.length();
                if (contador < 5 && contador > 5) {
                    System.out.println("ERRO!\n A identificacao tem que 5 caracteres");
                    System.out.println("Informe a identificacao do funcionario: ");
                    identificacaoA = leia.next();
                    contador = identificacaoA.length();
                }

                System.out.println("Informe o cargo exercido: \n1-Diretor; \n2-Supervisor; \n3-Encarregado;");
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        cargo = "Diretor penitenciario";
                        salario = 6460.00;

                        break;
                    case 2:
                        cargo = "Supervisor";
                        salario = 4183.00;
                        break;
                    case 3:
                        cargo = "Agente penitenciario";
                        salario = 2116.92;
                }
                System.out.println("Informe o exepediente: \n1-Matutino; \n2-Vespertino; \n3-Noturno;");
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        expediente = "Matutino";
                        break;
                    case 2:
                        expediente = "Vespertino";
                        break;
                    case 3:
                        expediente = "Noturno";
                        break;

                }
                p[pos] = new Funcionario(identificacaoA, expediente, cargo, salario, nome, cpf, idade);//armazena os dados na posicao 'pos' do vetor
                pos++;//acrescenta mais uma posicao no vetor

                break;
            case 2:
                System.out.println("Informe a indentificacao do prisioneiro: ");
                identificacaoP = leia.nextLine();
                leia.nextLine();

                contador = identificacaoP.length();
                while (contador < 6 && contador > 6) {
                    System.out.println("ERRO!\n A identificacao tem que 6 caracteres");
                    System.out.println("Informe a indentificacao do prisioneiro: ");
                    identificacaoP = leia.next();
                    contador = identificacaoP.length();
                }

                System.out.println("Informe a senteca do prisioneiro: \n1-Perpetua \n2-Digitar os anos");
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        sentenca = "Perpetua";
                        break;
                    case 2:
                        System.out.println("Informe a senteca do prisioneiro:");
                        sentenca = leia.next();
                        System.out.println("Informe o setor de trabalho: \n1-Cozinha; \n2-Lavanderia; \n3-Limpeza; ");
                        opcao = leia.nextInt();
                }
                switch (opcao) {
                    case 1:
                        setortrabalho = "Cozinha";
                        break;
                    case 2:
                        setortrabalho = "Lavanderia";
                        break;
                    case 3:
                        setortrabalho = "Limpeza";
                        break;
                }
                System.out.println("Informe o ala do prisioneiro: \n1-ALA A \n2-ALA B \n3-ALA C \n4-ALA D ");
                opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        ala = "ALA A";
                        break;
                    case 2:
                        ala = "ALA B";
                        break;
                    case 3:
                        ala = "ALA C";
                        break;
                    case 4:
                        ala = "ALA D";
                        break;
                }
                p[pos] = new Prisioneiro(identificacaoP, setortrabalho, ala, sentenca, nome, cpf, idade); //armazena os dados na posicao 'pos' do vetor
                pos++; //acrescenta mais uma posicao no vetor
                break;
        }

        flag = 1;
    }

    protected void relatoriocompleto() {
        boolean flag = false;
        System.out.println("==========RELATORIO=========== ");
        for (i = 0; i < pos; i++) {
            System.out.printf("O usuario %d: \n", i + 1);
            System.out.println(p[i].toString());
            System.out.println("\n============================\n");
            flag = true;
        }
        if (flag == false) {
            System.out.println("Nenhum usuario cadastrado!!");
        }

    }

    protected void consultar() {

        leia.nextLine();
        System.out.println("Insira o CPF do usuario que voce deseja consultar: ");
        codcpf = leia.nextLine();
        boolean flag = false;                                       //variavel auxiliar de booleana
        for (i = 0; i < pos; i++) {                                 //percorrer o vetor
            if (codcpf.equals(p[i].getCpf())) {                     //comparacao no entre as atributos
                flag = true;                                        //se encontrar a comparação a variavel bool vira true
                System.out.println(p[i].toString());                //printado os atribustos dos usuarios

            }
            if (flag == false) {                                    //se nao encontrar o valor a variavel continua falsa 
                System.out.println("CPF nao encontrado!");
            }
        }
    }

    protected void excluir() {
        leia.nextLine();
        System.out.println("Digite o CPF do usuario que voce deseja excluir: ");
        codcpf = leia.nextLine();
        for (i = 0; i < pos; i++) {                                 //percorrer o vetor
            if (codcpf.equals(p[i].getCpf())) {                     //comparacao no entre as atributos
                p[i] = p[pos - 1];                                  //vetor p na posicao i vai ser igual ao vetor da sua posicao menos 1
                p[pos - 1] = null;                                  //a posicao p-1 agora é nula
                pos--;                                              //retrai uma posicao
                System.out.println("o usuario foi excluido");
            }
        }
    }

    protected void verficaridade() {
        leia.nextLine();
        boolean flag = false;
        System.out.println("Digite o CPF do usuario para verificar sua idade: ");
        codcpf = leia.nextLine();
        flag = true;
        for (i = 0; i < pos; i++) {                                                 //percorre o vetor
            if (codcpf.equals(p[i].getCpf())) {                                     //compara os atributos 
                System.out.println("A idade do usuario: " + p[i].getIdade());       //printa os valores desejados
            }
            if (flag == false) {                                                    //se nao encontrar o valor a variavel continua falsa 
                System.out.println("O usuario nao foi encontrado!");
            }
        }
    }
}
