public class Ex06 {

	public static void main(String[] args) {
		
		Arme arme1 = new Arme("Nunchaku", 10);
		Arme arme2 = new Arme("Courge", 15);
		
		PersonnageAvecEnum monPerso1 = new PersonnageAvecEnum(5, NomPersonnage.TOTO, 10, arme1);
		PersonnageAvecEnum monPerso2 = new PersonnageAvecEnum(5, NomPersonnage.TATA, 14, arme2);
		PersonnageAvecEnum monPerso3 = new PersonnageAvecEnum(2, NomPersonnage.TITI, 8, arme2);
		
		System.out.println(monPerso1.getNom());
		
		switch(monPerso2.getNom()) {
			case TOTO:
				System.out.println("C'est TOTO ! ");
				break;
			default:
				System.out.println("Je sais pas ! ");
				break;
		}
	
		monPerso1.parler("Test !!!");
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		
	}


}
