
package tp2_etapa3_joaofelipe_ianseki;

import javax.swing.JOptionPane;

public class AlterarCarro extends javax.swing.JFrame {

    
    Carro c;
    Gerenciadora ge;
    public AlterarCarro(Gerenciadora ge) {
        initComponents();
        setLocationRelativeTo(null);
        this.ge = ge;
        btnSave.setVisible(false);
        txtalterarcar_placanova.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtalterarcar_nomecar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtalterarcar_clinome = new javax.swing.JTextField();
        btnalterarcar_mostrar = new javax.swing.JButton();
        btnalterarcar_voltar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtalterarcar_clitel = new javax.swing.JFormattedTextField();
        txtalterarcar_placanova = new javax.swing.JFormattedTextField();
        txtalterarcar_placa = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar carro:");

        jLabel2.setText("Digite a placa para aparecer os outros dados:");

        txtalterarcar_nomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarcar_nomecarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do cliente:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Placa:");

        jLabel6.setText("Nome do carro:");

        txtalterarcar_clinome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarcar_clinomeActionPerformed(evt);
            }
        });

        btnalterarcar_mostrar.setText("Mostrar dados");
        btnalterarcar_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarcar_mostrarActionPerformed(evt);
            }
        });

        btnalterarcar_voltar.setText("Voltar");
        btnalterarcar_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarcar_voltarActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        try {
            txtalterarcar_clitel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtalterarcar_clitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarcar_clitelActionPerformed(evt);
            }
        });

        try {
            txtalterarcar_placanova.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtalterarcar_placanova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarcar_placanovaActionPerformed(evt);
            }
        });

        try {
            txtalterarcar_placa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtalterarcar_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalterarcar_placaActionPerformed(evt);
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
                        .addComponent(btnalterarcar_voltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtalterarcar_clinome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtalterarcar_nomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtalterarcar_placanova, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtalterarcar_clitel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(215, 215, 215))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtalterarcar_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnalterarcar_mostrar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtalterarcar_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtalterarcar_clinome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtalterarcar_clitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtalterarcar_placanova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtalterarcar_nomecar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalterarcar_mostrar)
                    .addComponent(btnalterarcar_voltar)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtalterarcar_nomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarcar_nomecarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarcar_nomecarActionPerformed

    private void txtalterarcar_clinomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarcar_clinomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarcar_clinomeActionPerformed

    private void btnalterarcar_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarcar_voltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_btnalterarcar_voltarActionPerformed

    private void btnalterarcar_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarcar_mostrarActionPerformed
        String placa = txtalterarcar_placa.getText();
        c = ge.buscacar(placa);
        
      if(c !=null){
          txtalterarcar_clinome.setText(c.getNomecli());
          txtalterarcar_clitel.setText(c.getTelefone());
          txtalterarcar_nomecar.setText(c.getNomecar()); 
          txtalterarcar_placanova.setText(c.getPlaca());
      }
      else{
           JOptionPane.showMessageDialog(null, " Não existe!!!");
      }
            

        btnSave.setVisible(true);
        
    }//GEN-LAST:event_btnalterarcar_mostrarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String placa = txtalterarcar_placa.getText();
        String placaN = txtalterarcar_placanova.getText();
        String tel = txtalterarcar_clitel.getText();
        String nome = txtalterarcar_clinome.getText();
        String nomeC = txtalterarcar_nomecar.getText();
        
        
        boolean altera = ge.alterarc(placa, placaN, tel, nome, nomeC);
        
        if (altera == true ) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!!");
        }
        else 
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!!!!");
        
        
        
        btnSave.setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtalterarcar_clitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarcar_clitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarcar_clitelActionPerformed

    private void txtalterarcar_placanovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarcar_placanovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarcar_placanovaActionPerformed

    private void txtalterarcar_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalterarcar_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalterarcar_placaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AlterarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnalterarcar_mostrar;
    private javax.swing.JButton btnalterarcar_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtalterarcar_clinome;
    private javax.swing.JFormattedTextField txtalterarcar_clitel;
    private javax.swing.JTextField txtalterarcar_nomecar;
    private javax.swing.JFormattedTextField txtalterarcar_placa;
    private javax.swing.JFormattedTextField txtalterarcar_placanova;
    // End of variables declaration//GEN-END:variables
}
