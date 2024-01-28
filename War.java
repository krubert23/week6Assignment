package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class War {
	
	public static void main(String[] args) {

	//Need a list for the deck of cards
List<String> deck = new ArrayList<>();

for(int i = 2; i < 15; i++) {deck.add(String.valueOf(i));}
for(int i = 2; i < 15; i++) {deck.add(String.valueOf(i));}
for(int i = 2; i < 15; i++) {deck.add(String.valueOf(i));}
for(int i = 2; i < 15; i++) {deck.add(String.valueOf(i));}

// for(int i = 0; i< deck.size(); i++) {System.out.println(deck.get(i));}

//Need to populate that list with all of the cards in the deck

Collections.shuffle(deck);

// for(int i = 0; i< deck.size(); i++) {System.out.println(deck.get(i));}
	
	//Need to shuffle the deck
	
	//Then deal the cards to 2 players
	
	//Each player will need their own list
	List<String> player1 = new ArrayList<>();
	List<String> player2 = new ArrayList<>();
	
	
	for(int i = 0; i< deck.size(); i++) {if(i % 2 == 0) {
			player1.add(String.valueOf(deck.get(i)));}
	else {player2.add(String.valueOf(deck.get(i)));}}
	
	System.out.println("Deal me in! - Player 1");
	
	for(int i = 0; i< player1.size(); i++) {System.out.print(player1.get(i) + " ");}
	System.out.println(" ");
	System.out.println("Me too! - Player 2");
	for(int i = 0; i< player2.size(); i++) {System.out.print(player2.get(i) + " ");}

	System.out.println(" ");

	
	while(player1.size() < 52 && player2.size() < 52) {
		if(Integer.parseInt(player1.get(0)) > Integer.parseInt(player2.get(0))) {
			player1.add(player1.remove(0)); player1.add(player2.remove(0));
			System.out.println(" ");
			System.out.println("Player 1: ");
			
			for(int i = 0; i< player1.size(); i++) {System.out.print(player1.get(i) + " ");}
			System.out.println(" ");
			System.out.println("Player 2:");
			for(int i = 0; i< player2.size(); i++) {System.out.print(player2.get(i) + " ");}

			System.out.println(" ");
			System.out.println(" ");
		}
		
		else if(Integer.parseInt(player1.get(0)) < Integer.parseInt(player2.get(0))) {
			player2.add(player1.remove(0)); player2.add(player2.remove(0));
			System.out.println(" ");
			System.out.println("Player 1: ");
			
			for(int i = 0; i< player1.size(); i++) {System.out.print(player1.get(i) + " ");}
			System.out.println(" ");
			System.out.println("Player 2:");
			for(int i = 0; i< player2.size(); i++) {System.out.print(player2.get(i) + " ");}

			System.out.println(" ");
			System.out.println(" ");}
		
		else if(Integer.parseInt(player1.get(0)) == Integer.parseInt(player2.get(0))) {
			if(player1.size() > 4 && player2.size() > 4) {
				if(Integer.parseInt(player1.get(4)) > Integer.parseInt(player2.get(4))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));}
			else if(Integer.parseInt(player1.get(4)) < Integer.parseInt(player2.get(4))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0));
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));}
			else if(Integer.parseInt(player1.get(4)) == Integer.parseInt(player2.get(4))) {
				if(player1.size() > 8 && player2.size() > 8) {	
				if(Integer.parseInt(player1.get(8)) > Integer.parseInt(player2.get(8))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0));
					player1.add(player1.remove(0));
					player1.add(player1.remove(0));
					player1.add(player1.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));}
				else if(Integer.parseInt(player1.get(8)) < Integer.parseInt(player2.get(8))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0));
					player2.add(player1.remove(0));
					player2.add(player1.remove(0));
					player2.add(player1.remove(0));
					player2.add(player2.remove(0));
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));}}}}
	else if(player1.size() > 4 && player2.size() > 3) {
			if(Integer.parseInt(player1.get(4)) > Integer.parseInt(player2.get(3))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) < Integer.parseInt(player2.get(3))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0));
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) == Integer.parseInt(player2.get(3))) {
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));}}
	else if(player1.size() > 4 && player2.size() > 2) {
		if(Integer.parseInt(player1.get(4)) > Integer.parseInt(player2.get(2))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) < Integer.parseInt(player2.get(2))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) == Integer.parseInt(player2.get(3))) {
			player1.add(player2.remove(0));
			player1.add(player2.remove(0));
			player1.add(player2.remove(0));}}
	else if(player1.size() > 4 && player2.size() > 1) {
		if(Integer.parseInt(player1.get(4)) > Integer.parseInt(player2.get(1))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) < Integer.parseInt(player2.get(1))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));}
		else if(Integer.parseInt(player1.get(4)) == Integer.parseInt(player2.get(1))) {
			player1.add(player2.remove(0));
			player1.add(player2.remove(0));}}
else if(player2.size() > 0) {player1.add(player2.remove(0));}
else if(player1.size() > 3 && player2.size() > 4) {
	if(Integer.parseInt(player1.get(3)) > Integer.parseInt(player2.get(4))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0));
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(3)) < Integer.parseInt(player2.get(4))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0));
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(3)) == Integer.parseInt(player2.get(4))) {
		player2.add(player1.remove(0));
		player2.add(player1.remove(0));
		player2.add(player1.remove(0));
		player2.add(player1.remove(0));}}
else if(player2.size() > 2 && player2.size() > 4) {
	if(Integer.parseInt(player1.get(2)) > Integer.parseInt(player2.get(4))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(2)) < Integer.parseInt(player2.get(4))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(2)) == Integer.parseInt(player2.get(4))) {
		player1.add(player2.remove(0));
		player1.add(player2.remove(0));
		player1.add(player2.remove(0));}}
else if(player1.size() > 1 && player2.size() > 4) {
	if(Integer.parseInt(player1.get(1)) > Integer.parseInt(player2.get(4))) {
					player1.add(player1.remove(0)); 
					player1.add(player1.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0)); 
					player1.add(player2.remove(0));
					player1.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(1)) < Integer.parseInt(player2.get(4))) {
					player2.add(player1.remove(0)); 
					player2.add(player1.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0)); 
					player2.add(player2.remove(0));
					player2.add(player2.remove(0));}
	else if(Integer.parseInt(player1.get(1)) == Integer.parseInt(player2.get(4))) {
		player1.add(player2.remove(0));
		player1.add(player2.remove(0));}}
else if(player1.size() == 1) {player2.add(player1.remove(0));}}}
			
		
		
if(player1.size() == 52) {System.out.println("Player 1 has won!");}
else if(player2.size() == 52) {System.out.println("Player 2 has won!");}
else {System.out.println("Error");}

System.out.println("Player 1:");
for(int i = 0; i< player1.size(); i++) {System.out.print(player1.get(i) + " ");}
System.out.println(" ");
System.out.println("Player 2:");
for(int i = 0; i< player2.size(); i++) {System.out.print(player2.get(i) + " ");}

System.out.println(" ");
System.out.println(" ");


}}

	



	
	//have some kind of an if statement that checks to see if either player's list has a length of 52
	//as soon as one player has a length of 52 the game ends and it can print out the winner of the game

			


	
	
	//use .add and .get codes to play the game? 

			
	
	
	//use if statements to compare the cards (The cards will need to have ints as their values)
	//the player with the larger value gets both cards added to the back of their list
	
	//always retrieve the top card, so always in spot 0
	
	//Don't have to worry about taking turns, but do need to get values from both lists at once. 
	//could probably say something like player1[0] > player2[0] (in a while loop?)
	
	//have different methods. One method retrieves the top card in both lists. 
	//make an if statement using the retrieved cards from there? 
	//have a method that puts both of the retrieved cards into the list that the higher card came from
	//have some way to keep track of what list the higher card came from. Maybe something like:
	// if(player1.get(0) > player2.get(0)) {player1.add(player1.get(0)); player1.add(player2.get(0));}
	//else if(player2.get(0) > player1.get(0)) {player2.add(player1.get(0)); player2.add(player2.get(0));}
	//else if(player1.get(0) == player2.get(0)) {something that gets the next four cards in the list and then evaluates the fourth card
	//Then adds the 6 cards to the list of the player who won the match
	

// int whatevs = Integer.parseInt(str);



	



