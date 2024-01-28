package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Deck deck = new Deck();

		deck.shuffle();
		
		
		List<String> player1 = new ArrayList<>();
		List<String> player2 = new ArrayList<>();
		
		
		for(int i = 0; i< deck.size(); i++) {if(i % 2 == 0) {
				player1.add(deck.get(i));}
		else {player2.add(deck.get(i));}}
		
		
		for(int i = 0; i <= 52; i++) {deck.draw();}
		for(int i = 0; i <=26; i++) {deck.flip();}
		
		if(player1.flip() > player2.flip()) {
			player1.add(player2.flip()); player1.incrementScore();}
		else if(player1.flip() < player2.flip()) {
			player2.add(player1.flip()); player2.incrementScore();
		}
		else if(player1.flip() == player2.flip) {
			player1.add(player1.flip()); player2.add(player2.flip());
			System.out.println("No point was awarded.");}}

	
	System.out.println(player1.score());
	System.out.println(player2.score());
	
if(player1.score() > player2.score()) {System.out.println("Player 1");}
else if(player1.score() < player2.score()) {System.out.println("Player 2");}
else if(player1.score() == player2.score()) {System.out.println("Draw");}















}
