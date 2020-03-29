package br.com.treinaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/paginas/FormularioMensagem.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeUsuario = req.getParameter("nomeUsuario");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do usuário</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("			<p>Olá, " + nomeUsuario + "!</p>");
		out.println("	</body");
		out.println("/html>");
	}
}
