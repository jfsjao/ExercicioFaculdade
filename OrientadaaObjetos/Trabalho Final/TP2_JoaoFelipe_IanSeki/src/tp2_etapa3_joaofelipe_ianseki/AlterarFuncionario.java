package tp2_etapa3_joaofelipe_ianseki;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlterarFuncionario extends javax.swing.JFrame {

    Funcionario f;
    Gerenciadora g;

    public AlterarFuncionario(Gerenciadora g) {
        initComponents();
        setLocationRelativeTo(null);
        this.g = g;
        txtalterarfun_novoidfun.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtconsultarfun_idfun = new javax.swing.JTextField();
        txtconsultarfun_nomefun = new javax.swing.JTextField();
        txtconsultarfun_cpffun = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtalterarfun_idfun = new javax.swing.JTextField();
        txtcalterarfun_nomefun = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtalterarfun_novoidfun = new javax.swing.JTextField();
        btnalterar_voltar = new javax.swing.JButton();
        btnalterarfun_mostrar = new javax.swing.JButton();
        btnalterarfun_salvar = new javax.swing.JButton();
        txtalterarfun_cpffun = new javax.swing.JFormattedTextField();

        jLabel2.setText("Digite o ID do funcionario para consultar:");

        jLabel3.setText("Nome do funcionario:");

        jLabel4.setText("CPF:");

        txtconsultarfun_nomefun.setEditable(false);

        txtconsultarfun_cpffun.setEditable(false);
        txtconsultarfun_cpffun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconsultarfun_cpffunActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar funcionario:");

        jLabel5.setText("Digite o ID do funcionario para consultar:");

        jLabel6.setText("Nome do funcionario:");

        jLabel7.setText("CPF:");

        txtalterarfun_idfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarfun_idfunActionPerformed(evt);
            }
        });

        jLabel8.setText("ID:");

        txtalterarfun_novoidfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarfun_novoidfunActionPerformed(evt);
            }
        });

        btnalterar_voltar.setText("Voltar");
        btnalterar_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterar_voltarActionPerformed(evt);
            }
        });

        btnalterarfun_mostrar.setText("Mostrar dados");
        btnalterarfun_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarfun_mostrarActionPerformed(evt);
            }
        });

        btnalterarfun_salvar.setText("Salvar");
        btnalterarfun_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarfun_salvarActionPerformed(evt);
            }
        });

        try {
            txtalterarfun_cpffun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnalterar_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnalterarfun_mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnalterarfun_salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtalterarfun_novoidfun, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtcalterarfun_nomefun, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtalterarfun_cpffun)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtalterarfun_idfun, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtalterarfun_idfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcalterarfun_nomefun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtalterarfun_novoidfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtalterarfun_cpffun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalterar_voltar)
                    .addComponent(btnalterarfun_mostrar)
                    .addComponent(btnalterarfun_salvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconsultarfun_cpffunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconsultarfun_cpffunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconsultarfun_cpffunActionPerformed

    private void txtalterarfun_novoidfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarfun_novoidfunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarfun_novoidfunActionPerformed

    private void btnalterar_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterar_voltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btnalterar_voltarActionPerformed

    private void txtalterarfun_idfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarfun_idfunActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtalterarfun_idfunActionPerformed

    public void verificaId(int id, int idAntigo) {

        ArrayList<Funcionario> fun = g.retornaf();

        if (id == idAntigo) {

        } else {

            for (Funcionario f : fun) {
                if (f.getId() == id) {
                    throw new IdInvalidException();
                }
            }
        }

    }
    private void btnalterarfun_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarfun_salvarActionPerformed
        // TODO add your handling code here:
       
        int id = Integer.parseInt(txtalterarfun_idfun.getText());
        
        String nome = txtcalterarfun_nomefun.getText();
        int idn = Integer.parseInt(txtalterarfun_novoidfun.getText());
        
        String cpf = txtalterarfun_cpffun.getText();

        boolean verificar = g.alterarf(id, nome, idn, cpf);

        if (verificar == true) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!!");
        } else
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!!!!");
    }//GEN-LAST:event_btnalterarfun_salvarActionPerformed

    private void btnalterarfun_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarfun_mostrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtalterarfun_idfun.getText());
        f = g.buscaFun(id);

        if (f != null) {
            txtcalterarfun_nomefun.setText(f.getNome());
            txtalterarfun_novoidfun.setText(String.valueOf(f.getId()));
            txtalterarfun_cpffun.setText(f.getCpf());
        } else {
            JOptionPane.showMessageDialog(null, " Não existe!!!");
        }
    }//GEN-LAST:event_btnalterarfun_mostrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AlterarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar_voltar;
    private javax.swing.JButton btnalterarfun_mostrar;
    private javax.swing.JButton btnalterarfun_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField txtalterarfun_cpffun;
    private javax.swing.JTextField txtalterarfun_idfun;
    private javax.swing.JTextField txtalterarfun_novoidfun;
    private javax.swing.JTextField txtcalterarfun_nomefun;
    private javax.swing.JTextField txtconsultarfun_cpffun;
    private javax.swing.JTextField txtconsultarfun_idfun;
    private javax.swing.JTextField txtconsultarfun_nomefun;
    // End of variables declaration//GEN-END:variables
}
