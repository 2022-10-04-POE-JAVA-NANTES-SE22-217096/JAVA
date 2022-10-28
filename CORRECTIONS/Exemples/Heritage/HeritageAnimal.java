package Heritage;
public abstract class HeritageAnimal {

	  // Variables
	  private String nom;
	  private int nombrePates;
	  private boolean mamifere;

	  public HeritageAnimal() {
	  }


	  public String getNom() {
	    return this.nom;
	  }

	  public void setNom(String nom) {
	    this.nom = nom;
	  }

	  public int getNombrePates() {
	    return this.nombrePates;
	  }

	  public final void setNombrePates(int nombrePates) {
	    this.nombrePates = nombrePates;
	  }

	  public boolean isMamifere() {
	    return this.mamifere;
	  }

	  public void setMamifere(boolean mamifere) {
	    this.mamifere = mamifere;
	  }



}