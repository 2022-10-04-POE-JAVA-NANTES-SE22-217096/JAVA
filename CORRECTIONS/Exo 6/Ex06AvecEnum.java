public class Ex06AvecEnum {

	public static void main(String[] args) {
		
		Arme arme1 = new Arme("Nunchaku", 10);
		Arme arme2 = new Arme("Courge", 15);
		
		Personnage monPerso1 = new Personnage(5, "Super Toto", 10, arme1);
		Personnage monPerso2 = new Personnage(5, "Super Tata", 14, arme2);
		Personnage monPerso3 = new Personnage(2, "Luffy", 8, arme2);
	
		monPerso1.parler("Test !!!");
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		monPerso1.frapper(monPerso3);
		
	}


}
