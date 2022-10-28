public class Voiture extends Vehicule implements ActionVehicule{
	
	public Voiture() {
		super("Voiture");
	}
	
	public Voiture(String nom) {
		super(nom);
	}
	
	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom("Voiture");
	}
	@Override
	public boolean peutVoler() {return false;}		
	@Override
	public boolean peutRouler() {return true;}
	@Override
	public boolean peutNaviguer() {return false;}

	@Override
	public void displayActions() {
		System.out.println("La "+getNom()+" peut : Voler ? " + (this.peutVoler() ? "Oui":"Non") 
				+ ", Rouler ? " + (this.peutRouler() ? "Oui":"Non") 
				+ ", Naviguer ? " + (this.peutNaviguer() ? "Oui":"Non"));
	}
}