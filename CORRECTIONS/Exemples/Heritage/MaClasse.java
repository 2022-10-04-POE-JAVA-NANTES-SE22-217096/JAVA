package Heritage;

public class MaClasse {

	private String nom;
	private int test;

	public MaClasse() {

	}

	public MaClasse(String nom, int test) {
		super();
		this.nom = nom;
		this.test = test;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.test == ((MaClasse) obj).test) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.nom + " : " + this.test;
	}

}
