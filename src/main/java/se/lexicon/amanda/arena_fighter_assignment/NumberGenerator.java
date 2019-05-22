package se.lexicon.amanda.arena_fighter_assignment;

import java.util.Random;

public class NumberGenerator {

private static Random rand = new Random();
	
	public static int getRandomNumber(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}
	
	
}
