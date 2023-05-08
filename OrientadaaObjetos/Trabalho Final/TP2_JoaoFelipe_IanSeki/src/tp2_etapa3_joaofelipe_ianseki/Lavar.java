
package tp2_etapa3_joaofelipe_ianseki;

import java.io.Serializable;

public class Lavar implements Serializable{
    private String tipolavagem;
    private int codlavagem;
    private String horasdeentrada;
    private String horasestimadas;        //para o carro ficar pronto
    private Funcionario fun;
    private Carro car;
    private int ID;
    private String placa;

    public Lavar() {
    }

    public Lavar(String tipolavagem, int codlavagem, String horasdeentrada, String horasestimadas, Funcionario fun, Carro car) {
        this.tipolavagem = tipolavagem;
        this.codlavagem = codlavagem;
        this.horasdeentrada = horasdeentrada;
        this.horasestimadas = horasestimadas;
        this.fun = fun;
        this.car = car;
    }
    

    public String getTipolavagem() {
        return tipolavagem;
    }

    public void setTipolavagem(String tipolavagem) {
        this.tipolavagem = tipolavagem;
    }

    public String getHorasdeentrada() {
        return horasdeentrada;
    }

    public void setHorasdeentrada(String horasdeentrada) {
        this.horasdeentrada = horasdeentrada;
    }

    public String getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(String horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public int getCodlavagem() {
        return codlavagem;
    }

    public void setCodlavagem(int codlavagem) {
        this.codlavagem = codlavagem;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Lavagem: " + "tipo: " + tipolavagem + ", codigo: " + codlavagem + ", Entrada: " + horasdeentrada + "h, Saida estimada: " + horasestimadas + "h, ID: " + ID + ", placa: " + placa;
    }
    
    
    
}
