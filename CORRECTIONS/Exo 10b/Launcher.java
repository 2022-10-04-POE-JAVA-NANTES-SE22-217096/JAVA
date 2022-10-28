
public class Launcher {
	public static void main(String[] args) {
		
		Garage monGarage = new Garage("Mon super Garage");
		
		Moteur moteur1 = new Moteur(500, TypeMoteur.ELECTRIQUE);
		Moteur moteur2 = new Moteur(200, TypeMoteur.HYBRIDE);
		
		Vehicule vehicule1 = new Vehicule("Super CAR", 300, Marque.PORSCHE, moteur1);
		Vehicule vehicule2 = new Vehicule("DeLoreal", 10000, Marque.CITROEN, moteur2);
		Vehicule vehicule3 = new Vehicule("Kart", 20, Marque.RENAULT, moteur1);
		
		vehicule1.ajouterOption(new Climatisation());
		vehicule1.ajouterOption(new GPS());
		vehicule1.ajouterOption(new SiegeChauffant());
		
		vehicule2.ajouterOption(new Climatisation());
		vehicule2.ajouterOption(new GPS());
		vehicule2.ajouterOption(new SiegeChauffant());
		vehicule2.ajouterOption(new BarresDeToit());
		vehicule2.ajouterOption(new VitreElectrique());
		
		monGarage.ajouterVehicule(vehicule1);
		monGarage.ajouterVehicule(vehicule2);
		monGarage.ajouterVehicule(vehicule3);
		
		for(Vehicule v : monGarage.getVehicules()) {
			System.out.println(v.obtenirDescriptif()+"\nLes options : ");
			for(Option o : v.getOptions()) {
				System.out.println("- "+o);
			}
			System.out.println("\n");
		}
	}
}
