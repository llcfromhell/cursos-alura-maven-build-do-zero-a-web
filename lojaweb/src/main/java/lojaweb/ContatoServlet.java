package lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.lorenscode.Produto;

@WebServlet(urlPatterns="/contato")
public class ContatoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Produto produto = new Produto("novo", 10.0);
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html><h2>P�gina de contato</h2></html");
		
		
	}
	
}
