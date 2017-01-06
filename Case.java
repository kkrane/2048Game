package com.game2048;

public class Case 
{
	private int value;
	
	public Case()
	{
		this.value=1;
	}
	
	//Getteur
	public int getValue()
	{
		return this.value;
	}
	
	
	//Setteur
	public void setValue(int value)
	{
		this.value=value;
	}
	
	public void afficherCase()
	{
		System.out.print(this.value);
	}
}