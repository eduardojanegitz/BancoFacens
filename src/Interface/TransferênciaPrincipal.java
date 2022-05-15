package Interface;

import javax.swing.JOptionPane;

public class TransferênciaPrincipal extends javax.swing.JFrame {

    public TransferênciaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtConta = new javax.swing.JTextField();
        TxtBanco = new javax.swing.JTextField();
        TxtAgência = new javax.swing.JTextField();
        BtnVoltar = new javax.swing.JButton();
        BtnConfirmar2 = new javax.swing.JButton();
        ValordaTransferência = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 61, 100, -1));
        getContentPane().add(TxtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 123, 100, -1));
        getContentPane().add(TxtAgência, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 92, 100, -1));

        BtnVoltar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnVoltar.setForeground(new java.awt.Color(0, 0, 255));
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 222, -1, -1));

        BtnConfirmar2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnConfirmar2.setForeground(new java.awt.Color(0, 0, 255));
        BtnConfirmar2.setText("Confirmar");
        BtnConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmar2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConfirmar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 222, -1, -1));
        getContentPane().add(ValordaTransferência, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 164, 90, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qual é o valor da transferência? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 167, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 167, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Conta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 64, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agência:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Banco:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 126, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo de tela.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 430, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmar2ActionPerformed
        int saldoatual = Integer.parseInt (ValordaTransferência.getText());
        int diferença = 1000 - saldoatual;
        if (diferença < 0) { 
            JOptionPane.showMessageDialog(null, "Transferência não realizada. \nSaldo insuficiente. ");
        } else {
        JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso. \nSaldo atual: R$" + diferença);
        }
    }//GEN-LAST:event_BtnConfirmar2ActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        TelaPrincipal tela1 = new TelaPrincipal();
        tela1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void TxtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferênciaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmar2;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JTextField TxtAgência;
    private javax.swing.JTextField TxtBanco;
    private javax.swing.JTextField TxtConta;
    private javax.swing.JTextField ValordaTransferência;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
