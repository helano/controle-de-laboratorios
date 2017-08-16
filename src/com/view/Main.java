package com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {
	CadastrarChave cadChave;
	CadastrarDataShow cadDataShow;
	public VerificarDataDS vrDataDS;
	public VerificarDataC vrDataChave;
	public EmprestarChave empChave;
	public EmprestarDataShow empDataShow;
	public static JLabel lblNewLabel;
	public VerificarDataDS verificarData;
	public JDesktopPane desktopPane;
	JMenuItem btMenuCadastrarChave;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	 JButton btnAuditrio;

	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

	public Main() {


		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 700 );
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		desktopPane = new JDesktopPane();
		desktopPane.setBounds(22, 132, 951, 528);
		contentPane.add(desktopPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 994, 35);
		contentPane.add(menuBar);

		JMenu mnEmprestar = new JMenu("Emprestar");
		menuBar.add(mnEmprestar);

		JMenuItem mntmChave = new JMenuItem("Chave");
		mntmChave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnEmprestar.add(mntmChave);

		JMenuItem mntmDataShow = new JMenuItem("Data show");
		mntmDataShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnEmprestar.add(mntmDataShow);

		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);

		JMenuItem btMenuCadastrarDataShow = new JMenuItem("DataShow");
		btMenuCadastrarDataShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cadDataShow = new CadastrarDataShow();
		 		cadDataShow.setVisible(true);
				desktopPane.setLocation(22, 132);
				desktopPane.add(cadDataShow);
				cadChave.dispose();
				btMenuCadastrarDataShow.setEnabled(false);
				btMenuCadastrarChave.setEnabled(true);


			}
		});
		mnCadastrar.add(btMenuCadastrarDataShow);

		 btMenuCadastrarChave = new JMenuItem("Chave");
		btMenuCadastrarChave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadChave = new CadastrarChave();
		 		cadChave.setVisible(true);
				desktopPane.setLocation(22, 132);
				desktopPane.add(cadChave);
				cadDataShow.dispose();
				btMenuCadastrarChave.setEnabled(false);
				btMenuCadastrarDataShow.setEnabled(true);
			}
		});
		mnCadastrar.add(btMenuCadastrarChave);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(782, 46, 69, 14);
		contentPane.add(lblUsurio);

		 lblNewLabel = new JLabel("New label");
		 lblNewLabel.setBounds(861, 46, 102, 14);
		 lblNewLabel.setForeground(Color.red);
		 contentPane.add(lblNewLabel);

		 JLabel lblVerificarHorariosDiponiveis = new JLabel("Verificar disponibilidade de data");
		 lblVerificarHorariosDiponiveis.setBounds(22, 46, 189, 16);
		 contentPane.add(lblVerificarHorariosDiponiveis);

		 JLabel lblDia = new JLabel("DIA");
		 lblDia.setBounds(22, 74, 55, 16);
		 contentPane.add(lblDia);

		 JLabel lblHora = new JLabel("HORA");
		 lblHora.setBounds(22, 100, 55, 16);
		 contentPane.add(lblHora);

		 textField = new JTextField();
		 textField.setBounds(71, 68, 189, 28);
		 contentPane.add(textField);
		 textField.setColumns(10);

		 textField_1 = new JTextField();
		 textField_1.setColumns(10);
		 textField_1.setBounds(71, 94, 189, 28);
		 contentPane.add(textField_1);

		 JButton btnDataShow = new JButton("DATA SHOW");
		 btnDataShow.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		empDataShow = new EmprestarDataShow();
		 		empDataShow.setVisible(true);
				desktopPane.setLocation(22, 132);
				desktopPane.add(empDataShow);
				btnAuditrio.setEnabled(true);
				btnDataShow.setEnabled(false);

				if (empChave.isClosed()){

				}else{
					empChave.dispose();
				}

		 	}
		 });
		 btnDataShow.setBounds(294, 68, 123, 28);
		 contentPane.add(btnDataShow);

		 btnAuditrio = new JButton("AUDIT\u00D3RIO");
		 btnAuditrio.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		empChave = new EmprestarChave();
		 		empChave.setVisible(true);
				desktopPane.setLocation(22, 132);
				desktopPane.add(empChave);
				btnAuditrio.setEnabled(false);
				btnDataShow.setEnabled(true);
				if(empDataShow.isClosed()){

				}else{
				empDataShow.dispose();
		 	}}
		 });
		 btnAuditrio.setBounds(294, 94, 123, 28);
		 contentPane.add(btnAuditrio);
	}
}
