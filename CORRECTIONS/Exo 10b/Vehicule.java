import java.util.ArrayList;
import java.util.List;

public class Vehicule {
	
	private String nom;
	private double prix;
	private Marque marque;
	private Moteur moteur;
	private List<Option> options = new ArrayList<Option>();
	
	public Vehicule(String nom, double prix, Marque marque, Moteur moteur) {
		this.nom = nom;
		this.prix = prix;
		this.marque = marque;
		this.moteur = moteur;
	}
	
	public String obtenirDescriptif() {
		return "Nom : "+this.nom+" est un véhicule de la marque "
				+this.marque+" et son moteur est de type "
				+this.moteur.getTypeMoteur()+". Son prix est de : "
				+obtenirPrixTotal()+"€";
	}

	public double obtenirPrixTotal() {
		double prixTotal = this.prix + this.moteur.getPrix();
		for(Option o : this.options) {
			prixTotal += o.getPrix();
		}
		return prixTotal;
	}
	
	public void ajouterOption(Option option) {
		this.options.add(option);
	}
	
	public void supprimerOption(Option option) {
		this.options.remove(option);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
}
