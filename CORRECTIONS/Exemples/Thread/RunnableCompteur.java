package Thread;

public class RunnableCompteur implements Runnable {

	// Variables
	private String nom;
	private int maximum;

	// Constructeurs
	public RunnableCompteur(String nom, int maximum) {
		this.nom = nom;
		this.maximum = maximum;
	}

	public RunnableCompteur(String nom) {
		this(nom, 3);
	}

	// Override execution
	@Override
	public void run() {
		for (int i = 1; i <= maximum; i++) {
			try {
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				System.err.println(nom + " a ete interrompu.");
			}
			System.out.println(nom + " : " + i);
		}
		System.out.println("*** " + nom + " a fini de compter jusqu'à " + maximum);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}