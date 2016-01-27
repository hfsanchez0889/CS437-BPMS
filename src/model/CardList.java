package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardList {
	private List<Card> cardList;
	
	public CardList(){
		this.cardList = new ArrayList<Card>();
	}

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}
//	THIS FUNCTION ADDS A CARD TO THE LIST
	public void addCardToList(Card newCard){
		this.cardList.add(newCard);
	}
//	THIS FUNCTION REMOVED THE LAST CARD FROM THE LIST AND SENDS TO CALLER
	public Card pullCardFromList(){
		Card c = this.cardList.remove(this.cardList.size() - 1);
		return c;
	}
//	THIS FUNCTION SHUFFLES THE LIST
	public void shuffleList(){
		Collections.shuffle(this.cardList);
	}
}
