package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
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

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		doGet(request, response);
//    	ServletContext context = getServletContext();
//    	List<Card> winingCards = (List<Card>) context.getAttribute("winingCards");
//		 JFrame parent = new JFrame();
//		 double total = 0;
//		for(Card s: winingCards){
//		
//			 total = s.getPrice();
//			
//	    }
//			
//		 JOptionPane.showMessageDialog(parent, "You Cashed Out with: "+total);
//		 request.getRequestDispatcher( "/homepage.html" ).forward(
//		         request, response );
//		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
    	ServletContext context = getServletContext(); 

			 JFrame parent = new JFrame();
			 double sumTotal = 0;
			 
			String[] items =request.getParameterValues("cardvalue");
			if(items==null){
				 JOptionPane.showMessageDialog(parent, "You selected nothing");
				
			}
			else{
				for(String item : items){					
					sumTotal += Double.parseDouble(item);					
			    }
		        context.setAttribute("sumTotal", sumTotal); 
		        request.getRequestDispatcher("/WEB-INF/CashOut2.jsp").forward(request, response);		        
//				JOptionPane.showMessageDialog(parent, "You Cashed Out with: "+sumTotal+"$");				 
//				JOptionPane.showMessageDialog(parent, "You already sold that card");			
			}
			
	}
}

