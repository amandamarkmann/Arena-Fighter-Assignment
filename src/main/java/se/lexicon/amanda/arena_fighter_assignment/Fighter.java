package se.lexicon.amanda.arena_fighter_assignment;

public class Fighter {

	private String name;
	private int strength;
	private int lifeforce;         //står för hur mycket liv objektet har
	private int score;
	private boolean retired;
	private String[] history;
	
	public Fighter(String name, int strength) {
		this.name = name;
		this.strength = strength;
		restoreLifeforce();
	}
	
	public Fighter(int strength) {  //för opponent med romannamegenerator
		//this.name = romanNameGenerator
		this.strength = strength;
		restoreLifeforce();
	}
	
	public void restoreLifeforce() {
		this.lifeforce = strength * 2;
	}
	
	public int attack(int randomModifier) {
		
	return randomModifier + strength;	
	}
	
	public void addToScore(int scoreToAdd) {
		score = score + scoreToAdd;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void takeDamage(int damage) {
		lifeforce = lifeforce - damage;
	}
	
	public String getInfo() {
		String report = "Gladiator " + name + "s lifescore is now " + lifeforce;
		return report;
	}
	
	public void retire() {
		retired = true;
	}
	
	public boolean isRetired() {
		return retired;
		
	}
	public boolean isAlive() {
		if(lifeforce < 0) {
			return false;
		}
		return true;
	}
	
	public void addToHistory(String log) {
		
	}
	
	public void printHistory() {
		System.out.println();
	}
}
