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

public class cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField textoSenha;
	private JTextField textoEmail;
	private JTextField textoNome;
	private JTextField textoCPF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro frame = new cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public cadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\icone bicho do jogo.png"));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imagemLogo = new JLabel("");
		imagemLogo.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\logo bicho do jogo.png"));
		imagemLogo.setBounds(380, -36, 597, 321);
		contentPane.add(imagemLogo);
		
		textoSenha = new JPasswordField();
		textoSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		textoSenha.setBounds(425, 568, 442, 40);
		contentPane.add(textoSenha);
		
		JLabel lblTitulo = new JLabel("Crie sua Conta");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 28));
		lblTitulo.setForeground(new Color(255, 128, 0));
		lblTitulo.setBounds(515, 226, 358, 38);
		contentPane.add(lblTitulo);
		
		JLabel lblSubTitulo = new JLabel("Insira suas informações para criar uma conta");
		lblSubTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubTitulo.setBounds(482, 275, 364, 14);
		contentPane.add(lblSubTitulo);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(425, 386, 46, 14);
		contentPane.add(lblEmail);
		
		JButton botaoCriar = new JButton("Criar");
		botaoCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCriar.setForeground(new Color(255, 255, 255));
		botaoCriar.setBackground(new Color(0, 0, 0));
		botaoCriar.setBounds(425, 619, 443, 38);
		contentPane.add(botaoCriar);
		
		textoEmail = new JTextField();
		textoEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		textoEmail.setBounds(425, 411, 442, 40);
		contentPane.add(textoEmail);
		textoEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(425, 543, 46, 14);
		contentPane.add(lblSenha);
		
		textoNome = new JTextField();
		textoNome.setFont(new Font("Arial", Font.PLAIN, 18));
		textoNome.setColumns(10);
		textoNome.setBounds(425, 330, 442, 38);
		contentPane.add(textoNome);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(425, 305, 46, 14);
		contentPane.add(lblNome);
		
		textoCPF = new JTextField();
		textoCPF.setFont(new Font("Arial", Font.PLAIN, 18));
		textoCPF.setColumns(10);
		textoCPF.setBounds(425, 492, 442, 40);
		contentPane.add(textoCPF);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf.setBounds(425, 467, 46, 14);
		contentPane.add(lblCpf);
	}
}