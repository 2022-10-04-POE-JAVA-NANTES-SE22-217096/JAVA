
public class Arme {

	private String nom;
	private int degatsInfliges;
	private int niveau;
	
	public Arme(String nom, int degatsInfliges) {
		this.nom = nom;
		this.degatsInfliges = degatsInfliges;
		this.niveau = 1;
	}
	
	public void augmenterNiveau() {
		this.niveau++;
		this.degatsInfliges += 5;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDegatsInfliges() {
		return degatsInfliges;
	}
	public void setDegatsInfliges(int degatsInfliges) {
		this.degatsInfliges = degatsInfliges;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
}
