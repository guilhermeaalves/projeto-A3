package Componentes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField textoSenha;
	private JTextField textoEmail;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\icone bicho do jogo.png"));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 898);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imagemLogo = new JLabel("");
		imagemLogo.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\logo bicho do jogo.png"));
		imagemLogo.setBounds(396, 0, 597, 321);
		contentPane.add(imagemLogo);
		
		textoSenha = new JPasswordField();
		textoSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		textoSenha.setBounds(424, 590, 442, 54);
		contentPane.add(textoSenha);
		
		JLabel lblTitulo = new JLabel("Entre na sua Conta");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 28));
		lblTitulo.setForeground(new Color(255, 128, 0));
		lblTitulo.setBounds(496, 285, 358, 38);
		contentPane.add(lblTitulo);
		
		JLabel lblSubTitulo = new JLabel("Insira seu e-mail e sua senha para acessar sua conta!");
		lblSubTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubTitulo.setBounds(467, 332, 364, 14);
		contentPane.add(lblSubTitulo);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(424, 396, 46, 14);
		contentPane.add(lblEmail);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoEntrar.setForeground(new Color(255, 255, 255));
		botaoEntrar.setBackground(new Color(0, 0, 0));
		botaoEntrar.setBounds(424, 677, 443, 38);
		contentPane.add(botaoEntrar);
		
		textoEmail = new JTextField();
		textoEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		textoEmail.setBounds(424, 440, 442, 54);
		contentPane.add(textoEmail);
		textoEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(424, 545, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel esqueceuSenha = new JLabel("Esqueceu sua senha?");
		esqueceuSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		esqueceuSenha.setBounds(424, 744, 442, 38);
		contentPane.add(esqueceuSenha);
	}
}