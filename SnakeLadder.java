package com.bridgelab.snakeladder;

public class SnakeLadder {
	public static final int NoPlayOption = 0;
    public static final int ladderOption = 1;
    public static final int SnakeOption = 2;
    public static int PlayerOne = 1;
    
    public static void main(String[] args){
    		double position = 0;
    		while (position < 100){
    			double diceRoll = (Math.floor(Math.random() * 10) % 6) + 1;
    			System.out.println("Dice rolled value: " + diceRoll);
    			int option = (int) Math.floor(Math.random() * 10) % 3;
    			switch (option) {
                  			case NoPlayOption:
                  				break;
                  			case ladderOption:
                  				if(position + diceRoll <= 100){
                  					position = position + diceRoll;
                  				}
                  				break;
                  			case SnakeOption:
                  				position = position - diceRoll;
                  				if (position < 0)
                  				{
                  					position = 0;
                  				}
                  				break;
    			}
    		}
    		System.out.println("Player Wins with Position :" + position);
		}
}
