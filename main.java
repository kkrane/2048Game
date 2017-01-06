package com.game2048;

import javax.swing.JFrame;
import java.io.IOException;
import java.util.Scanner;

//class main du 2048
public class main 
{

	public static void main(String[] args) 
	{
		JFrame fenetre = new JFrame();
	   
	    fenetre.setTitle("2048");
	    fenetre.setSize(400, 400);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setVisible(true);
	    
		Grille grille = new Grille();
		Scanner sc = new Scanner(System.in);
		String touche ="";
		while(!touche.equals("p"))
		{
				grille.apparitionAléatoire();
				grille.afficherGrille();
				touche = sc.nextLine();
				System.out.println("\n\n");
				if(touche.equals("4"))
				{
					grille.changeGauche();
				}
				if(touche.equals("2"))
				{
					grille.changeBas();
				}
				if(touche.equals("6"))
				{
					grille.changeDroite();
				}
				if(touche.equals("8"))
				{
					grille.changeHaut();
				}
		}
	}

}
