package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay=100;
	public static int betPerDay=1;
public static void main(String[] args) {
	int min=0,max=1;
	
	int Result= (int) (Math.random()*(max-min+1)+min);
	
	if(betPerDay == Result)
	{
		System.out.println("winner");
	}
	else {
		System.out.println("loser");
	}
}
}
