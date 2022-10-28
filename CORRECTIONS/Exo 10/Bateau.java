public class Bateau extends Vehicule implements ActionVehicule{
	
	public Bateau() {
		super("Bateau");
	}
	
	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom("Bateau");
	}
	@Override
	public boolean peutVoler() {return false;}
	@Override
	public boolean peutRouler() {return false;}
	@Override
	public boolean peutNaviguer() {return true;}
	
	@Override
	public void displayActions() {
		System.out.println("La "+getNom()+" peut : Voler ? " + this.peutVoler() 
				+ ", Rouler ? " + this.peutRouler() 
				+ ", Naviguer ? " + this.peutNaviguer());
	}
}