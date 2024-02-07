package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import service.LibroService;
import service.UtenteService;

@WebServlet ("/EsercizioUno")

public class EsercizioUno extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	    	UtenteService utenteService = new UtenteService();
	    	List<Map<UtenteBean, Integer>> result = utenteService.piuDiCinqueLibri();
	    	
	    	request.setAttribute("result", result);
	        RequestDispatcher rd = request.getRequestDispatcher("/EsercizioUno.jsp");
	        rd.forward(request, response);
	    }
	 }
