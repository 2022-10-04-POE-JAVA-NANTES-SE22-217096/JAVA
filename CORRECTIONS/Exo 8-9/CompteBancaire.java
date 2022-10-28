
public class CompteBancaire extends Thread {

	// Attributs
	private String numCompte;
	private int solde;
	private String dteOuverture;
	private TypeCompte typeDeCompte;
	private boolean estOuvert = false;

	// Constructeurs
	public CompteBancaire() {
	}

	public CompteBancaire(String numCompte, int solde, String dteOuverture, TypeCompte typeDeCompte) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.dteOuverture = dteOuverture;
		this.typeDeCompte = typeDeCompte;
	}

	// Methodes internes
	@Override
	public void run() {
		System.out.println("Le compte " + numCompte + " a été crée le " + dteOuverture + " et a un solde initial de "
				+ solde + "€. Il s'agit d'un compte " + typeDeCompte + ".");
		setEstOuvert(true);
	}

	public void ouvrir() {
		setEstOuvert(true);
	}

	public void fermer() {
		setEstOuvert(false);
	}

	public void depot(int montant) {
		setSolde(getSolde() + montant);
		System.out.println("DEPOT: Nouveau solde pour " + getNumCompte() + ": " + getSolde());
	}

	public void retrait(int montant) {
		setSolde(getSolde() - montant);
		System.out.println("RETRAIT: Nouveau solde:" + getNumCompte() + ": " + getSolde());
	}

	public void virement(int montant, CompteBancaire beneficiaire) {
		beneficiaire.depot(montant);
		this.retrait(montant);
	}



  // Getters / Setters
	public String getNumCompte() {
		return this.numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public int getSolde() {
		return this.solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public String getDteOuverture() {
		return this.dteOuverture;
	}

	public void setDteOuverture(String dteOuverture) {
		this.dteOuverture = dteOuverture;
	}

	public TypeCompte getTypeDeCompte() {
		return this.typeDeCompte;
	}

	public void setTypeDeCompte(TypeCompte typeDeCompte) {
		this.typeDeCompte = typeDeCompte;
	}

	public boolean isEstOuvert() {
		return this.estOuvert;
	}

	public void setEstOuvert(boolean estOuvert) {
		this.estOuvert = estOuvert;
	}

}
