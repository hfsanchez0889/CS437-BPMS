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

@WebServlet("/Purchase")
public class purchase extends javax.servlet.http.HttpServlet implements
    javax.servlet.Servlet {

    private static final long serialVersionUID = 1L;

    public purchase()
    {
        super();
    }
    public static int countTeam=5;
    public static int countCard=38;
    public static int countSection=19;
       
	List<Card>allCards = new ArrayList<Card>();
	List<Card>team1Cards = new ArrayList<Card>();
	List<Card>team2Cards = new ArrayList<Card>();
	List<Card>team3Cards = new ArrayList<Card>();
	List<Card>team4Cards = new ArrayList<Card>();
	List<Card>team5Cards = new ArrayList<Card>();
	
	List<Team>teams = new ArrayList<Team>();
    @Override
    public void init() throws ServletException {
    	super.init();
        ServletContext context = getServletContext(); 
    	
        team1Cards.add(new Card(0,"andrethornton","baseball", 1  ,10.5));
        team1Cards.add(new Card(1,"bobfeller","baseball", 1  ,9.5));
        team1Cards.add(new Card(2,"coreykluber","baseball", 1  ,8.5));
        team1Cards.add(new Card(3,"earlyWynn","baseball", 1  ,10.5));
        team1Cards.add(new Card(4,"franciscolindor","baseball", 1  ,10.5));
        team1Cards.add(new Card(5,"franciscolindorglove","baseball", 1  ,10.5));
        team1Cards.add(new Card(6,"jasonkipnis","baseball", 1  ,10.5));
        team1Cards.add(new Card(7,"joseramirez","baseball", 1  ,10.5));
        team1Cards.add(new Card(8,"omarvizquel","baseball", 1  ,10.5));
        team1Cards.add(new Card(9,"tylernaquin","baseball", 1  ,10.5));
        Team team1 = new Team(1,"clevelandindians",team1Cards);
        
        team2Cards.add(new Card(10,"addisonrussell","baseball", 2  ,10.5));
        team2Cards.add(new Card(11,"andredawson","baseball", 2  ,9.5));
        team2Cards.add(new Card(12,"davekingman","baseball", 2  ,8.5));
        team2Cards.add(new Card(13,"fergiejenkins","baseball", 2  ,10.5));
        team2Cards.add(new Card(14,"krisbryantdebut","baseball", 2  ,10.5));
        team2Cards.add(new Card(15,"krisbryant","baseball", 2  ,10.5));
        team2Cards.add(new Card(16,"kyleschwarber","baseball", 2  ,10.5));
        Team team2 = new Team(2,"chicagocubs",team2Cards);
        
        team3Cards.add(new Card(20,"andywilkins","baseball", 3  ,10.5));
        team3Cards.add(new Card(21,"chrissale","baseball", 3  ,9.5));
        team3Cards.add(new Card(22,"frankthomas","baseball", 3  ,8.5));
        team3Cards.add(new Card(23,"joejackson","baseball", 3  ,10.5));
        team3Cards.add(new Card(24,"joseabreu","baseball", 3  ,10.5));
        team3Cards.add(new Card(25,"paulkonerko","baseball", 3  ,10.5));
        team3Cards.add(new Card(26,"robertoalomar","baseball", 3  ,10.5));
        Team team3 = new Team(3,"chicagowhitesox",team3Cards);
        
        team4Cards.add(new Card(30,"puig","baseball", 4  ,10.5));
        team4Cards.add(new Card(31,"roycampanella","baseball", 4  ,9.5));
        team4Cards.add(new Card(32,"peeweereesebat","baseball", 4  ,8.5));
        team4Cards.add(new Card(33,"jocpederson","baseball",4  ,10.5));
        team4Cards.add(new Card(34,"jocpedersonbat","baseball", 4  ,10.5));
        team4Cards.add(new Card(35,"dondrysdale","baseball", 4  ,10.5));
        team4Cards.add(new Card(36,"claytonkershaw","baseball", 4  ,10.5));
        Team team4 = new Team(4,"losangelesdodgers",team4Cards);
        
        team5Cards.add(new Card(40,"aaronjudge","baseball", 5  ,10.5));
        team5Cards.add(new Card(41,"alexrodriguez","baseball", 5  ,9.5));
        team5Cards.add(new Card(42,"baberuth","baseball", 5  ,8.5));
        team5Cards.add(new Card(43,"derekjeter","baseball", 5  ,10.5));
        team5Cards.add(new Card(44,"lougehrig","baseball", 5  ,10.5));
        team5Cards.add(new Card(45,"luisseverino","baseball", 5  ,10.5));
        team5Cards.add(new Card(46,"marianorivera","baseball", 5  ,10.5));
        Team team5 = new Team(5,"newYorkYankees",team5Cards);

        
        
        allCards.addAll(team1Cards);
        allCards.addAll(team2Cards);
        allCards.addAll(team3Cards);
        allCards.addAll(team4Cards);
        allCards.addAll(team5Cards);
    	context.setAttribute("allCards", allCards);	

    	teams.add(team1);
    	teams.add(team2);
    	teams.add(team3);
    	teams.add(team4);
    	teams.add(team5);
    	context.setAttribute("teams", teams);	

    }
    
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
    	List<Team> teams = (List<Team>) context.getAttribute("teams"); 

    	
        int teamId = Integer.parseInt(request.getParameter( "teamId" ));
        Team team = getEach(teamId);
        List<Card> cards = team.getCards();
        Collections.shuffle(allCards);
        Random r = new Random();
        int randomSection = r.nextInt(countSection);//0~19 including
        
        List<Card> winingCards= new ArrayList<Card>();

        for(int i=0;i<countCard/countSection;i++){
        	for(int j=0;j<cards.size();j++){
        		if(cards.get(j).getId()==allCards.get(randomSection*countCard/countSection+i).getId()){
            		winingCards.add(allCards.get(randomSection*countCard/countSection+i));
        		}
        	}
//        	if(cards.contains( allCards.get(randomSection*countCard/countSection+i) )){  
//        		winingCards.add(allCards.get(randomSection*countCard/countSection+i));
//        	}
        }
        context.setAttribute("winingCards", winingCards); 
        request.getRequestDispatcher("/WEB-INF/display.jsp").forward(request, response);  
    }

    protected void doPost( HttpServletRequest request,
        HttpServletResponse response ) throws ServletException, IOException
    {
        doGet( request, response );
    }

}
