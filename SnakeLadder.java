package com.bridgelab.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		double randomVar = (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Dice rolled value: " + randomVar);
	}
}
