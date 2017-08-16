package com.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.model.DBConexao;
import com.model.DataShow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastrarDataShow extends JInternalFrame {

	private DataShow[] dataShow ;
	private Connection conexao = null;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JTextField tfCodigo;
	PreparedStatement pstm ;


	ResultSet rs = null;
	ResultSet aux = null;

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarDataShow frame = new CadastrarDataShow();
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
	public CadastrarDataShow() {
		conexao = DBConexao.conector();

		//String sql = "INSERT INTO  datashow where usuario = ? and senha = ?";
/*try {
		String sql = "SELECT COUNT(idDataShow)FROM datashow";
		 pstm = conexao.prepareStatement(sql);
		aux = pstm.executeQuery(sql);



}catch(Exception e ){
	JOptionPane.showMessageDialog(null, e);


}
*/

		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(0, 0, 951, 528);
		getContentPane().setLayout(null);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(53, 210, 89, 30);
		getContentPane().add(btnCancelar);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "INSERT INTO datashow (Marca, Modelo, CodigoInstitucional) VALUES (?, ?, ?)";


				try {

					 pstm = conexao.prepareStatement(sql);
					pstm.setString(1,tfMarca.getText() );
					pstm.setString(2, tfModelo.getText());
					pstm.setString(3, tfCodigo.getText());

					 if (tfMarca.getText().isEmpty() || tfModelo.getText().isEmpty() || tfCodigo.getText().isEmpty()){

						 JOptionPane.showMessageDialog(null, "preencha os dados obrigatorios");


				}else {

					int aux = pstm.executeUpdate();
					if (aux > 0 ){
						JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
						tfModelo.setText(null);
						tfMarca.setText(null);
						tfCodigo.setText(null);

					}
				}




				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}

			}
		});
		btnCadastrar.setBounds(164, 211, 103, 28);
		getContentPane().add(btnCadastrar);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cadastro Data Show", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 6, 349, 255);
		getContentPane().add(panel);
		panel.setLayout(null);

				JLabel lblCodigoInstitucional = new JLabel("CODIGO INSTITUCIONAL");
				lblCodigoInstitucional.setBounds(17, 148, 149, 14);
				panel.add(lblCodigoInstitucional);

						tfCodigo = new JTextField();
						tfCodigo.setBounds(183, 141, 158, 28);
						panel.add(tfCodigo);
						tfCodigo.setColumns(10);

								tfModelo = new JTextField();
								tfModelo.setBounds(183, 101, 158, 28);
								panel.add(tfModelo);
								tfModelo.setColumns(10);

										tfMarca = new JTextField();
										tfMarca.setBounds(183, 51, 158, 28);
										panel.add(tfMarca);
										tfMarca.setColumns(10);

												JLabel lblMarca = new JLabel("MARCA");
												lblMarca.setBounds(114, 58, 46, 14);
												panel.add(lblMarca);

														JLabel lblModelo = new JLabel("MODELO");
														lblModelo.setBounds(105, 108, 66, 14);
														panel.add(lblModelo);

														JPanel panel_1 = new JPanel();
														panel_1.setBorder(new TitledBorder(null, "Lista de Data Shows", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
														panel_1.setBounds(367, 6, 566, 485);
														getContentPane().add(panel_1);
														panel_1.setLayout(null);

														JPanel panel_2 = new JPanel();
														panel_2.setBorder(new TitledBorder(null, "Tabela", TitledBorder.LEADING, TitledBorder.TOP, null, null));
														panel_2.setBounds(25, 66, 517, 398);
														panel_1.add(panel_2);
														panel_2.setLayout(null);

														table = new JTable();
														table.setShowVerticalLines(true);
														table.setModel(new DefaultTableModel(
															new Object[][] {
															},
															new String[] {
																"MARCA", "MODELO", "CODIGO INSTITUCIONAL"
															}
														));


														/*  String[] tableColumnsName = {"MARCA", "MODELO", "CODIGO INSTITUCIONAL"};
															DefaultTableModel aModel = (DefaultTableModel) table.getModel();
															aModel.setColumnIdentifiers(tableColumnsName); // query

															Statement pstn = null;

															try {
															ResultSet rs = pstn.executeQuery("SELECT   Marca, Modelo, CodigoInstitucional from datashow");

															// Loop com o ResultSet transferindo os dados para o modelo
															java.sql.ResultSetMetaData rsmd = rs.getMetaData();
															int colNo = rsmd.getColumnCount();
															while(rs.next()){
															Object[] objects = new Object[colNo];
															for(int i = 0; i < colNo; i++) {
															  objects[i] = rs.getObject(i+1);
															  }
															aModel.addRow(objects);
															}
															table.setModel(aModel);

														}
															catch(Exception e1){
																JOptionPane.showMessageDialog(null, e1);
															}*/

														table.setBounds(19, 89, 478, 291);
														panel_2.add(table);



		}


}

