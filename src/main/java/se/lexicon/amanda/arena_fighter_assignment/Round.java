package se.lexicon.amanda.arena_fighter_assignment;


public class Round {
	
	private int roundNumber;
	private String roundLog;
	public int playerAttack; 
	public int opponentAttack;
	

	
	public void fight(Fighter player, Fighter opponent) {
		
		playerAttack = player.attack(NumberGenerator.getRandomNumber(1, 6));
		opponentAttack = opponent.attack(NumberGenerator.getRandomNumber(1, 6));
		
		if (isBiggest(playerAttack, opponentAttack)) {
			
			opponent.takeDamage(NumberGenerator.getRandomNumber(1, 6));
			
			System.out.println(opponent.getInfo());
		}
		
		else {
			
			player.takeDamage(NumberGenerator.getRandomNumber(1, 6));
			
			System.out.println(player.getInfo());
		}
			
	}
	
	
    public boolean isBiggest(int playerAttack, int opponentAttack) {
    	if (playerAttack >= opponentAttack) {
    		
    		return true;
    	}
    	
    	else  {
    		
    	return false;
    	}
    	
    } 
    public void appendLog(String log) {
    	
    }
    public String getRoundLog(int roundNumber, Fighter player, Fighter opponent) {
    	String result = "ToDo";
    	
    	return result;
    	
    }
	
    
	
    //få in diceroll för båda "spelare"  ---  randomnr 1-6
    //metod för att se vem som blir starkast och får slå den andra
    //metod för om båda får samma styrka
    //metod för den som tar damage samt minska lifeforce
    //se om båda fortfarande lever - return resultat - fråga fortsätta eller ej 
    // metod för att logga resultat
    //om död eller lägger av resultat av omgångar - log!
    
}
