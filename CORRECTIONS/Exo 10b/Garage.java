import java.util.ArrayList;
import java.util.List;

public class Garage {

	//Attributs
	private String nom;
	private List<Vehicule> vehicules = new ArrayList<Vehicule>();
	
	
	//Constructeurs
	//Ici on ne rajoute pas de parametre liste car la liste est déja instancié à la déclaration de la propriété
	public Garage(String nom) {
		this.nom = nom;
	}
	
	
	//Méthodes
	public void ajouterVehicule(Vehicule vehicule) {
		this.vehicules.add(vehicule);
	}
	
	public void supprimerVehicule(Vehicule vehicule) {
		this.vehicules.remove(vehicule);
	}
	
	
	//Getters and Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
}
