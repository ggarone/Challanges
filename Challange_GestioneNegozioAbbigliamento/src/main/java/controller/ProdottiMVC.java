package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Prodotto;

import java.io.IOException;

@WebServlet("/prodotti")
public class ProdottiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Negozio negozio;
    
    public ProdottiMVC() {
       this.negozio = new Negozio(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		StringBuilder sb = new StringBuilder();
//		for (Prodotto p : negozio.getProdotti()) {
//			sb.append(p);
//		}
//		response.getWriter().append(sb.toString());
		
		request.setAttribute("prodotti", negozio.getProdotti());
		request.getRequestDispatcher("prodotti.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
