package com.Bridgelab.Workshop;

public class GamblingSimulation {
	public static int amountPerDay=100;
	public static int betPerDay=1;
public static void main(String[] args) {
	int min=0,max=1;
	
	
	int Result= (int)Math.floor(Math.random()*10)%2;
	System.out.println(Result);
	
	if(Result == 1)
	{
		amountPerDay+=1;
	}
	else {
		amountPerDay-=1;
	}
}
}
