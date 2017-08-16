package com.view;

import java.awt.EventQueue;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class EmprestarDataShow extends JInternalFrame {
	Date data;
	JLabel lblHoraDeEmprestimo ;
	JLabel lbHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmprestarDataShow frame = new EmprestarDataShow();
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
	public EmprestarDataShow() {
		setBounds(22, 132, 951, 528);
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);

		setBounds(0, 0, 951, 528);
		getContentPane().setLayout(null);

		JLabel lblServidor = new JLabel("Servidor");
		lblServidor.setBounds(66, 105, 59, 26);
		getContentPane().add(lblServidor);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(138, 102, 249, 29);
		getContentPane().add(comboBox);

		JLabel lblDataDeEmprestimo = new JLabel("Data de Emprestimo");
		lblDataDeEmprestimo.setBounds(31, 260, 139, 26);
		getContentPane().add(lblDataDeEmprestimo);

		JLabel lbDia = new JLabel("dia");
		lbDia.setBounds(196, 265, 55, 16);
		getContentPane().add(lbDia);

		JLabel lbMes = new JLabel("m\u00EAs");
		lbMes.setBounds(235, 265, 55, 16);
		getContentPane().add(lbMes);

		JLabel lbAno = new JLabel("Ano");
		lbAno.setHorizontalAlignment(SwingConstants.LEFT);
		lbAno.setBounds(276, 265, 55, 16);
		getContentPane().add(lbAno);

		JLabel label = new JLabel("/");
		label.setBounds(220, 265, 13, 16);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("/");
		label_1.setBounds(262, 265, 13, 16);
		getContentPane().add(label_1);

	 lblHoraDeEmprestimo = new JLabel("Hora de Emprestimo");
		lblHoraDeEmprestimo.setBounds(31, 304, 139, 26);
		getContentPane().add(lblHoraDeEmprestimo);

		 lbHora = new JLabel("New label");
		lbHora.setBounds(196, 309, 55, 16);
		data = new Date ();


		getContentPane().add(lbHora);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(513, 435, 90, 28);
		getContentPane().add(btnCancelar);

		JButton btnEmprestar = new JButton("Emprestar");
		btnEmprestar.setBounds(617, 435, 90, 28);
		getContentPane().add(btnEmprestar);

		JLabel lblDataShow = new JLabel("DATA SHOW");
		lblDataShow.setForeground(Color.RED);
		lblDataShow.setBounds(508, 43, 70, 14);
		getContentPane().add(lblDataShow);



	}

}
