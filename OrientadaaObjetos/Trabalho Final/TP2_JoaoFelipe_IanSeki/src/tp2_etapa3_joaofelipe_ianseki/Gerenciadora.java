package tp2_etapa3_joaofelipe_ianseki;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gerenciadora {

    ArrayList<Funcionario> fun;
    ArrayList<Carro> car;
    ArrayList<Lavar> lavar;

    public Gerenciadora() {

        fun = carregarfuncionario();
        car = carregarCarro();
        lavar = carregarlavar();

        if (car == null) {
            car = new ArrayList<>();
        }
        if (fun == null) {
            fun = new ArrayList<>();
        }
        if (lavar == null) {
            lavar = new ArrayList<>();

        }
    }

    public boolean cadastrarf(int id, String cpf, String nome) {

        Funcionario f = new Funcionario(id, cpf, nome);
        fun.add(f);
        return true;

    }

    protected boolean cadastrarc(String nomecli, String nomecar, String placa, String telefone) {

        Carro c = new Carro(nomecli, nomecar, placa, telefone);
        car.add(c);
        return true;

    }

    protected boolean cadastrarl(String placa, String tipolavagem, int idf, int codlavagem, String horas, String horae) {
        if (lavar.contains(codlavagem)) {
            return false;
        } else {
            System.out.println("A");
            Lavar l = new Lavar();
            l.setID(idf);
            l.setPlaca(placa);
            l.setCodlavagem(codlavagem);
            l.setHorasdeentrada(horae);
            l.setHorasestimadas(horas);
            l.setTipolavagem(tipolavagem);

            lavar.add(l);
            System.out.println(l.getTipolavagem());
            return true;

        }
    }

    public boolean excluirf(int id) {
        for (int i = 0; i < fun.size(); i++) {
            if (fun.get(i).getId() == id) {
                fun.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean excluirc(String placa) {
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getPlaca().equals(placa)) {
                car.remove(i);
                return true;
            }

        }
        return false;
    }
    
    public boolean excluirl(int codl) {
        for (int i = 0; i < lavar.size(); i++) {
            if (lavar.get(i).getCodlavagem()== (codl)) {
                lavar.remove(i);
                return true;
            }

        }
        return false;
    }
            
    public boolean alterarc(String placa, String placan, String tel, String nome, String nomecar) {
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getPlaca().equals(placa)) {

                car.get(i).setTelefone(tel);
                car.get(i).setNomecli(nome);
                car.get(i).setNomecar(nomecar);
                car.get(i).setPlaca(placan);

                return true;
            }
        }
        return false;
    }

    public boolean alterarf(int id, String nome, int idn, String cpf) {
            for (int i = 0; i < fun.size(); i++) {
                if (fun.get(i).getId() == idn) {
                
                fun.get(i).setCpf(cpf);
                fun.get(i).setId(id);
                fun.get(i).setNome(nome);

                return true;
            }
        }
        return false;
    }
    
     public boolean alterarl(int idf, String placa, String tipolavagem,String horae, String horas,int codl) {
             for (int i = 0; i < lavar.size(); i++) {
                if (lavar.get(i).getCodlavagem()== (codl)) {
                
                lavar.get(i).setCodlavagem(codl);
                lavar.get(i).setPlaca(placa);
                lavar.get(i).setTipolavagem(tipolavagem);
                lavar.get(i).setHorasdeentrada(horae);
                lavar.get(i).setHorasestimadas(horas);
                lavar.get(i).setID(idf);
                        
                return true;
            }
        }
        return false;
    }
    

    

    protected ArrayList<Carro> retornac() {
        return car;
    }

    protected ArrayList<Funcionario> retornaf() {
        return fun;
    }

    protected ArrayList<Lavar> retornal() {
        return lavar;
    }

    public Funcionario buscaFun(int id) { //fazer parecidos
        for (int i = 0; i < fun.size(); i++) {
            if (fun.get(i).getId() == id) {
                return fun.get(i);
            }
        }
        return null;
    }

    public Carro buscacar(String placa) { //fazer parecidos
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getPlaca().equals(placa)) {
                return car.get(i);
            }
        }
        return null;
    }

    public Lavar buscarl(int cod) {
        for (int i = 0; i < lavar.size(); i++) {
            if (lavar.get(i).getCodlavagem() == cod) {
                return lavar.get(i);
            }
        }
        return null;
    }

    public void relatorioFuncionario() {
        try {
            FileWriter arq = new FileWriter("RelatorioFuncionario.txt");
            try ( PrintWriter print = new PrintWriter(arq)) {

                for (Funcionario f : fun) {
                    print.println(f);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void relatorioCarro() {
        try {
            FileWriter arq = new FileWriter("RelatorioCarro.txt");
            try ( PrintWriter print = new PrintWriter(arq)) {

                for (Carro c : car) {
                    print.println(c);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void relatorioLavagem() {
        try {
            FileWriter arq = new FileWriter("RelatorioLavagem.txt");
            try ( PrintWriter print = new PrintWriter(arq)) {

                for (Lavar l : lavar) {
                    print.println(l);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void salvarfuncionario() {
        /*
        try {
            FileOutputStream arqf = new FileOutputStream("Arquivof");
            ObjectOutputStream is = new ObjectOutputStream(arqf);
            is.writeObject(fun);
            is.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         */

        try {

            try ( ObjectOutputStream arqF
                    = new ObjectOutputStream(new FileOutputStream("ArquivoF"))) {
                arqF.writeObject(fun);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

    public void salvarcarro() {

        try {

            try ( ObjectOutputStream arqC
                    = new ObjectOutputStream(new FileOutputStream("ArquivoC"))) {
                arqC.writeObject(car);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

    public void salvarlavar() {

        try {

            try ( ObjectOutputStream arqL
                    = new ObjectOutputStream(new FileOutputStream("ArquivoL"))) {
                arqL.writeObject(lavar);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

    public ArrayList<Funcionario> carregarfuncionario() {

        try {
            ArrayList<Funcionario> f;
            try ( ObjectInputStream arqF
                    = new ObjectInputStream(new FileInputStream("ArquivoF"))) {
                f = (ArrayList<Funcionario>) arqF.readObject();

            }
            return f;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Carro> carregarCarro() {

        try {
            ArrayList<Carro> c;
            try ( ObjectInputStream arqC
                    = new ObjectInputStream(new FileInputStream("ArquivoC"))) {
                c = (ArrayList<Carro>) arqC.readObject();

            }
            return c;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Lavar> carregarlavar() {
        try {
            ArrayList<Lavar> l;
            try ( ObjectInputStream arqL
                    = new ObjectInputStream(new FileInputStream("ArquivoL"))) {
                l = (ArrayList<Lavar>) arqL.readObject();

            }
            return l;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
