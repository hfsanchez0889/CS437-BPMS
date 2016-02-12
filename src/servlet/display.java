package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Card;
import model.Team;


@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	List<Card> winingCards= new ArrayList<Card>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.getRequestDispatcher( "/WEB-INF/display.jsp" ).forward(
		         request, response );
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
		
		
		
		
	}

}
