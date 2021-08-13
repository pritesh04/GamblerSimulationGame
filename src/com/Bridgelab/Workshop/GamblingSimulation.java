package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay = 100;
	public static int betPerDay = 1;

	public int WinnerLoser(int result) {

		result = (int) Math.floor(Math.random() * 10) % 2;
		if (result == 1) {

			System.out.println("Winner");

		} else {

			System.out.println("Losser");

		}
		System.out.println("Amount remained is "+amountPerDay);return amountPerDay;
	}

	

	public static void main(String[] args) {
		int won = 0, los = 0;
		int[] a = new int[30];
		int stake = amountPerDay;
		GamblingSimulation gamblingSimulation = new GamblingSimulation();
		int result = (int) Math.floor(Math.random() * 10) % 2;
		

		gamblingSimulation.WinnerLoser(result);
		System.out.println("tota amount after 20 days is " + amountPerDay);
		while (amountPerDay > (stake * 0.5) && amountPerDay < (stake * 1.5)) {
			double random = Math.random();
			if (random > 0.5) {
				amountPerDay += betPerDay;
			} else {
				amountPerDay -= betPerDay;
			}
		}
		if (amountPerDay > (stake * 0.5)) {
			System.out.println("Gambler loss 50%");
		} else
			System.out.println("Gambler gain 50%");
	}

}
