package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAO;
import Model.Conta;

@WebServlet(urlPatterns = {"/cadastrar", "/deletar", "/editar", "/logar", "/sair"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    DAO dao;
    Conta conta;

    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/cadastrar":
				cadastrarConta(request, response);
				break;
//			case "/deletar":
//				deletarConta(request, response);
//				break;
//			case "/editar":
//				editarConta(request, response);
//				break;
			case "/logar":
				logarNaConta(request, response);
				break;
//			case "/sair":
//				sairDaConta(request, response);
//				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void cadastrarConta(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		dao = new DAO();
		dao.testeConexao();
		
		conta = new Conta();
		
		conta.setNomeDaEmpresa(request.getParameter("nomeDaEmpresa"));
		conta.setNomeDeUsuario(request.getParameter("nomeDeUsuario"));
		conta.setEmail(request.getParameter("email"));
		conta.setSenha(request.getParameter("senha"));
		conta.setEndDaEmpresa(request.getParameter("endDaEmpresa"));
		conta.setCep(request.getParameter("cep"));
		conta.setCnpj(request.getParameter("cnpj"));
		conta.setPais(request.getParameter("pais"));
		conta.setEstado(request.getParameter("estado"));
		dao.inserirConta(conta);
		response.sendRedirect("index.jsp");
	}
	
	private void logarNaConta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		dao = new DAO();
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Conta loginConta = dao.logarNaConta(email,senha);
		request.setAttribute("loginConta", loginConta);
		if (loginConta.isValido() == true) { 
			HttpSession session = request.getSession(true);	    
			session.setAttribute("currentSessionUser",email);   
			RequestDispatcher dispatcher = request.getRequestDispatcher("afterLogin/inicial.jsp");
			dispatcher.forward(request, response);
		}else if(loginConta.isValido() == false) {
			response.sendRedirect("index.jsp");
			
		}
	}
	
//	private void sairDaConta(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void editarConta(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		//int id = Integer.parseInt(request.getParameter("id"));
//		String nomeDeUsuario = request.getParameter("nomeDeUsuario");
//		String email = request.getParameter("email");
//		String senha = request.getParameter("senha");
//		String nomeDaEmpresa  = request.getParameter("nomeDaEmpresa");
//		String cep  = request.getParameter("cep");
//		String cnpj  = request.getParameter("cnpj");
//
//		
//		Conta newUp = new Conta(nomeDeUsuario, email, senha, nomeDaEmpresa, cep, cnpj);
//		contaDAO.updateConta(newUp);
//		response.sendRedirect("list");
//	}
//
//	private void deletarConta(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		contaDAO.deleteConta(id);
//		response.sendRedirect("list");
//	}
	
	
}