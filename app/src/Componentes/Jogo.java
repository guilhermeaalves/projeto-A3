/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Componentes;

import database.Conexao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.SecureRandom;

import static javax.swing.JOptionPane.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Componentes.Login.*;


public class Jogo extends JFrame {

    public Jogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        double saldoAtual = ConsultaSaldo.consultarSaldo(SessaoUsuario.idUsuarioLogado);
        saldo.setText(String.valueOf(saldoAtual));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        btDeposito = new JButton();
        btSaque = new JButton();
        saldo = new JLabel();
        jLabel6 = new JLabel();
        jLabel3 = new JLabel();
        numeroApostaInput = new JTextField();
        jLabel4 = new JLabel();
        btAposta = new JButton();
        valorApostaInput = new JTextField();
        jLabel2 = new JLabel();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new Dimension(602, 127));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/assets/logo1_resized_50x50.png"))); // NOI18N
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btDeposito.setBackground(new Color(245, 99, 39));
        btDeposito.setText("Depósito");
        btDeposito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        btSaque.setText("Saque");
        btSaque.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        saldo.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        saldo.setText("0.00");

        jLabel6.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("R$");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(90, 90, 90).addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(saldo, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btDeposito, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27).addComponent(btSaque, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(97, 97, 97)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(40, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(37, 37, 37)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(btDeposito).addComponent(btSaque).addComponent(saldo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE).addComponent(jLabel6)).addGap(49, 49, 49)))));

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/assets/logo2.png"))); // NOI18N

        numeroApostaInput.setToolTipText("");
        numeroApostaInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numeroApostaInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Escolha um número e o valor que deseja apostar");

        btAposta.setBackground(new Color(236, 34, 31));
        btAposta.setText("Apostar");
        btAposta.setToolTipText("");
        btAposta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btApostaActionPerformed(evt);
            }
        });

        valorApostaInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                valorApostaInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Número");

        jLabel5.setText("Valor");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addGap(535, 535, 535).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(btAposta, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE).addGap(552, 552, 552)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(numeroApostaInput, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE).addComponent(valorApostaInput, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE).addComponent(jLabel2).addComponent(jLabel5)).addGap(509, 509, 509))).addGap(0, 0, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel3).addGap(390, 390, 390)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE).addGap(474, 474, 474)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(80, 80, 80).addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE).addGap(30, 30, 30)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addComponent(numeroApostaInput, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5).addGap(3, 3, 3).addComponent(valorApostaInput, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addGap(36, 36, 36).addComponent(btAposta, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE).addContainerGap(74, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDepositoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        // TODO add your handling code here:
        new Deposito().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btSaqueActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        // TODO add your handling code here:
        new Saque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSaqueActionPerformed

    private void numeroApostaInputActionPerformed(ActionEvent evt) {//GEN-FIRST:event_numeroApostaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroApostaInputActionPerformed

    private void valorApostaInputActionPerformed(ActionEvent evt) {//GEN-FIRST:event_valorApostaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorApostaInputActionPerformed

    private void jLabel1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new TelaInicialPosLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    public static int consultarJogadas() {
        int numJogadas = 0;

        try {
            Connection conn = Conexao.getConexao();
            int idUser = SessaoUsuario.idUsuarioLogado;
            String sql = "SELECT jogo FROM num_apostas WHERE id_usuario = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idUser);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                numJogadas = rs.getInt("num_apostas");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numJogadas;
    }
    private void btApostaActionPerformed(ActionEvent evt) {
        try {
            int numAposta = Integer.parseInt(numeroApostaInput.getText());
            double valorAposta = Double.parseDouble(valorApostaInput.getText());
            double saldoInicial = Double.parseDouble(saldo.getText());
            int idUser = SessaoUsuario.idUsuarioLogado;

            if (valorAposta > saldoInicial) {
                showMessageDialog(this, "Saldo insuficiente para essa aposta.");
                return;
            }

            Connection conn = Conexao.getConexao();

            String sqlBuscaJogo = "SELECT num_apostas, valor_apostado FROM jogo WHERE id_usuario = ?";
            PreparedStatement stmtBusca = conn.prepareStatement(sqlBuscaJogo);
            stmtBusca.setInt(1, idUser);
            ResultSet rs = stmtBusca.executeQuery();

            int quantidadeApostas = 0;
            double valorTotal = 0;

            boolean existeLinha = false;
            if (rs.next()) {
                existeLinha = true;
                quantidadeApostas = rs.getInt("num_apostas");
                valorTotal = rs.getDouble("valor_apostado");
            }

            SecureRandom sr = new SecureRandom();
            int numeroSorteado = quantidadeApostas >= 10 ? sr.nextInt(5) + 1 : sr.nextInt(10000) + 1;

            double saldoFinal;
            if (numAposta == numeroSorteado) {
                saldoFinal = saldoInicial + (valorAposta * 10);
                showMessageDialog(this, "Você ganhou!");
                showMessageDialog(this, "Ganho de: " + (valorAposta * 2));
            } else {
                saldoFinal = saldoInicial - valorAposta;
                showMessageDialog(this, "Não foi dessa vez");
                showMessageDialog(this, "Perda de: " + valorAposta);
            }

            saldo.setText(String.valueOf(saldoFinal));
            numeroApostaInput.setText("");
            valorApostaInput.setText("");
            numeroApostaInput.requestFocus();
            numeroApostaInput.selectAll();

            String sqlUpdateSaldo = "UPDATE user_saldo SET saldo = ? WHERE id_usuario = ?";
            PreparedStatement stmtSaldo = conn.prepareStatement(sqlUpdateSaldo);
            stmtSaldo.setDouble(1, saldoFinal);
            stmtSaldo.setInt(2, idUser);
            stmtSaldo.executeUpdate();

            if (existeLinha) {
                String sqlUpdateJogo = "UPDATE jogo SET num_apostas = ?, valor_apostado = ? WHERE id_usuario = ?";
                PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdateJogo);
                stmtUpdate.setInt(1, quantidadeApostas + 1);
                stmtUpdate.setDouble(2, valorTotal + valorAposta);
                stmtUpdate.setInt(3, idUser);
                stmtUpdate.executeUpdate();
            } else {
                String sqlInsertJogo = "INSERT INTO jogo (id_usuario, num_apostas, valor_apostado) VALUES (?, ?, ?)";
                PreparedStatement stmtInsert = conn.prepareStatement(sqlInsertJogo);
                stmtInsert.setInt(1, idUser);
                stmtInsert.setInt(2, 1);
                stmtInsert.setDouble(3, valorAposta);
                stmtInsert.executeUpdate();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            showMessageDialog(this, e.getMessage());
        }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btAposta;
    private JButton btDeposito;
    private JButton btSaque;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JTextField numeroApostaInput;
    private JLabel saldo;
    private JTextField valorApostaInput;
    // End of variables declaration//GEN-END:variables
}