package fr.elioss.projet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String accountNumber = ""; char accountType = ' ', theme, payment;
		double value; int[] date;
		Scanner input = new Scanner(System.in);
		System.out.println("1. Créer un compte\n"
						 + "2. Afficher un compte\n"
						 + "3. Créer une ligne comptable\n"
						 + "4. Sortir\n"
						 + "5. De l'aide");
		switch(input.nextInt()){
		case 1:
			System.out.println("Type du compte (Courant, joint, épargne) :\n"
							 + "Numéro du compte :\n"
							 + "Première valeur créditée :\n"
							 + "Taux de placement :");
			accountType = input.next().charAt(0);
			accountNumber = input.next();
			break;
		case 2:
			System.out.println("Numéro du compte à consulter : ");
			if(input.next().equals(accountNumber)) {
				System.out.println("Votre compte est un compte " + accountType);
			}
			else {
				System.out.println("Le numéro de compte n'est pas valide.");
			}
			break;
		case 3:
			System.out.println("Option non programmée.");
			break;
		case 4:
			System.exit(0);
			break;
		case 5:
			System.out.println("démerde-toi");
		}
		
		
	}
}
