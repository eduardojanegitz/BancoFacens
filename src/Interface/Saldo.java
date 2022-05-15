
package Interface;

public class Saldo extends javax.swing.JFrame {

    
    public Saldo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSaldo = new javax.swing.JLabel();
        BtnVoltar = new javax.swing.JButton();
        labeltxtSaldo = new javax.swing.JLabel();
        BtnExtrato = new javax.swing.JButton();
        BtnSaque = new javax.swing.JButton();
        BtnDepósito = new javax.swing.JButton();
        PlanodeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSaldo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(255, 255, 255));
        labelSaldo.setText("R$1.000,00");
        getContentPane().add(labelSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        BtnVoltar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnVoltar.setForeground(new java.awt.Color(0, 0, 255));
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 95, 30));

        labeltxtSaldo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labeltxtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        labeltxtSaldo.setText("Saldo disponível:");
        getContentPane().add(labeltxtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        BtnExtrato.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnExtrato.setForeground(new java.awt.Color(0, 0, 255));
        BtnExtrato.setText("Ver extrato");
        BtnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 95, 30));

        BtnSaque.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnSaque.setForeground(new java.awt.Color(0, 0, 255));
        BtnSaque.setText("Saque");
        BtnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaqueActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 95, 30));

        BtnDepósito.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnDepósito.setForeground(new java.awt.Color(0, 0, 255));
        BtnDepósito.setText("Depositar");
        BtnDepósito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepósitoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDepósito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 95, 30));

        PlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo de tela.jpg"))); // NOI18N
        PlanodeFundo.setText("jLabel1");
        getContentPane().add(PlanodeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 380, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExtratoActionPerformed
        ExtratoPrincipal tela2 = new ExtratoPrincipal();
        tela2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnExtratoActionPerformed

    private void BtnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaqueActionPerformed
        SaquePrincipal tela3 = new SaquePrincipal();
        tela3.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSaqueActionPerformed

    private void BtnDepósitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepósitoActionPerformed
        DepósitoPrincipal tela4 = new DepósitoPrincipal();
        tela4.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnDepósitoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDepósito;
    private javax.swing.JButton BtnExtrato;
    private javax.swing.JButton BtnSaque;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel PlanodeFundo;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labeltxtSaldo;
    // End of variables declaration//GEN-END:variables
}
