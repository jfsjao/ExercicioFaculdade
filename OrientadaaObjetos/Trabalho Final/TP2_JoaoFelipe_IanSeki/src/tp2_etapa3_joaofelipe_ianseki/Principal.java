/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2_etapa3_joaofelipe_ianseki;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    Funcionario f;
    Gerenciadora G = new Gerenciadora();
    ArrayList<Funcionario> fun = new ArrayList<>();
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlogin_cadastrar1 = new javax.swing.JButton();
        btnlogin_entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnlogin_cadastrarcarro = new javax.swing.JButton();
        btnlogin_sair = new javax.swing.JButton();
        btnlogin_consultarfun = new javax.swing.JButton();
        btnlogin_consultarcarro = new javax.swing.JButton();
        btnlogin_excluirfuncionario = new javax.swing.JButton();
        btnlogin_excluircarro = new javax.swing.JButton();
        btnlogin_alterarcarro = new javax.swing.JButton();
        btnlogin_alterarfuncionario = new javax.swing.JButton();
        btnprincipal_relatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnlogin_cadastrar1.setText("Cadastrar Funcionario");
        btnlogin_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_cadastrar1ActionPerformed(evt);
            }
        });

        btnlogin_entrar.setText("Entrar");
        btnlogin_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_entrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Lava Rapido:");

        btnlogin_cadastrarcarro.setText("Cadastrar carro");
        btnlogin_cadastrarcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_cadastrarcarroActionPerformed(evt);
            }
        });

        btnlogin_sair.setText("Sair");
        btnlogin_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_sairActionPerformed(evt);
            }
        });

        btnlogin_consultarfun.setText("Consultar Funcionario");
        btnlogin_consultarfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulatFunc(evt);
            }
        });

        btnlogin_consultarcarro.setText("Consultar Carro");
        btnlogin_consultarcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_consultarcarroActionPerformed(evt);
            }
        });

        btnlogin_excluirfuncionario.setText("Excluir Funcioanario");
        btnlogin_excluirfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_excluirfuncionarioActionPerformed(evt);
            }
        });

        btnlogin_excluircarro.setText("Excluir Carro");
        btnlogin_excluircarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_excluircarroActionPerformed(evt);
            }
        });

        btnlogin_alterarcarro.setText("Alterar Carro");
        btnlogin_alterarcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_alterarcarroActionPerformed(evt);
            }
        });

        btnlogin_alterarfuncionario.setText("Alterar Funcionario");
        btnlogin_alterarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin_alterarfuncionarioActionPerformed(evt);
            }
        });

        btnprincipal_relatorio.setText("Gerar Relatorio");
        btnprincipal_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprincipal_relatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlogin_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogin_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlogin_cadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlogin_consultarfun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlogin_alterarfuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlogin_excluirfuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnlogin_cadastrarcarro, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnlogin_consultarcarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlogin_excluircarro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogin_alterarcarro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnprincipal_relatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlogin_cadastrar1)
                        .addGap(11, 11, 11)
                        .addComponent(btnlogin_consultarfun)
                        .addGap(15, 15, 15)
                        .addComponent(btnlogin_alterarfuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlogin_excluirfuncionario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlogin_cadastrarcarro)
                        .addGap(11, 11, 11)
                        .addComponent(btnlogin_consultarcarro)
                        .addGap(15, 15, 15)
                        .addComponent(btnlogin_alterarcarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlogin_excluircarro)))
                .addGap(8, 8, 8)
                .addComponent(btnprincipal_relatorio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin_sair)
                    .addComponent(btnlogin_entrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void relatorio(){
        G.relatorioCarro();
        G.relatorioFuncionario();
        G.relatorioLavagem();
    }
    private void btnlogin_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_cadastrar1ActionPerformed
        CadastrarFuncionario jan = new CadastrarFuncionario(G);
        jan.setVisible(true);
    }//GEN-LAST:event_btnlogin_cadastrar1ActionPerformed

    private void btnlogin_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_entrarActionPerformed
        new Sevico_Lavagem(G).setVisible(true);
    }//GEN-LAST:event_btnlogin_entrarActionPerformed

    private void btnlogin_cadastrarcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_cadastrarcarroActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);                                         //some com a tela principal
        new CadastrarCarro(G).setVisible(true);
    }//GEN-LAST:event_btnlogin_cadastrarcarroActionPerformed

    private void btnlogin_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_sairActionPerformed
        // TODO add your handling code here:
        G.salvarcarro();
        G.salvarfuncionario();
        G.salvarlavar();
       
        
        System.exit(0);
    }//GEN-LAST:event_btnlogin_sairActionPerformed

    private void btnlogin_consultarcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_consultarcarroActionPerformed

        new ConsultarCarro(G).setVisible(true);
    }//GEN-LAST:event_btnlogin_consultarcarroActionPerformed

    private void btnlogin_excluircarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_excluircarroActionPerformed
        // TODO add your handling code here:

        new ExcluirCarro(G).setVisible(true);
    }//GEN-LAST:event_btnlogin_excluircarroActionPerformed

    private void btnlogin_excluirfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_excluirfuncionarioActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);                                         //some com a tela principal
        new ExcluirFuncionario(G).setVisible(true);
        System.out.println(G.fun.get(0).getCpf());
    }//GEN-LAST:event_btnlogin_excluirfuncionarioActionPerformed

    private void btnlogin_alterarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_alterarfuncionarioActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        AlterarFuncionario af = new AlterarFuncionario(G);
        af.setVisible(true);
       
    }//GEN-LAST:event_btnlogin_alterarfuncionarioActionPerformed

    private void btnlogin_alterarcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin_alterarcarroActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        AlterarCarro ac = new AlterarCarro(G);
        ac.setVisible(true);
    }//GEN-LAST:event_btnlogin_alterarcarroActionPerformed

    private void ConsulatFunc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulatFunc
        
        //this.setVisible(false);                                         //some com a tela principal
        ConsultarFuncionario con = new ConsultarFuncionario(G);
        con.setVisible(true);
    }//GEN-LAST:event_ConsulatFunc

    private void btnprincipal_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprincipal_relatorioActionPerformed
        relatorio();
        JOptionPane.showMessageDialog(null, "Relatorio gerado com Sucesso!");
    }//GEN-LAST:event_btnprincipal_relatorioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin_alterarcarro;
    private javax.swing.JButton btnlogin_alterarfuncionario;
    private javax.swing.JButton btnlogin_cadastrar1;
    private javax.swing.JButton btnlogin_cadastrarcarro;
    private javax.swing.JButton btnlogin_consultarcarro;
    private javax.swing.JButton btnlogin_consultarfun;
    private javax.swing.JButton btnlogin_entrar;
    private javax.swing.JButton btnlogin_excluircarro;
    private javax.swing.JButton btnlogin_excluirfuncionario;
    private javax.swing.JButton btnlogin_sair;
    private javax.swing.JButton btnprincipal_relatorio;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

