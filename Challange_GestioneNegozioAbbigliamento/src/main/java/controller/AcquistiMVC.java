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
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;

@WebServlet("/acquisti")
public class AcquistiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Negozio negozio;
    
    public AcquistiMVC() {
       this.negozio = new Negozio(); 
    }
    
//    JSONArray collezione;
//	
//	if(request.getParameter("cantante") != null) {
//		collezione = new JSONArray(this.jukebox.tutteLeCanzoni().stream()
//						.filter(c -> c.getCantante().getNome().contains(request.getParameter("cantante")))
//						.collect(Collectors.toList())
//						);
//	} else {
//		List<String> cantanti = this.jukebox.tutteLeCanzoni().stream()
//						.map(c -> c.getCantante().getNome())
//						.sorted()
//						.distinct()//elimina duplicati
//						.collect(Collectors.toList()
//						);
//		
//		collezione = new JSONArray(cantanti);
//	}
//	
//	
//	response.setContentType("application/json");
//	response.getWriter().append(collezione.toString());

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			List<Acquisto> a = negozio.getAcquistiFromCliente(negozio.getClienti().get(0));
//			a.forEach(b -> System.out.println(b));
//			
//			List<Cliente> c = negozio.getClientiFromDate(LocalDate.parse("2022-02-14"));
//			c.forEach(d -> System.out.println(d));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		if(request.getParameter("cliente") != null) {
			try {
				int clienteID = Integer.parseInt(request.getParameter("cliente"));
				Cliente c = negozio.getClienteById(clienteID);
				List<Acquisto> a = negozio.getAcquistiFromCliente(c);
				request.setAttribute("acquisti", a);
				request.getRequestDispatcher("acquistiFromCliente.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("acquisti", this.negozio.getAcquisti());
			request.getRequestDispatcher("acquisti.jsp").forward(request, response);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
