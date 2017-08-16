package com.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VerificarDataDS extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificarDataDS frame = new VerificarDataDS();
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
	public VerificarDataDS() {
		setBounds(100, 100, 380, 267);
		getContentPane().setLayout(null);

		JLabel lblDia = new JLabel("DIA");
		lblDia.setBounds(52, 50, 38, 21);
		getContentPane().add(lblDia);

		JLabel lblHora = new JLabel("HORA");
		lblHora.setBounds(52, 120, 46, 14);
		getContentPane().add(lblHora);

		textField = new JTextField();
		textField.setBounds(93, 41, 214, 39);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 108, 214, 39);
		getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(217, 185, 90, 28);
		getContentPane().add(btnNewButton);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(103, 185, 97, 28);
		getContentPane().add(btnCancelar);

		JLabel lblInserirDataPara = new JLabel("Inserir data para reserva de dataShow");
		lblInserirDataPara.setForeground(Color.RED);
		lblInserirDataPara.setBounds(75, 6, 339, 16);
		getContentPane().add(lblInserirDataPara);


	}
}
