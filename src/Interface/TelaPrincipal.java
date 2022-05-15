package Interface;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        saldo = new javax.swing.JButton();
        depósito = new javax.swing.JButton();
        saque = new javax.swing.JButton();
        extrato = new javax.swing.JButton();
        BtnSair2 = new javax.swing.JButton();
        BtnTransferência = new javax.swing.JButton();
        OláEduardo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnConta = new javax.swing.JButton();
        PlanodeFundoBranco = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        saldo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        saldo.setForeground(new java.awt.Color(0, 0, 255));
        saldo.setText("SALDO");
        saldo.setMargin(null);
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(25, 103, 130, 30);

        depósito.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        depósito.setForeground(new java.awt.Color(0, 0, 255));
        depósito.setText("DEPÓSITO");
        depósito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depósitoActionPerformed(evt);
            }
        });
        getContentPane().add(depósito);
        depósito.setBounds(25, 199, 130, 30);

        saque.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        saque.setForeground(new java.awt.Color(0, 0, 255));
        saque.setText("SAQUE");
        saque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueActionPerformed(evt);
            }
        });
        getContentPane().add(saque);
        saque.setBounds(25, 135, 130, 30);

        extrato.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        extrato.setForeground(new java.awt.Color(0, 0, 255));
        extrato.setText("EXTRATO");
        extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratoActionPerformed(evt);
            }
        });
        getContentPane().add(extrato);
        extrato.setBounds(25, 231, 130, 30);

        BtnSair2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnSair2.setForeground(new java.awt.Color(0, 0, 255));
        BtnSair2.setText("SAIR");
        BtnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSair2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSair2);
        BtnSair2.setBounds(25, 263, 130, 30);

        BtnTransferência.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnTransferência.setForeground(new java.awt.Color(0, 0, 255));
        BtnTransferência.setText("TRANSFERÊNCIA");
        BtnTransferência.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransferênciaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTransferência);
        BtnTransferência.setBounds(25, 167, 130, 30);

        OláEduardo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        OláEduardo.setForeground(new java.awt.Color(0, 51, 255));
        OláEduardo.setText("Olá, Eduardo");
        getContentPane().add(OláEduardo);
        OláEduardo.setBounds(10, 40, 110, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo da FACENS.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 90, 190, 200);

        BtnConta.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnConta.setForeground(new java.awt.Color(0, 0, 255));
        BtnConta.setText("CONTA");
        BtnConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConta);
        BtnConta.setBounds(10, 20, 67, 23);

        PlanodeFundoBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo de tela.jpg"))); // NOI18N
        getContentPane().add(PlanodeFundoBranco);
        PlanodeFundoBranco.setBounds(0, 0, 440, 330);

        setSize(new java.awt.Dimension(455, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        Saldo tela = new Saldo ();
        tela.setVisible (true);
        dispose ();
    }//GEN-LAST:event_saldoActionPerformed

    private void depósitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depósitoActionPerformed
        DepósitoPrincipal tela1 = new DepósitoPrincipal ();
        tela1.setVisible (true);
        dispose ();
    }//GEN-LAST:event_depósitoActionPerformed

    private void saqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueActionPerformed
        SaquePrincipal tela2 = new SaquePrincipal ();
        tela2.setVisible (true);
        dispose ();
    }//GEN-LAST:event_saqueActionPerformed

    private void extratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratoActionPerformed
        ExtratoPrincipal tela3 = new ExtratoPrincipal ();
        tela3.setVisible (true);
        dispose ();
    }//GEN-LAST:event_extratoActionPerformed

    private void BtnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSair2ActionPerformed
        System.exit (0);
    }//GEN-LAST:event_BtnSair2ActionPerformed

    private void BtnTransferênciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransferênciaActionPerformed
       TransferênciaPrincipal tela4 = new TransferênciaPrincipal ();
       tela4.setVisible(true);
       dispose();
    }//GEN-LAST:event_BtnTransferênciaActionPerformed

    private void BtnContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContaActionPerformed
       ContaPrincipal tela5 = new ContaPrincipal();
       tela5.setVisible(true);
       dispose();
    }//GEN-LAST:event_BtnContaActionPerformed
    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConta;
    private javax.swing.JButton BtnSair2;
    private javax.swing.JButton BtnTransferência;
    private javax.swing.JLabel OláEduardo;
    private javax.swing.JLabel PlanodeFundoBranco;
    private javax.swing.JButton depósito;
    private javax.swing.JButton extrato;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton saldo;
    private javax.swing.JButton saque;
    // End of variables declaration//GEN-END:variables
}
