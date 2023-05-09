package es.tictactoe;


public class Player {

	private String label;
	private String name;
	private int id;

	public Player(int id, String letter, String name) {
		this.id = id;
		this.label = letter;
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
