
package Interface;
import javax.swing.JOptionPane;

public class DepósitoPrincipal extends javax.swing.JFrame {
    
    public DepósitoPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campodetexto = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        saldoatual = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informe o valor do depósito:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        campodetexto.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        campodetexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campodetextoActionPerformed(evt);
            }
        });
        getContentPane().add(campodetexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, -1));

        confirmar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        confirmar.setForeground(new java.awt.Color(0, 0, 255));
        confirmar.setText("Confirmar");
        confirmar.setToolTipText("");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        saldoatual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(saldoatual, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 223, 80, -1));

        BtnSair.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnSair.setForeground(new java.awt.Color(0, 0, 255));
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("R$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo de tela.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 330, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campodetextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campodetextoActionPerformed
       
    }//GEN-LAST:event_campodetextoActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        float n1 = Integer.parseInt (campodetexto.getText());
        float soma = n1 + 1000;
        JOptionPane.showMessageDialog(null, "Saldo Disponível: R$"+soma);
     
    }//GEN-LAST:event_confirmarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
       TelaPrincipal tela = new TelaPrincipal ();
        tela.setVisible (true);
        dispose ();
    }//GEN-LAST:event_BtnSairActionPerformed
    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepósitoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepósitoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepósitoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepósitoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepósitoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSair;
    private javax.swing.JTextField campodetexto;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel saldoatual;
    // End of variables declaration//GEN-END:variables
}
