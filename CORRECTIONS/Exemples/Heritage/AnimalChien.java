package Heritage;
public class AnimalChien extends HeritageAnimal implements InterfaceAnimalCapacites {

	public AnimalChien() {
	}


	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom("Chien");
	}


	@Override
	public boolean peutVoler() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean peutNager() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean peutMarcher() {
		// TODO Auto-generated method stub
		return true;
	}




}