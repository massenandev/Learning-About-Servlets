package br.com.treinaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EscrevaSeuNomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do usuário</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<form action=\"/tw-agenda-servlets/receberMensagem\">");
		out.println("			<p>Digite seu nome: </p>");
		out.println("			<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println("			<p><button type=\"submit\">Enviar</button></p>");
		out.println("	</body");
		out.println("/html>");
	}
}
