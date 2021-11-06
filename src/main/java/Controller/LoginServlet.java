package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DAO;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DAO contaDAO = new DAO();

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		if(senha.equals("senha")){
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.getRequestDispatcher("link.jsp").include(request, response);
			out.print("<h2> Bem vindo " + email + "!!!</h2>");
		} else {
			request.getRequestDispatcher("login.jsp").include(request, response);
			out.print("<h3>Desculpe, erro de nome de usuário ou senha! Tente novamente <h3>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}