import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldIngresso;
	private JTextField textFieldTelefone;
	private JTextField textFieldContato;
	private JTextField textFieldCelular;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textFieldCargo;
	private JTextField textFieldSalarioBase;
	private JTextField textFieldSenha;
	private JTextField textFieldUsuario;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(6, 5, 61, 16);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(79, 0, 365, 26);
		contentPane.add(textField);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(6, 33, 61, 16);
		contentPane.add(lblEndereco);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 28, 247, 26);
		contentPane.add(textField_1);
		
		JLabel lblDataIngresso = new JLabel("Ingresso:");
		lblDataIngresso.setBounds(6, 138, 61, 16);
		contentPane.add(lblDataIngresso);
		
		textFieldIngresso = new JTextField();
		textFieldIngresso.setColumns(10);
		textFieldIngresso.setBounds(79, 133, 130, 26);
		contentPane.add(textFieldIngresso);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(221, 138, 61, 16);
		contentPane.add(lblTelefone);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(314, 133, 130, 26);
		contentPane.add(textFieldTelefone);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setBounds(6, 166, 76, 16);
		contentPane.add(lblContato);
		
		textFieldContato = new JTextField();
		textFieldContato.setColumns(10);
		textFieldContato.setBounds(79, 161, 130, 26);
		contentPane.add(textFieldContato);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(221, 166, 76, 16);
		contentPane.add(lblCelular);
		
		textFieldCelular = new JTextField();
		textFieldCelular.setColumns(10);
		textFieldCelular.setBounds(314, 161, 130, 26);
		contentPane.add(textFieldCelular);
		
		JLabel lblSalarioBase = new JLabel("SalarioBase:");
		lblSalarioBase.setBounds(221, 192, 89, 16);
		contentPane.add(lblSalarioBase);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(6, 192, 61, 16);
		contentPane.add(lblCargo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco endereco = new Endereco(textField_1.getText(), 
						Integer.parseInt(textField_7.getText()), textField_10.getText(), 
						textField_8.getText(), textField_9.getText(), textField_11.getText());
				
				Date dataRecebida = new Date("01/01/1900"); 
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
				
				Date data = dataRecebida;
				try {
					data = formato.parse(textFieldIngresso.getText());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				Funcionario funcionario = new Funcionario(textField_2.getText(), textField.getText(), endereco,
						textFieldTelefone.getText(), textFieldContato.getText(), textFieldCelular.getText(),
						data, textFieldCargo.getText(), Double.parseDouble(textFieldSalarioBase.getText()),
								textFieldUsuario.getText(), textFieldSenha.getText());
				
			}
		});
		
		btnSalvar.setBounds(155, 242, 117, 29);
		contentPane.add(btnSalvar);
		
		JLabel lblNumero = new JLabel("Nº:");
		lblNumero.setBounds(338, 33, 25, 16);
		contentPane.add(lblNumero);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(375, 28, 69, 26);
		contentPane.add(textField_7);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(6, 61, 76, 16);
		contentPane.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(6, 89, 61, 16);
		contentPane.add(lblBairro);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(79, 56, 130, 26);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(79, 84, 130, 26);
		contentPane.add(textField_9);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(221, 61, 100, 16);
		contentPane.add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(221, 93, 61, 16);
		contentPane.add(lblCidade);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(314, 56, 130, 26);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(314, 88, 130, 26);
		contentPane.add(textField_11);
		
		textFieldCargo = new JTextField();
		textFieldCargo.setBounds(79, 187, 130, 26);
		contentPane.add(textFieldCargo);
		textFieldCargo.setColumns(10);
		
		textFieldSalarioBase = new JTextField();
		textFieldSalarioBase.setBounds(314, 187, 130, 26);
		contentPane.add(textFieldSalarioBase);
		textFieldSalarioBase.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(221, 220, 89, 16);
		contentPane.add(lblSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setColumns(10);
		textFieldSenha.setBounds(314, 215, 130, 26);
		contentPane.add(textFieldSenha);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(6, 220, 61, 16);
		contentPane.add(lblUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(79, 215, 130, 26);
		contentPane.add(textFieldUsuario);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(6, 115, 61, 16);
		contentPane.add(lblCPF);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 110, 130, 26);
		contentPane.add(textField_2);
	}

}
