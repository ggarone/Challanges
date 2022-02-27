package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Acquisto;
import model.Cliente;
import model.Prodotto;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;

@WebServlet("/negozio")
public class NegozioMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Negozio negozio;
	private List<Cliente> clientiFromDateList;
    
    public NegozioMVC() {
       this.negozio = new Negozio();
       clientiFromDateList = new ArrayList<Cliente>();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("clienti", clientiFromDateList);
		request.getRequestDispatcher("negozio.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("negozio") != null) {
			String date = request.getParameter("negozio");
			String dateTemp[] = date.split("-");
			int year = Integer.parseInt(dateTemp[0]);
			int month = Integer.parseInt(dateTemp[1]);
			//add leading zeros
			String formattedMonth = String.format("%02d", month);
			date = year + "-" + formattedMonth + "-01";
			try {
				this.clientiFromDateList = this.negozio.getClientiFromDate(LocalDate.parse(date));
//				clientiFromDateList.forEach(c -> System.out.println(c));
//				request.setAttribute("clienti", clientiFromDateList);
//			request.getRequestDispatcher("negozio.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.sendRedirect("negozio.jsp");
			
//			doGet(request, response);
			
		}
		
		
	}

}
