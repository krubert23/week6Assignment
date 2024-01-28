package week06;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit, int value) {
		this.setName(name);
		this.setSuit(suit);
		this.setValue(value);
	}
	public void describe() {
		System.out.println("This is a " + this.name + " of " + this.suit + " with a value of: " + this.value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
