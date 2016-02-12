package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Card;


@WebServlet("/CashOut")
public class CashOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<Card> winingCards= new ArrayList<Card>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 request.getRequestDispatcher( "/WEB-INF/CashOut.jsp" ).forward(
		         request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String[] player =request.getParameterValues("player");
		for(String s: player){
			 JFrame parent = new JFrame();
			 int total = 0;
			 total = Integer.parseInt(total+s);
			 JOptionPane.showMessageDialog(parent, "You Cashed Out"+s);
	    }
			
			
		}
	}

