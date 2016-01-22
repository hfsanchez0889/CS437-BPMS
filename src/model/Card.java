package model;

public class Card {
	
	private int id;
	private String name;
	private String sport;
	private String team;
	private double price;
	private Card(int id,String name,String sport,String team, double price){
		this.id=id;
		this.name=name;
		this.sport=sport;
		this.team=team;
		this.price=price;
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
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
