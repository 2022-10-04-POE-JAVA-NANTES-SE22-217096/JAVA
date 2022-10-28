package Model;

public class Dessinateur extends Auteur {
	
	private String typeArt;

	public Dessinateur(String nom, String prenom, String typeArt) {
		super(nom, prenom);
		this.typeArt = typeArt;
	}

	public String getTypeArt() {
		return typeArt;
	}

	public void setTypeArt(String typeArt) {
		this.typeArt = typeArt;
	}
	
}