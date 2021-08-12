package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay = 100;
	public static int betPerDay = 1;

	public static void WinnerLoser(int result)
	{
		
		if (result == 1) {
			amountPerDay += 1;
			System.out.println("Winner");
			
		} else {
			amountPerDay -= 1;
			System.out.println("Losser");
		}
	}
	public static void main(String[] args) {
		int result = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println(result);

		WinnerLoser(result);

		
	}
}
