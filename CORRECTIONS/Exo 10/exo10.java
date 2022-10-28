import java.util.ArrayList;
import java.util.List;

public class exo10 {
	public static void main(String[] args) 
	{
		Voiture voiture = new Voiture("Porshe");
		Bateau bateau = new Bateau();
		
		voiture.displayActions();
		bateau.displayActions();
		
		List<Vehicule> listVehicule = new ArrayList<Vehicule>();
		listVehicule.add(voiture);
		listVehicule.add(bateau);
		
		for(Vehicule v : listVehicule) {
			System.out.println(v);
			if(v instanceof Voiture) {
				System.out.println("Ceci est une voiture.");
			}
			if(v instanceof Bateau) {
				System.out.println("Ceci est un bateau.");
			}
		}
		
		//int i = (true == true ? 5 : 4);
		
	}
}
