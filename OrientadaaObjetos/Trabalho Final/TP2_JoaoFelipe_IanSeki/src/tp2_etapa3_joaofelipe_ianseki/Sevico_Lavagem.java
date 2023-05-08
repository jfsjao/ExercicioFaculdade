
package tp2_etapa3_joaofelipe_ianseki;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sevico_Lavagem extends javax.swing.JFrame {

  
    Gerenciadora g2;
    public Sevico_Lavagem(Gerenciadora g2) {
        initComponents();
        setLocationRelativeTo(null);
        this.g2 = g2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnlavagem_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnlavagem_armazenar = new javax.swing.JButton();
        txtlavagem_idfun = new javax.swing.JTextField();
        txtlavagem_tipolavagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtlavagem_codlavagem = new javax.swing.JTextField();
        btnlavagem_tabela = new javax.swing.JButton();
        txtlavagem_horaentrada = new javax.swing.JFormattedTextField();
        txtlavagem_horasaida = new javax.swing.JFormattedTextField();
        txtlavagem_placacar = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Carros para Lavagem:");

        btnlavagem_voltar.setText("Voltar");
        btnlavagem_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlavagem_voltarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID do funcionario que irá fazer o serviço:");

        jLabel3.setText("Placa  do carro para lavagem:");

        jLabel4.setText("Tipo lavagem:");

        jLabel5.setText("Hora de entrada: ");

        jLabel6.setText("Previsão de hora de saída:");

        btnlavagem_armazenar.setText("Cadastrar lavagem");
        btnlavagem_armazenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlavagem_armazenarActionPerformed(evt);
            }
        });

        jLabel7.setText("Código Lavagem:");

        btnlavagem_tabela.setText("Tabela de serviços");
        btnlavagem_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlavagem_tabelaActionPerformed(evt);
            }
        });

        try {
            txtlavagem_horaentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtlavagem_horaentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlavagem_horaentradaActionPerformed(evt);
            }
        });

        try {
            txtlavagem_horasaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtlavagem_horasaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlavagem_horasaidaActionPerformed(evt);
            }
        });

        try {
            txtlavagem_placacar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtlavagem_placacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlavagem_placacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnlavagem_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlavagem_armazenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlavagem_tabela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtlavagem_horaentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtlavagem_horasaida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtlavagem_placacar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtlavagem_tipolavagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtlavagem_codlavagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtlavagem_idfun)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlavagem_idfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlavagem_placacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtlavagem_tipolavagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtlavagem_horaentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtlavagem_horasaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtlavagem_codlavagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlavagem_armazenar)
                    .addComponent(btnlavagem_voltar)
                    .addComponent(btnlavagem_tabela))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlavagem_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlavagem_voltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btnlavagem_voltarActionPerformed

    public void verificaCod(int cod){
           
        ArrayList<Lavar> lavar = g2.retornal();
        for(Lavar l: lavar){
            if(l.getCodlavagem() == cod){
                throw new CodInvalidException();
            }
        }
    }
    
    
    private void btnlavagem_armazenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlavagem_armazenarActionPerformed
        
    try{   
        String horae = txtlavagem_horaentrada.getText();
        String horas = txtlavagem_horasaida.getText();
        int idfun = Integer.parseInt(txtlavagem_idfun.getText());
        String placa = txtlavagem_placacar.getText();
        String tipolavagem = txtlavagem_tipolavagem.getText();
        int cod = Integer.parseInt(txtlavagem_codlavagem.getText());
        
        verificaCod(cod);
        
     boolean verifica = g2.cadastrarl(placa, tipolavagem, idfun, cod, horas, horae);
        if (verifica == true) {
                txtlavagem_horaentrada.setText("");
                txtlavagem_horasaida.setText("");
                txtlavagem_idfun.setText("");
                txtlavagem_placacar.setText("");
                txtlavagem_tipolavagem.setText("");
                txtlavagem_codlavagem.setText("");
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
                
            } else {
                JOptionPane.showMessageDialog(null, " Não cadastrado!!!");
            }
        
    }catch(CodInvalidException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
    }
            

    }//GEN-LAST:event_btnlavagem_armazenarActionPerformed

    private void btnlavagem_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlavagem_tabelaActionPerformed
        // TODO add your handling code here:
        TabelaLavagem t = new TabelaLavagem(g2);
        t.setVisible(true);
    }//GEN-LAST:event_btnlavagem_tabelaActionPerformed

    private void txtlavagem_horaentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlavagem_horaentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlavagem_horaentradaActionPerformed

    private void txtlavagem_horasaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlavagem_horasaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlavagem_horasaidaActionPerformed

    private void txtlavagem_placacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlavagem_placacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlavagem_placacarActionPerformed

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
            java.util.logging.Logger.getLogger(Sevico_Lavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sevico_Lavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sevico_Lavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sevico_Lavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Sevico_Lavagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlavagem_armazenar;
    private javax.swing.JButton btnlavagem_tabela;
    private javax.swing.JButton btnlavagem_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtlavagem_codlavagem;
    private javax.swing.JFormattedTextField txtlavagem_horaentrada;
    private javax.swing.JFormattedTextField txtlavagem_horasaida;
    private javax.swing.JTextField txtlavagem_idfun;
    private javax.swing.JFormattedTextField txtlavagem_placacar;
    private javax.swing.JTextField txtlavagem_tipolavagem;
    // End of variables declaration//GEN-END:variables
}
