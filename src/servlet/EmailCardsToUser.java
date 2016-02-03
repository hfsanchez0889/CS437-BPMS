package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sendgrid.*;

@WebServlet("/EmailCardsToUser")
public class EmailCardsToUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public EmailCardsToUser() {}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Served at: " + request.getContextPath());

	    try{
	    	
	    	SendGrid sendgrid = new SendGrid("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");

		    SendGrid.Email email = new SendGrid.Email();

		    email.addTo("hfsanchez89@yahoo.com");
		    email.setFrom("cs437@bpms.com");
		    email.setSubject("Email from CS437 project");
		    email.setText("Here are your cards!");
		    
	    	sendgrid.send(email);
	    	
	    }catch(Exception e){
	    		out.println(e.getMessage());
	    }
	    
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
