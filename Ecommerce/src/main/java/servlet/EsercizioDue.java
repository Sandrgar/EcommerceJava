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

@WebServlet("/EsercizioDue")

public class EsercizioDue extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LibroService libroService = new LibroService();
		List<LibroBean> result = libroService.AutoreOrderByPubblicazione("lorim");

		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/EsercizioDue.jsp");
		rd.forward(request, response);

	}


}
