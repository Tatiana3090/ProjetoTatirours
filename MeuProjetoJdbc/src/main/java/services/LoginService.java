package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoComBanco;
import model.Login;

public class LoginService {
	
	public void save() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Login login = new Login(null, null, null);
		
		System.out.println("Digite seu nome");
		login.setNome(sc.nextLine());
		System.out.println("Digite seu email");
		login.setEmail(sc.nextLine());		
		System.out.println("Digite seu telefone ");
		login.setTelefone(sc.nextInt());
		
		String sql = "INSERT INTO Login(nome, email ,telefone)VALUES(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, login.getNome());
			pstm.setString(2, login.getEmail());
			pstm.setInt(3, login.getTelefone());
			
			pstm.execute();
			
			System.out.println("Login efetuado com sucesso");
			
			conn.close();
			pstm.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
				
			}
		}
	}
