package week06;

import java.util.ArrayList;
import java.util.List;

public class Player extends Deck {

	private	List<Card> hand = new ArrayList<Card>();

	public static int Score(int score) {
		score = 0;
		return score;
	}
	
	private String firstName;
	private String lastName;
	
	public String Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	
	
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	} 
	
	



  public void describe() {
	System.out.println("Hi. My name is " + Name());}
	
  

	public void flip(List<Card> hand) {
	hand.get(0);}


	public void draw(Deck deck) {
		Card card = this.cards.remove(0);
		hand.add(this.cards.remove(0));}


	public int incrementScore(int score) {
		return score + 1;}

}
