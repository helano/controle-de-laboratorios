package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConexao {
 public static Connection conector(){
	 java.sql.Connection conexao = null;

	 String driver = "com.mysql.jdbc.Driver";

	 String url = "jdbc:mysql://localhost:3306/teste";
	 String usuario = "root";
	 String senha = "cxcc5056";

	 try{
		 Class.forName(driver);
		 conexao = DriverManager.getConnection(url, usuario, senha);
		 return conexao;

	 }catch (Exception e){
		 return null;


	 }



 }

}
