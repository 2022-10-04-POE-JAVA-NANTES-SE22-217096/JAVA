
import java.util.ArrayList;

public class Banque {

	  private ArrayList<CompteBancaire> listeComptes = new ArrayList<CompteBancaire>();
	  
	  public Banque() {
	  }
	
	  public void ajoutCompte(CompteBancaire c) {
	    this.listeComptes.add(c);
	  }
	
	
	  public ArrayList<CompteBancaire> getListeComptes() {
	    return this.listeComptes;
	  }
	
	  public void setListeComptes(ArrayList<CompteBancaire> listeComptes) {
	    this.listeComptes = listeComptes;
	  }

}