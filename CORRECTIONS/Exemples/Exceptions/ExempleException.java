package Exceptions;
import java.util.Scanner;

public class ExempleException {

	public static void main(String args[]) {

		boolean isBoucle = true;

		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ecrivez un numéro : ");
				String test = sc.nextLine();
				int number = calculer(test, test);

				isBoucle = false;
			} catch (CalculerException e) {
				System.out.println("Vous devez renseigner un nombre entier...");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Ceci est un finally !");
			}
		} while(isBoucle);


		System.out.println("Ceci est un test !");
	}

	public static int calculer(String a, String b) throws CalculerException {

		int resultat = 0;

		try {
			resultat = Integer.parseInt(a) + Integer.parseInt(b);
		} catch (NumberFormatException e) {
			throw new CalculerException("Les paramètres renseignés ne sont pas des nombres...");
		}

		if(resultat <= 0) {
			throw new CalculerException("Le résultat est égal ou inférieur à 0...");
		}

		return resultat;
	}
}
