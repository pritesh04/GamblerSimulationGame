package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay = 100;
	public static int betPerDay = 1;

	public void WinnerLoser(int result) {

		if (result == 1) {
			amountPerDay += 50;
			System.out.println("Winner");

		} else {
			amountPerDay -= 50;
			System.out.println("Losser");

		}
		System.out.println("Amount remained is " + amountPerDay);
	}

	public static void main(String[] args) {
		GamblingSimulation gamblingSimulation = new GamblingSimulation();
		int result = (int) Math.floor(Math.random() * 10) % 2;
		gamblingSimulation.WinnerLoser(result);

	}
}
