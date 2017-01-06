package com.game2048;

//gérer les cases
public class Tuile
{
	private int value;
	
	public Tuile()
	{
		this.value=1;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	
	public void setValue(int value)
	{
		this.value=value;
	}
	
	public void afficherTuile()
	{
		System.out.print(this.value);
	}
}