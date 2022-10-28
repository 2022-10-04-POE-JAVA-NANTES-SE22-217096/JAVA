
public class Moteur {

	private double prix;
	private TypeMoteur typeMoteur;
	
	
	public Moteur(double prix, TypeMoteur typeMoteur) {
		this.prix = prix;
		this.typeMoteur = typeMoteur;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public TypeMoteur getTypeMoteur() {
		return typeMoteur;
	}

	public void setTypeMoteur(TypeMoteur typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
	
}
