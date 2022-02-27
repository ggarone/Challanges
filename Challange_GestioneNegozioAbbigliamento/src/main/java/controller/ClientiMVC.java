package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;

@WebServlet("/clienti")
public class ClientiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Negozio negozio;
    
    public ClientiMVC() {
       this.negozio = new Negozio(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		StringBuilder sb = new StringBuilder();
//		for (Cliente c : negozio.getClienti()) {
//			sb.append(c);
//		}
//		response.getWriter().append(sb.toString());
		
		request.setAttribute("clienti", negozio.getClienti());
		request.getRequestDispatcher("clienti.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
