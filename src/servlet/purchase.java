package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Card;
import model.Team;

@WebServlet("/purchase")
public class purchase extends javax.servlet.http.HttpServlet implements
    javax.servlet.Servlet {

    private static final long serialVersionUID = 1L;

    public purchase()
    {
        super();
    }
    public static int countTeam=20;
    public static int countCard=200;
    public static int countSection=20;
    
    @SuppressWarnings("unused")
	private Team getEach( int id )
    {
        @SuppressWarnings("unchecked")
		List<Team> teams = (List<Team>) getServletContext().getAttribute(
            "teams" );

        for( Team each : teams )
            if( each.getId()==( id ) ) 
            	return each;

        return null;
    }
    
    protected void doGet( HttpServletRequest request,
        HttpServletResponse response ) throws ServletException, IOException
    {
    	ServletContext context = getServletContext();

    	List<Card> allCards = (List<Card>) context.getAttribute("allCards"); 
    	
        int teamId = Integer.parseInt(request.getParameter( "teamId" ));
        Team team = getEach(teamId);
        List<Card> cards = team.getCards();
        Collections.shuffle(cards);
        Random r = new Random();
        int randomSection = r.nextInt(20);//0~19 including
        
        List<Card> winingCards= new ArrayList<Card>();

        for(int i=0;i<countCard/countSection;i++){
        	if(cards.contains( allCards.get(randomSection*countCard/countSection+i) )){  
        		winingCards.add(allCards.get(randomSection*countCard/countSection+i));
        	}
        }
        context.setAttribute("winingCards", winingCards); 
        request.getRequestDispatcher("/WEB-INF/display.jsp").forward(request, response);  
    }

    protected void doPost( HttpServletRequest request,
        HttpServletResponse response ) throws ServletException, IOException
    {
        doGet( request, response );
//        List<GuestBookEntry> entries = (List<GuestBookEntry>) getServletContext()
//                .getAttribute( "entries" );
//
//            String name = request.getParameter( "name" );
//            if( name == null )
//                name = (String) request.getSession().getAttribute( "name" );
//            else
//                request.getSession().setAttribute( "name", name );
//
//            entries
//                .add( new GuestBookEntry( name, request.getParameter( "comment" ) ) );
//
//            response.sendRedirect( "GuestBook" );
    }

}
