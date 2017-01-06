package com.game2048;

//gérer les lignes avec les cases 
public class Ligne 
{
	private Tuile[] tuile = new Tuile[4];
	
	public Ligne()
	{
		for(int i=0;i<4;i++)
		{
			tuile[i]=new Tuile();
			tuile[i].setValue(1);
		}
	}

	public Tuile[] getTuile()
	{
		return this.tuile;
	}
	public void afficherLigne()
	{
		for(int i=0;i<4;i++)
		{
			tuile[i].afficherTuile();
			System.out.print(" ");
		}
	}
}
