package se.lexicon.amanda.arena_fighter_assignment;

import java.util.Scanner;

public class App 
{
	private static Scanner scanner = new Scanner(System.in);
	
    public static void main( String[] args ) //statiskt tillhör klassen
    {
    	Fighter player = new Fighter("Amanda", 10);
    	
    	System.out.println(player.getInfo());
    	
    	Fighter opponent = new Fighter(7);
    	
    	System.out.println(opponent.getInfo());
    	
    	int dmgTotal = player.attack(NumberGenerator.getRandomNumber(1, 6));
    	
    	System.out.println("You attacked with " + dmgTotal + " force!");
    	
    	opponent.takeDamage(dmgTotal);
    	
    	System.out.println(opponent.getInfo());
    	
    	Battle battle = new Battle();
    	battle.battle();
    }
}

//bara för att testa lite

//ta input från spelare