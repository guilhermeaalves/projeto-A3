package Componentes;

import Componentes.TelaInicialPosLogin;

import java.sql.*;

import database.Conexao;

import javax.swing.JOptionPane;

import static Componentes.Login.*;

import static Componentes.ConsultaSaldo.*;

public class Deposito extends javax.swing.JFrame {


    public Deposito() {
        initComponents();
        this.setLocationRelativeTo(null);
        double saldoAtual = ConsultaSaldo.consultarSaldo(SessaoUsuario.idUsuarioLogado);
        saldo.setText(String.format("R$ %.2f", saldoAtual));
    }

    private void atualizarSaldo(String cpf) {
        try {
            int idUser = SessaoUsuario.idUsuarioLogado;
            Connection conn = Conexao.getConexao();


            String sqlBuscaUsuario = "SELECT id_usuario FROM user WHERE cpf = ?";
            PreparedStatement stmtBusca = conn.prepareStatement(sqlBuscaUsuario);
            stmtBusca.setString(1, cpf);
            ResultSet rs = stmtBusca.executeQuery();

            if (!rs.next()) {
                saldo.setText("Saldo: R$ 0.00");
                return;
            }

            int idUsuario = rs.getInt("id_usuario");


            String sqlBuscaSaldo = "SELECT saldo FROM user_saldo WHERE id_usuario = ?";
            PreparedStatement stmtSaldo = conn.prepareStatement(sqlBuscaSaldo);
            stmtSaldo.setInt(1, idUser);
            ResultSet rsSaldo = stmtSaldo.executeQuery();

            if (rsSaldo.next()) {
                double saldoAtual = rsSaldo.getDouble("saldo");
                saldo.setText(String.format("Saldo: R$ %.2f", saldoAtual));
            } else {
                saldo.setText("Saldo: R$ 0.00");
            }

        } catch (SQLException e) {
            saldo.setText("Erro ao consultar saldo");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSaque = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");

            inputCpf = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){
        }
        jLabel1 = new javax.swing.JLabel();
        btConfirmaDeposito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputFormaDeposito = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 130));

        btSaque.setBackground(new java.awt.Color(245, 99, 39));
        btSaque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo1_resized_50x50.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btSaque)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaque)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel1.setText("Depósito");

        btConfirmaDeposito.setBackground(new java.awt.Color(0, 0, 0));
        btConfirmaDeposito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btConfirmaDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmaDeposito.setText("Confirmar");
        btConfirmaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmaDepositoActionPerformed(evt);
            }
        });

        jLabel2.setText("Depósito via pix caem na hora !");

        jLabel4.setText("Nome Completo");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        inputValor.setToolTipText("");
        inputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel6.setText("Forma de Depósito");

        inputFormaDeposito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Ted" }));
        inputFormaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFormaDepositoActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputValor)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNome)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputFormaDeposito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConfirmaDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(inputFormaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConfirmaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorActionPerformed

    private void inputFormaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFormaDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFormaDepositoActionPerformed

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfActionPerformed

    private void btConfirmaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmaDepositoActionPerformed
        int idUser = SessaoUsuario.idUsuarioLogado;

        try {
            String cpf = inputCpf.getText().trim();
            String valorStr = inputValor.getText().trim().replace(",", ".");
            double valor = Double.parseDouble(valorStr);

            if (valor <= 0) {
                JOptionPane.showMessageDialog(this, "Insira um valor válido.");
                return;
            }

            Connection conn = Conexao.getConexao();

            int idUsuario = SessaoUsuario.idUsuarioLogado;

            String sqlVerificaSaldo = "SELECT saldo FROM user_saldo WHERE id_usuario = ?";
            PreparedStatement stmtVerifica = conn.prepareStatement(sqlVerificaSaldo);
            stmtVerifica.setInt(1, idUsuario);
            ResultSet rsSaldo = stmtVerifica.executeQuery();

            if (rsSaldo.next()) {

                String sqlUpdate = "UPDATE user_saldo SET saldo = saldo + ? WHERE id_usuario = ?";
                PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
                stmtUpdate.setDouble(1, valor);
                stmtUpdate.setInt(2, idUsuario);
                stmtUpdate.executeUpdate();
            } else {

                String sqlInsert = "INSERT INTO user_saldo (id_usuario, saldo) VALUES (?, ?)";
                PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
                stmtInsert.setInt(1, idUsuario);
                stmtInsert.setDouble(2, valor);
                stmtInsert.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso!");

            String sql = "SELECT saldo FROM conta WHERE id_usuario = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            int saldoFinal = 0;
            if (rs.next()) {
                saldoFinal = rs.getInt("saldo");
            }
            atualizarSaldo(cpf);
            saldo.setText(String.valueOf(valor + saldoFinal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor numérico válido.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao realizar depósito: " + e.getMessage());
        }
    }        // TODO add your handling code here:
//GEN-LAST:event_btConfirmaDepositoActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        // TODO add your handling code here:

        new Saque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSaqueActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new TelaInicialPosLogin().setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmaDeposito;
    private javax.swing.JButton btSaque;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JComboBox<String> inputFormaDeposito;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}