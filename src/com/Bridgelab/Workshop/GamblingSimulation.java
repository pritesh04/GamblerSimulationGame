package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay = 100;
	public static int betPerDay = 1;
	public static int stake = amountPerDay;

	public static String WinnerLoser() {
		int result;
		result = (int) Math.floor(Math.random() * 10) % 2;
		if (result == 1) {

			return "winner";
		} else {

			return "losser";

		}

	}

	public static void ResignDay() {
		int initialStackOfDay = stake;
		double gain = amountPerDay * 1.5;
		double loss_percentage = amountPerDay * 0.5;

		while (stake > (loss_percentage) && stake < (gain)) {

			if (WinnerLoser() == "Winning") {
				amountPerDay += betPerDay;

			} else {
				amountPerDay -= betPerDay;

			}
		}
		

	}

	public static void DayAmountWinOrLoss() {
		for (int i = 0; i < 20; i++)
			ResignDay();

	}

	public static void main(String[] args) {

		GamblingSimulation gamblingSimulation = new GamblingSimulation();

		DayAmountWinOrLoss();
		if (stake > 100)
			System.out.println("Gambler win and total amount = " + amountPerDay);
		else
			System.out.println("Gambler loss and total amount =" + amountPerDay);
	}

}
