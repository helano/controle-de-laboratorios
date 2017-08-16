package com.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.model.Chave;
import com.model.DBConexao;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class CadastrarChave extends JInternalFrame {
	private JTextField tfNumero;
	private JTextField tfBloco;
	private Connection conexao = null;
	private Chave chave;
	PreparedStatement pstm ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarChave frame = new CadastrarChave();
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
	public CadastrarChave() {
		 conexao = DBConexao.conector();
		 chave = new Chave ();
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(0, 0, 951, 528);
		getContentPane().setLayout(null);

		JLabel lblMarca = new JLabel("NOME DA SALA");
		lblMarca.setBounds(97, 97, 89, 14);
		getContentPane().add(lblMarca);

		JTextField tfNomeSala = new JTextField();
		tfNomeSala.setBounds(206, 86, 158, 28);
		getContentPane().add(tfNomeSala);
		tfNomeSala.setColumns(10);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(123, 290, 89, 23);
		getContentPane().add(btnCancelar);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql = "INSERT INTO chave (nomeSala, bloco, numero) VALUES (?, ?, ?)";


				try {

					 pstm = conexao.prepareStatement(sql);
					pstm.setString(1, tfNomeSala.getText() );
					pstm.setString(2, tfBloco.getText());

					pstm.setString(3, tfNumero.getText());

					 if (tfNomeSala.getText().isEmpty() || tfBloco.getText().isEmpty() || tfNumero.getText().isEmpty()){

						 JOptionPane.showMessageDialog(null, "preencha os dados obrigatorios");


				}else {

					int aux = pstm.executeUpdate();
					if (aux > 0 ){
						JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
						tfNomeSala.setText(null);
						tfBloco.setText(null);
						tfNumero.setText(null);

					}
				}




				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnCadastrar.setBounds(238, 291, 103, 20);
		getContentPane().add(btnCadastrar);

		JLabel lblCadastrarChave = new JLabel("CADASTRAR CHAVE");
		lblCadastrarChave.setBounds(179, 11, 122, 14);
		getContentPane().add(lblCadastrarChave);

		JLabel lblNumeo = new JLabel("NUMERO");
		lblNumeo.setBounds(97, 137, 81, 14);
		getContentPane().add(lblNumeo);

		JLabel lblBloco = new JLabel("BLOCO");
		lblBloco.setBounds(97, 172, 81, 14);
		getContentPane().add(lblBloco);

		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		tfNumero.setBounds(206, 127, 158, 27);
		getContentPane().add(tfNumero);

		tfBloco = new JTextField();
		tfBloco.setColumns(10);
		tfBloco.setBounds(206, 165, 158, 28);
		getContentPane().add(tfBloco);
	}

}
