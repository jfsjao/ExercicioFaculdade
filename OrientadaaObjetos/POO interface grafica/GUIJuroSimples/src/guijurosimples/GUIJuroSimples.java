package guijurosimples;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;*/

public class GUIJuroSimples extends JFrame {

    private JPanel pTela = new JPanel(new GridLayout(0, 2, 15, 15));  //0 no caso quantidade linhas quanto for necessaria, 2 colunas, 15 espaçamento
    private JLabel rotulos[] = new JLabel[4];
    private JTextField camposTexto[] = new JTextField[4];
    private JButton bCalcular = new JButton("Calcular");
    private JButton bReiniciar = new JButton("Reiniciar");

    public GUIJuroSimples() {
        //define o titulo da janela 
        //super("Primeira janela");

        this.setSize(1040, 720);   //define o tamanha da tela
        //this.setVisible(true);    //setvisible é obrigatorio
        //setLocationRelativeTo(null); //localiza a janela no meio da tela
        configurarJanela();
        configurarPaineis();

    }

    public void configurarJanela() {
        setTitle("Calculadora de Juros Simples ");
        setSize(320, 240);
        setLocationRelativeTo(null);
        add(BorderLayout.CENTER, pTela);
        setVisible(true);

    }

    public void configurarPaineis() {
        rotulos[0] = new JLabel("Capital: ");
        rotulos[1] = new JLabel("Taxa (% a.m.): ");
        rotulos[2] = new JLabel("Tempo (em meses): ");
        rotulos[3] = new JLabel("Juros: ");

        for (int i = 0; i < 4; i++) {
            camposTexto[i] = new JTextField("  ");
        }
        for (int i = 0; i < 3; i++) {
            pTela.add(rotulos[i]);
            pTela.add(camposTexto[i]);
        }
        pTela.add(bReiniciar);
        pTela.add(bCalcular);
        pTela.add(rotulos[3]);
        pTela.add(camposTexto[3]);
        camposTexto[3].setEditable(false);

        bReiniciar.addActionListener(new ActionListener() {    //confirma se o botao foi acionado
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 4; i++) {
                    camposTexto[i].setText("");
                }
            }
        });

        bCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str;
                double valores[] = new double[4];
                for (int i = 0; i < 3; i++) {
                    str = camposTexto[i].getText();
                    valores[i] = Double.parseDouble(str);
                    valores[i] = valores[i]+valores[i+1];
                }
            }

        });
    }

    public static void main(String[] args) {
        // TODO code application logic here

        GUIJuroSimples g = new GUIJuroSimples();
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
