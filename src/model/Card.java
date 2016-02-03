package model;

public class Card {
	
	private int id;
	private String name;
	private String sport;
	private int teamId;
	private double price;
	
	private Card(int id,String name,String sport,int teamId, double price){
		this.id=id;
		this.name=name;
		this.sport=sport;
		this.teamId=teamId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	
}
