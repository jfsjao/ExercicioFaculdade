/*
 Implemente uma classe chamada Calculadora. Esta classe deve conter 2
atributos x e y do tipo int, além dos 4 métodos de operação básica soma(),
subtração(), multiplicação() e divisão(). Utilize os métodos de acesso e
modificação (Getters e Setters), e atente-se para operações que não são
definidas (divisão por zero). Implemente uma classe principal que crie pelo
menos um objeto, e exiba na tela as operações com resultados. Por exemplo,
para os valores 4 e 5, o programa deve mostrar na tela o resultado das 4
operações, da forma mostrada abaixo, um em cada linha:
4 + 5 = 9
4 – 5 = -1
4 * 5 = 20
4 / 5 = 0,8

 */
package ex1_joaofelipe_cal;

/**
 *
 * @author joaof
 */
public class Calculadora {
    private int x;
    private int y;
    private int z;
    public int setSoma(){
        return  x + y;
       
    }
    public int setSubtracao(){
        return x - y;
    }
    public int setMultiplicacao(){
        return x*y;
    }
    public int setDivisao(){
        return x/y;
    } 
}
