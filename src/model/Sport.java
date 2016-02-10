package model;

import java.util.ArrayList;
import java.util.List;

public class Sport {

	private int id;
	private String name;
	private List<Team> teams;
	
	
	private Sport(int id,String name, ArrayList<Team> teams){
		this.id = id;
		this.name = name;
		this.teams = teams;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Team> getTeams() {
		return teams;
	}
	
	public void setTeams (ArrayList<Team> teams){
		this.teams = teams;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
