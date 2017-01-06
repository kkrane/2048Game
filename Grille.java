package com.game2048;

import java.util.Random;
//gérer la grille du 2048
public class Grille 
{
	private Ligne[] lignes = new Ligne[4];
	
	public Grille()
	{
		for(int i=0;i<4;i++)
		{
			lignes[i]=new Ligne();
		}
	}
	
	//Getter
	public Ligne[] getLigne()
	{
		return this.lignes;
	}
	
	public void afficherGrille()
	{
		for(int i=0;i<4;i++)
		{
			lignes[i].afficherLigne();
			System.out.println("");
		}
	}
	
	public void changeGauche()
	{
		for(int tour=0;tour<=3;tour++)
		{
			for(int j=1;j<=3;j++)
			{
				
				if(this.getLigne()[tour].getTuile()[j].getValue()!=1)
				{
					System.out.println("début");
					for(int i=j-1;i>=0;i--)
					{
						
						if(this.getLigne()[tour].getTuile()[i].getValue()!=1)
						{
							if(this.getLigne()[tour].getTuile()[i].getValue()==this.getLigne()[tour].getTuile()[j].getValue())
							{
								
								this.getLigne()[tour].getTuile()[i].setValue(this.getLigne()[tour].getTuile()[i].getValue()*2);
								
								this.getLigne()[tour].getTuile()[j].setValue(1);
							}
						}
						else
						{
						
							this.getLigne()[tour].getTuile()[i].setValue(this.getLigne()[tour].getTuile()[j].getValue());
							this.getLigne()[tour].getTuile()[j].setValue(1);
							j--;
						}
					}
				}
			}
		}
	}
	
	public void changeBas()
	{
		Grille temp = new Grille();
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la droite
		{
			for(int i=0;i<=3;i++)
			{
				temp.getLigne()[i].getTuile()[x].setValue(this.getLigne()[j].getTuile()[i].getValue());
			}
		}
		temp.changeGauche();
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la gauche
		{
			for(int i=0;i<=3;i++)
			{
				this.getLigne()[j].getTuile()[i].setValue(temp.getLigne()[i].getTuile()[x].getValue());
			}
		}
	}
	
	public void changeHaut()
	{
		Grille temp = new Grille();
		for(int j=0, x=3;j<=3;j++,x--) //Tourne la grille vers la gauche
		{
			for(int i=0;i<=3;i++)
			{
				temp.getLigne()[j].getTuile()[i].setValue(this.getLigne()[i].getTuile()[x].getValue());
			}
		}
		temp.changeGauche();
		for(int j=0, x=3;j<=3;j++,x--) //Tourne la grille vers la droite
		{
			for(int i=0;i<=3;i++)
			{
				this.getLigne()[i].getTuile()[x].setValue(temp.getLigne()[j].getTuile()[i].getValue());
			}
		}
	}
	
	public void changeDroite()
	{
		Grille temp = new Grille();
		Grille temp2 = new Grille();
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la gauche 1
		{
			for(int i=0;i<=3;i++)
			{
				temp.getLigne()[j].getTuile()[i].setValue(this.getLigne()[i].getTuile()[x].getValue());
			}
		}
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la gauche 2
		{
			for(int i=0;i<=3;i++)
			{
				temp2.getLigne()[j].getTuile()[i].setValue(temp.getLigne()[i].getTuile()[x].getValue());
			}
		}
		temp2.changeGauche();
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la droite 1
		{
			for(int i=0;i<=3;i++)
			{
				temp.getLigne()[i].getTuile()[x].setValue(temp2.getLigne()[j].getTuile()[i].getValue());
			}
		}
		for(int j=0, x=3;j<=3;j++,x--) //Tourner la grille vers la droite 2
		{
			for(int i=0;i<=3;i++)
			{
				this.getLigne()[i].getTuile()[x].setValue(temp.getLigne()[j].getTuile()[i].getValue());
			}
		}
	}
	
	public void apparitionAléatoire()
	{
		Random r = new Random();
		int nbAléatoire1 = r.nextInt(4 - 1);
		int nbAléatoire2 = r.nextInt(4 - 1);
		if(this.getLigne()[nbAléatoire1].getTuile()[nbAléatoire2].getValue()==1)
		{
			this.getLigne()[nbAléatoire1].getTuile()[nbAléatoire2].setValue(2);
		}
	}

	
}
