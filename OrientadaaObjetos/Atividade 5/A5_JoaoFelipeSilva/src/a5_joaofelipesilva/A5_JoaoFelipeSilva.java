/*
 Para as classes descritas abaixo, desenhe o diagrama de classes (itens a, b e c) e escreva o programa principal (d).

a)      Crie uma classe Pessoa, contendo os atributos privados nome (string), endereco (string) e telefone (string). A classe deve conter um construtor com parâmetros sem interação com o usuário, um método para cadastrar os dados de uma pessoa (que deve interagir com o usuário), além do método imprimir que imprime na tela todos os dados de uma pessoa. Todos os atributos desta classe devem ser privados, e os métodos não podem ser públicos. 

b)      Crie uma classe Fornecedor, que é uma especialização da classe Pessoa. Além dos atributos da classe Pessoa, o Fornecedor deve ter os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor um método cadastrar e um método imprimir que devem utilizar todos os dados (da classe Fornecedor e da classe Pessoa), e um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Todos os atributos devem ser privados.  

c)      Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos de cadastro e de impressão de todos os dados na tela (da classe Empregado e da classe Pessoa), e um método calcularSalario, que calcula o salário a ser recebido após o desconto do imposto. Todos os atributos devem ser privados.

d)      Implemente um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados nas classes Fornecedor e Empregado, e os herdados da classe Pessoa. Este deve cadastrar pelo menos 2 empregados e pelo menos 3 fornecedores. Após o término dos 5 cadastros, deve-se imprimir na tela todos os dados de todos os empregados e fornecedores cadastrados, de forma organizada e clara.
 */
package a5_joaofelipesilva;

/**
 *
 * @author joaof
 */
public class A5_JoaoFelipeSilva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Fornecedor[] vFor = new Fornecedor[3];
        Empregado[] vEmp = new Empregado[2];
        for(i = 0; i < 3; i++) {
            vFor[i] = new Fornecedor();
            System.out.printf("Fornecedor "+i+": \n");
            vFor[i].Cadastrar();
            vFor[i].obterSaldo();
        }
        for (i = 0; i < 2; i++) {
            vEmp[i]= new Empregado();
            System.out.printf("Empregado "+i+": \n");
            vEmp[i].Cadastrar();
            vEmp[i].calcularSalario();
        } 
        System.out.println("========FORNECEDOR========");
        for(i = 0; i < 3; i++) {
            vFor[i].Imprimir();
            System.out.println("\n");
        }
        System.out.println("========EMPREGADO========");
        for(i = 0; i < 2; i++) {
            vEmp[i].Imprimir();
            System.out.println("\n");
        }
    }
    
}
