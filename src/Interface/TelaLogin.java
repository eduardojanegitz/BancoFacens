package Interface;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Acesso = new javax.swing.JButton();
        cpf = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        LogoFacens = new javax.swing.JLabel();
        BancoFacens = new javax.swing.JLabel();
        PlanodeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Acesso.setText("Acessar ");
        Acesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessoActionPerformed(evt);
            }
        });
        getContentPane().add(Acesso);
        Acesso.setBounds(340, 200, 80, 23);
        getContentPane().add(cpf);
        cpf.setBounds(340, 130, 119, 30);

        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF");
        getContentPane().add(CPF);
        CPF.setBounds(300, 130, 40, 30);

        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("SENHA");
        getContentPane().add(Senha);
        Senha.setBounds(290, 160, 50, 30);

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(340, 160, 119, 30);

        LogoFacens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo da FACENS.png"))); // NOI18N
        getContentPane().add(LogoFacens);
        LogoFacens.setBounds(0, 110, 190, 150);

        BancoFacens.setBackground(new java.awt.Color(255, 255, 255));
        BancoFacens.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BancoFacens.setForeground(new java.awt.Color(255, 255, 255));
        BancoFacens.setText("BANCO FACENS ");
        getContentPane().add(BancoFacens);
        BancoFacens.setBounds(120, 10, 350, 70);

        PlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo de tela.jpg"))); // NOI18N
        getContentPane().add(PlanodeFundo);
        PlanodeFundo.setBounds(0, -40, 530, 400);

        setSize(new java.awt.Dimension(527, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessoActionPerformed
          
          if (cpf.getText().equals("123456789-00") && senha.getText().equals("01020304")) {
          JOptionPane.showMessageDialog (null, "Acesso Permitido. ");
          TelaPrincipal tela = new TelaPrincipal ();
          tela.setVisible (true); 
          dispose ();
       
      } else {
              
              JOptionPane.showMessageDialog (null, "Acesso Negado. \nTente novamente. ");
              TelaLogin tela1 = new TelaLogin();
              tela1.setVisible(true);
              dispose();
      
           }
    }//GEN-LAST:event_AcessoActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed

    
    }//GEN-LAST:event_senhaActionPerformed

    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acesso;
    private javax.swing.JLabel BancoFacens;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel LogoFacens;
    private javax.swing.JLabel PlanodeFundo;
    private javax.swing.JLabel Senha;
    private javax.swing.JTextField cpf;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
