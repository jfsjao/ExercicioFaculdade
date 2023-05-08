package tp2_etapa3_joaofelipe_ianseki;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TabelaLavagem extends javax.swing.JFrame {

    ArrayList<Lavar> lavar = new ArrayList<>();
    Lavar l;
    Gerenciadora g;
    public TabelaLavagem(Gerenciadora g) {
        initComponents();
        setLocationRelativeTo(null);
        this.g = g;
    }
    
    private void preenchetabela(){
        lavar = g.retornal();
        DefaultTableModel l = new DefaultTableModel(new Object[]{"ID do Funcionario", "Placa do Carro", "Codigo de Lavagem", "Tipo de lavagem", "Hora de entrada", "Hora de saida"}, 0);
        for (int i = 0; i < lavar.size(); i++) {
            Object linha[] = new Object[]{lavar.get(i).getID(),
                lavar.get(i).getPlaca(),
                lavar.get(i).getCodlavagem(),
                lavar.get(i).getTipolavagem(),
                lavar.get(i).getHorasdeentrada(),
                lavar.get(i).getHorasestimadas()};
                l.addRow(linha);
                tbLavagem.setModel(l);
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLavagem = new javax.swing.JTable();
        btntabela_voltar = new javax.swing.JButton();
        btntabela_mostrartabela = new javax.swing.JButton();
        btntabela_excluir = new javax.swing.JButton();
        btntabela_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Carros a serem lavados:");

        tbLavagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do Funcionario", "Placa do carro", "Codigo de lavagem", "Tipo lavagem", "Horas de entrada", "Hora de saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLavagem.setToolTipText("");
        tbLavagem.getTableHeader().setReorderingAllowed(false);
        tbLavagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLavagemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLavagem);
        if (tbLavagem.getColumnModel().getColumnCount() > 0) {
            tbLavagem.getColumnModel().getColumn(2).setResizable(false);
            tbLavagem.getColumnModel().getColumn(4).setResizable(false);
        }

        btntabela_voltar.setText("Voltar");
        btntabela_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntabela_voltarActionPerformed(evt);
            }
        });

        btntabela_mostrartabela.setText("Mostrar tabela");
        btntabela_mostrartabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntabela_mostrartabelaActionPerformed(evt);
            }
        });

        btntabela_excluir.setText("Excluir");
        btntabela_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntabela_excluirActionPerformed(evt);
            }
        });

        btntabela_alterar.setText("Alterar");
        btntabela_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntabela_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntabela_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntabela_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntabela_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntabela_mostrartabela)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btntabela_mostrartabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntabela_excluir)
                        .addComponent(btntabela_alterar))
                    .addComponent(btntabela_voltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbLavagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLavagemMouseClicked
        
    }//GEN-LAST:event_tbLavagemMouseClicked

    private void btntabela_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntabela_voltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btntabela_voltarActionPerformed

    private void btntabela_mostrartabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntabela_mostrartabelaActionPerformed
        // TODO add your handling code here:
        preenchetabela();
        /*lavar = g.retornal();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID do Funcionario", "Placa do Carro", "Codigo de Lavagem", "Tipo de lavagem", "Hora de entrada", "Hora de saida"}, 0);
        for (int i = 0; i < lavar.size(); i++) {
            Object linha[] = new Object[]{lavar.get(i).getID(),
                lavar.get(i).getPlaca(),
                lavar.get(i).getCodlavagem(),
                lavar.get(i).getTipolavagem(),
                lavar.get(i).getHorasdeentrada(),
                lavar.get(i).getHorasestimadas()};
            model.addRow(linha);
        }*/
    }//GEN-LAST:event_btntabela_mostrartabelaActionPerformed

    private void btntabela_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntabela_alterarActionPerformed
        // TODO add your handling code here:
        AlterarLavagem al = new AlterarLavagem(g);
        al.setVisible(true);
        
    }//GEN-LAST:event_btntabela_alterarActionPerformed

    private void btntabela_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntabela_excluirActionPerformed
        // TODO add your handling code here:
        ExcluirLavagem el = new ExcluirLavagem(g);
        el.setVisible(true);
    }//GEN-LAST:event_btntabela_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaLavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaLavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaLavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaLavagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new TabelaLavagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntabela_alterar;
    private javax.swing.JButton btntabela_excluir;
    private javax.swing.JButton btntabela_mostrartabela;
    private javax.swing.JButton btntabela_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbLavagem;
    // End of variables declaration//GEN-END:variables
}
