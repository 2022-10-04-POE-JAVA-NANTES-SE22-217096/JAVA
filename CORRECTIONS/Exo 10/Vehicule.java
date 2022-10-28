public abstract class Vehicule
{
	private String nom;
	private int vitesseMax;
	
	public Vehicule () {}
	
	public Vehicule (String nom) 
	{
		this.nom = nom;
	}
	
	public Vehicule (String nom, int vitesseMax) 
	{
		this.nom = nom;
		this.vitesseMax = vitesseMax;
	}
	
	public Vehicule (int vitesseMax) 
	{
		this.nom = "defaut";
		this.vitesseMax = vitesseMax;
	}
	
	public int getVitesseMax() {return this.vitesseMax;}

	public void setVitesseMax(int vitesseMax){this.vitesseMax = vitesseMax;}
	
	public String getNom(){return this.nom;}

	public void setNom(String nom){this.nom = nom;}

	@Override
	public String toString() {
		return nom;
	}
	
	
	
}