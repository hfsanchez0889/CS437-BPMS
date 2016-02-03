package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Sport;
import model.Team;

@WebServlet("/TeamSelection")
public class TeamSelection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TeamSelection() {
        super();
    }

	private Sport getEach( int id )
    {
        @SuppressWarnings("unchecked")
		List<Sport> sports = (List<Sport>) getServletContext().getAttribute(
            "sports" );

        for( Sport each : sports )
            if( each.getId()==( id ) ) 
            	return each;

        return null;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ServletContext context = getServletContext(); 
    	
        int sportId = Integer.parseInt(request.getParameter( "sportId" ));
        Sport sport = getEach(sportId);
        
        List<Team> teams = sport.getTeams();
        context.setAttribute("teams", teams); 

        request.getRequestDispatcher("/WEB-INF/purchase.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teamId = Integer.valueOf( request.getParameter( "teamId" ) );
		response.sendRedirect( "purchase?teamId="+teamId );  
	}

}
