package se.lexicon.amanda.arena_fighter_assignment;

public class Battle {

	private Fighter player;
	private Fighter opponent;
	private String battleLog;
	
	public boolean battle() {
		
		//
		while(player.isAlive() && opponent.isAlive()) {
			
			
			
			
		}
		
		return player.isAlive();
		
	}
	public String getBattleLog() {
		return battleLog;
	}
	
	public void appendLog(String roundLog){
		StringBuilder roundBuilder = new StringBuilder(battleLog);
		roundBuilder.append(roundLog);
	}
	
}

//gör en log under rounds medan båda fortfarande lever
//getters and setters
