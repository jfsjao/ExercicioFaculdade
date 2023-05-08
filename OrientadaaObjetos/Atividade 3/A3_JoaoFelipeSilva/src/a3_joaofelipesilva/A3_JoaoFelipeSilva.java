/**Crie uma classe Data com atributos dia, mês e ano como números inteiros. 
A classe deve apresentar atributos privados, um construtor sem parâmetros que atribui a data 01/01/1900, 
um construtor com parâmetros que recebe os valores para dia, mês e ano e verifica se os valores estão 
dentro do permitido (e.g., fevereiro só pode ter até 29 dias, mas não é necessário verificar se o ano é bissexto), 
um método que mostra na tela a data em formato apropriado, e um método que compara duas datas e retorna a mais antiga delas,
ou nulo se elas são iguais. Implemente também o programa principal de 
teste, que deve mostrar na tela a data mais antiga, ou uma mensagem se elas forem iguais. */
package a3_joaofelipesilva;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class A3_JoaoFelipeSilva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia=0,ano,mes;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("=============================\n Insira a Data: ");
        System.out.println("Dia: ");
        dia = leia.nextInt();    
        System.out.println("Mes: ");
        mes = leia.nextInt();
        System.out.println("Ano: ");
        ano = leia.nextInt();
        Data data = new Data(dia, mes, ano);
        data.mostrar();
        data.conferir();
        
    }
    
}
