package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.model.DBConexao;

public class Login extends JFrame {
	private Connection conexao= null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;

	private Main main ;

	private JPanel contentPane;
	private JPasswordField tfSenha;
	private JTextField tfUsuario;


	/**
	 * Launch the application.
	 */

	public void logar(){

		String sql = "SELECT *FROM admin where usuario = ? and senha = ?";
		try {

			pstm = conexao.prepareStatement(sql);
			pstm.setString(1, tfUsuario.getText());
			pstm.setString(2, tfSenha.getText());

			// Executa a query
			rs = pstm.executeQuery();

			if (rs.next()) {

				String usuario = rs.getString(2);


				main = new Main();
				main.setVisible(true);
				main.lblNewLabel.setText(usuario);
				this.dispose();

				conexao.close();
			} else {
				JOptionPane.showMessageDialog(null, "Usu�rio n�o cadastrado!!!");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}



	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

	/**
	 * Create the frame.
	 */
	public Login() {

		conexao = DBConexao.conector();




		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(90, 115, 46, 14);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(90, 171, 46, 14);
		contentPane.add(lblSenha);

		tfSenha = new JPasswordField();
		tfSenha.setBounds(137, 165, 158, 23);
		contentPane.add(tfSenha);

		tfUsuario = new JTextField();
		tfUsuario.setBounds(137, 109, 158, 23);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(175, 209, 89, 23);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

					logar();
			}
		});
		contentPane.add(btnEntrar);
	}
}
