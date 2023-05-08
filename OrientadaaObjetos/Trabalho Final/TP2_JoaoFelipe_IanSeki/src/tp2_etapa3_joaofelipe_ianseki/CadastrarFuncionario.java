
package tp2_etapa3_joaofelipe_ianseki;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarFuncionario extends javax.swing.JFrame {

 
    Gerenciadora ge;

    //ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    public CadastrarFuncionario(Gerenciadora ge) {
        initComponents();
        setLocationRelativeTo(null);
        this.ge = ge;
    }

    public CadastrarFuncionario() {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcadastro_cpffun1 = new javax.swing.JFormattedTextField();
        txtcadastro_nomefun = new javax.swing.JTextField();
        txtcadastro_idfun = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btccadastro_cadastrar = new javax.swing.JButton();
        btncadastro_voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcadastro_cpffun = new javax.swing.JFormattedTextField();
        btncadastro_consultar = new javax.swing.JButton();

        try {
            txtcadastro_cpffun1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcadastro_cpffun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastro_cpffun1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcadastro_nomefun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastro_nomefunActionPerformed(evt);
            }
        });

        txtcadastro_idfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastro_idfunActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME:");

        jLabel2.setText("CPF:");

        jLabel3.setText("ID:");

        btccadastro_cadastrar.setText("Cadastrar");
        btccadastro_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btccadastro_cadastrarActionPerformed(evt);
            }
        });

        btncadastro_voltar.setText("Voltar");
        btncadastro_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastro_voltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Cadastro de Funcionario");

        try {
            txtcadastro_cpffun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcadastro_cpffun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastro_cpffunActionPerformed(evt);
            }
        });

        btncadastro_consultar.setText("Consultar");
        btncadastro_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastro_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncadastro_voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncadastro_consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btccadastro_cadastrar))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcadastro_nomefun)
                            .addComponent(txtcadastro_cpffun)
                            .addComponent(txtcadastro_idfun, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadastro_nomefun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcadastro_cpffun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadastro_idfun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btccadastro_cadastrar)
                    .addComponent(btncadastro_voltar)
                    .addComponent(btncadastro_consultar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificaId(int id){
        
        ArrayList<Funcionario> fun = ge.retornaf();
        for(Funcionario f: fun){
            if(f.getId() == id){
                throw new IdInvalidException();
            }
        }
        
    }
    private void btccadastro_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btccadastro_cadastrarActionPerformed
            
       try{    
            int id = Integer.parseInt(txtcadastro_idfun.getText());
            
             verificaId(id);
            
            String cpf = txtcadastro_cpffun.getText();
            String nome = txtcadastro_nomefun.getText();
            
            

            boolean cad = ge.cadastrarf(id, cpf, nome);
            if (cad == true) {
                txtcadastro_cpffun.setText("");
                txtcadastro_nomefun.setText("");
                txtcadastro_idfun.setText("");
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, " Não cadastrado!!!");
            }
          
       }catch(IdInvalidException e){
          JOptionPane.showMessageDialog(null, e.getMessage());           
       }

    }//GEN-LAST:event_btccadastro_cadastrarActionPerformed

    private void txtcadastro_nomefunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastro_nomefunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadastro_nomefunActionPerformed

    private void txtcadastro_cpffunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastro_cpffunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadastro_cpffunActionPerformed

    private void btncadastro_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastro_voltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_btncadastro_voltarActionPerformed

    private void btncadastro_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastro_consultarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);                                         //some com a tela principal
        new ConsultarFuncionario(ge).setVisible(true);
    }//GEN-LAST:event_btncadastro_consultarActionPerformed

    private void txtcadastro_cpffun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastro_cpffun1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadastro_cpffun1ActionPerformed

    private void txtcadastro_idfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastro_idfunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadastro_idfunActionPerformed

    public Gerenciadora retornarArray() {

        return ge;
    }

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
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btccadastro_cadastrar;
    private javax.swing.JButton btncadastro_consultar;
    private javax.swing.JButton btncadastro_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtcadastro_cpffun;
    private javax.swing.JFormattedTextField txtcadastro_cpffun1;
    private javax.swing.JTextField txtcadastro_idfun;
    private javax.swing.JTextField txtcadastro_nomefun;
    // End of variables declaration//GEN-END:variables
}
