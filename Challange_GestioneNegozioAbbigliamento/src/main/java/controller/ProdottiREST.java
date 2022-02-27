package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONArray;

import com.google.gson.Gson;

@WebServlet("/api/prodotti")
public class ProdottiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Negozio negozio;
    
    public ProdottiREST() {
       this.negozio = new Negozio(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray collezione;
		collezione = new JSONArray(this.negozio.getProdotti());
		
		response.setContentType("application/json");
		response.getWriter().append(collezione.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 mi faccio ritornare un buffer con la string
		BufferedReader reader = request.getReader();
		//2 creo un GSON
		Gson gson = new Gson();
		//3 riverso il buffer nel gson
//		Canzone c = gson.fromJson(reader, Canzone.class);
		//4 aggiungo la canzone al mio db attraverso il ctrl
//		this.negozio.addCanzone(c);
		// 5 chiama il metodo doGet per mostrare l'elenco di canzoni
		doGet(request, response);
	}

}
