package com.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class CadastrarServidor extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarServidor frame = new CadastrarServidor();
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
	public CadastrarServidor() {
		setBounds(0, 0, 951, 528);

	}

}
