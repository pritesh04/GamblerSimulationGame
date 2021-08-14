package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay = 100;
	public static int betPerDay = 1;
	public static int stake = amountPerDay;
	public static double gain = amountPerDay * 0.5;
	public static double loss = amountPerDay * 0.5;

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

		while (amountPerDay > (loss) && stake < (gain)) {

			if (WinnerLoser() == "Winning") {
				stake += betPerDay;
			} else {
				stake -= betPerDay;
			}
		}

	}

	public static void main(String[] args) {

		GamblingSimulation gamblingSimulation = new GamblingSimulation();

		gamblingSimulation.WinnerLoser();
		System.out.println("tota amount after 20 days is " + amountPerDay);
		ResignDay();
		if (amountPerDay < 100)
			System.out.println("Gambler loss and total amount = " + amountPerDay);
		else
			System.out.println("Gambler win and total amount =" + amountPerDay);
	}
}
