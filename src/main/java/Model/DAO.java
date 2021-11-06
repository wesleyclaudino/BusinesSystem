package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private static final String INSERT_USERS_SQL = "insert into usuarios (nomeDaEmpresa,nomeDeUsuario,email,endDaEmpresa,cep,cnpj,pais,estado,senha) values (?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_USERS_SQL = "delete from usuarios where id = ?;";
	private static final String UPDATE_USERS_SQL = "update usuarios set email= ?, senha =? where id = ?;";
	private static final String LOGIN_USER = "select * from usuarios where email=? and senha=?";

	private String driver = "com.mysql.cj.jdbc.Driver";

	private String url = "jdbc:mysql://127.0.0.1:3306/cadastro?useTimezone=true&serverTimezone=UTC";

	private String user = "root";

	private String password = "";

	private Connection conectar() {
		try {
			Connection con = null;
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void inserirConta(Conta conta) {		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(INSERT_USERS_SQL);
			pst.setString(1, conta.getNomeDaEmpresa());
			pst.setString(2, conta.getNomeDeUsuario());
			pst.setString(3, conta.getEmail());
			pst.setString(4, conta.getEndDaEmpresa());
			pst.setString(5, conta.getCep());
			pst.setString(6, conta.getCnpj());
			pst.setString(7, conta.getPais());
			pst.setString(8, conta.getEstado());
			pst.setString(9, conta.getSenha());
			pst.executeUpdate();
			con.close();
			} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public Conta logarNaConta(String email,String senha) {
		Conta conta = null;
		
		try (Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement preparedStatement = con.prepareStatement(LOGIN_USER);) {
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, senha);
			ResultSet rs = preparedStatement.executeQuery();
		    boolean more = rs.next();
		    
		    if (!more) {
		    	conta = new Conta();
		    	conta.setValido(false);
		    } else if (more) {
		        String nomeDeUsuario2 = rs.getString("nomeDeUsuario");
		        String senha2 = rs.getString("senha");
		        conta = new Conta(nomeDeUsuario2, senha2);
		        conta.setValido(true);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conta;
	}

//	public void selecionarContato(Conta contato) {
//		String read2 = "select * from testando where nome = ?";
//		try {
//			Connection con = conectar();
//			PreparedStatement pst = con.prepareStatement(read2);
//			pst.setString(1, contato.getNome());
//			ResultSet rs = pst.executeQuery();
//			while (rs.next()) {
//				contato.setNome(rs.getString(1));
//				contato.setSenha(rs.getString(2));
//			}
//			con.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	public void alterarContato(Conta contato) {
//		String update = "update testando set nome=?,senha=?";
//		try {
//			Connection con = conectar();
//			PreparedStatement pst = con.prepareStatement(update);
//			pst.setString(1, contato.getNome());
//			pst.setString(2, contato.getSenha());
//			pst.executeUpdate();
//			con.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	public void deletarContato(Conta contato) {
//		String delete = "delete from testando where nome=?";
//		try {
//			Connection con = conectar();
//			PreparedStatement pst = con.prepareStatement(delete);
//			pst.setString(1, contato.getNome());
//			pst.executeUpdate();
//			con.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
}