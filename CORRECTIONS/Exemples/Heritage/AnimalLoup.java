package Heritage;

public class AnimalLoup extends HeritageAnimal implements InterfaceAnimalCapacites {

	public AnimalLoup() {
		super();
		this.setNom("Loup");
	}

	@Override
	public void setNom(String nom) {
		this.setNom("Loup");
	}

	@Override
	public boolean peutVoler() {
		return false;
	}

	@Override
	public boolean peutNager() {
		return false;
	}

	@Override
	public boolean peutMarcher() {
		return true;
	}



}