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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCPF;
	private JTextField textFieldEmail;
	private JTextField textFieldTelefone1;
	private JTextField textFieldTelefone2;
	private JTextField textFieldProfissao;
	private JTextField textFieldNumero;
	private JTextField textFieldCep;
	private JTextField textFieldBairro;
	private JTextField textFieldComplemento;
	private JTextField textFieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(6, 5, 61, 16);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(79, 0, 365, 26);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(6, 38, 61, 16);
		contentPane.add(lblEndereco);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(79, 33, 247, 26);
		contentPane.add(textFieldEndereco);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(6, 121, 61, 16);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(79, 116, 130, 26);
		contentPane.add(textFieldCPF);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(221, 121, 61, 16);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(314, 116, 130, 26);
		contentPane.add(textFieldEmail);
		
		JLabel lblTelefone1 = new JLabel("Telefone 1:");
		lblTelefone1.setBounds(6, 154, 76, 16);
		contentPane.add(lblTelefone1);
		
		textFieldTelefone1 = new JTextField();
		textFieldTelefone1.setColumns(10);
		textFieldTelefone1.setBounds(79, 149, 130, 26);
		contentPane.add(textFieldTelefone1);
		
		JLabel lblTelefone2 = new JLabel("Telefone 2:");
		lblTelefone2.setBounds(221, 154, 76, 16);
		contentPane.add(lblTelefone2);
		
		textFieldTelefone2 = new JTextField();
		textFieldTelefone2.setColumns(10);
		textFieldTelefone2.setBounds(314, 149, 130, 26);
		contentPane.add(textFieldTelefone2);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(221, 182, 89, 16);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(6, 182, 61, 16);
		contentPane.add(lblSexo);
		
		
		String[] sexo = {"Masculino", "Feminino", "Outros"};
		String[] estadoCivil = {"Casado", "Solteiro", "Outro"};

		
		JComboBox comboBoxSexo = new JComboBox(sexo);
		comboBoxSexo.setSelectedIndex(0);
		comboBoxSexo.setBounds(79, 178, 130, 27);
		contentPane.add(comboBoxSexo);
		
		JComboBox comboBoxEstadoCivil = new JComboBox(estadoCivil);
		comboBoxEstadoCivil.setSelectedIndex(0);
		comboBoxEstadoCivil.setBounds(314, 178, 130, 27);
		contentPane.add(comboBoxEstadoCivil);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco endereco = new Endereco(textFieldEndereco.getText(), 
						Integer.parseInt(textFieldNumero.getText()), textFieldComplemento.getText(), 
						textFieldCep.getText(), textFieldBairro.getText(), textFieldCidade.getText());
				
				ArrayList<String> telefones = new ArrayList<>();
				telefones.add(textFieldTelefone1.getText());
				telefones.add(textFieldTelefone2.getText());
				
				Cliente cliente = new Cliente(textFieldCPF.getText(), textFieldNome.getText(), endereco, 
						telefones, textFieldEmail.getText(), comboBoxSexo.getSelectedItem().toString(), 
						comboBoxEstadoCivil.getSelectedItem().toString(), textFieldProfissao.getText());
			}
		});
		btnSalvar.setBounds(155, 242, 117, 29);
		contentPane.add(btnSalvar);
		
		JLabel lblProfissao = new JLabel("Profissão:");
		lblProfissao.setBounds(6, 214, 76, 16);
		contentPane.add(lblProfissao);
		
		textFieldProfissao = new JTextField();
		textFieldProfissao.setBounds(79, 209, 365, 26);
		contentPane.add(textFieldProfissao);
		textFieldProfissao.setColumns(10);
		
		JLabel lblNumero = new JLabel("Nº:");
		lblNumero.setBounds(338, 38, 25, 16);
		contentPane.add(lblNumero);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(375, 33, 69, 26);
		contentPane.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(6, 66, 76, 16);
		contentPane.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(6, 93, 61, 16);
		contentPane.add(lblBairro);
		
		textFieldCep = new JTextField();
		textFieldCep.setBounds(79, 61, 130, 26);
		contentPane.add(textFieldCep);
		textFieldCep.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(79, 88, 130, 26);
		contentPane.add(textFieldBairro);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(221, 66, 100, 16);
		contentPane.add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(221, 93, 61, 16);
		contentPane.add(lblCidade);
		
		textFieldComplemento = new JTextField();
		textFieldComplemento.setColumns(10);
		textFieldComplemento.setBounds(314, 61, 130, 26);
		contentPane.add(textFieldComplemento);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(314, 88, 130, 26);
		contentPane.add(textFieldCidade);
	}
}
