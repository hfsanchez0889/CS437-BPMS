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

import model.Sport;
import model.Team;

@WebServlet("/TeamSelection")
public class TeamSelection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TeamSelection() {
        super();
    }
    public static int countSports=5;
    
    
    List<Sport> allSports = new ArrayList<Sport>();
    List<Team> sport1Teams = new ArrayList<Team>();
    
    public void init() throws ServletException {
    	super.init();
        ServletContext context = getServletContext(); 
        
        Team team1 = new Team(1,"clevelandindians",null);
        Team team2 = new Team(2,"chicagocubs",null);
        Team team3 = new Team(3,"chicagowhitesox",null);
        Team team4 = new Team(4,"losangelesdodgers",null);
        Team team5 = new Team(5,"newYorkYankees",null);
        sport1Teams.add(team1);
        sport1Teams.add(team2);
        sport1Teams.add(team3);
        sport1Teams.add(team4);
        sport1Teams.add(team5);
        
        
        context.setAttribute("selectableTeams", sport1Teams); 
        
        
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
    	
    	List<Sport> allSports = (List<Sport>) context.getAttribute("allSports");  
    	
    	
        int sportId = Integer.parseInt(request.getParameter( "sportId" ));
        Sport sport = getEach(sportId);
        List<Team> teams = sport.getTeams();
        
       

        request.getRequestDispatcher("/WEB-INF/purchase.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teamId = Integer.valueOf( request.getParameter( "teamId" ) );
		response.sendRedirect( "purchase?teamId="+teamId );  
	}

}
