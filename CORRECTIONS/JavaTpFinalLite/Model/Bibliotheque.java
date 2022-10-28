package Model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	
	private String nom;
	private List<Livre> livres = new ArrayList<Livre>();
	
	public Bibliotheque(String nom) {
		this.nom = nom;
	}

	public List<Ecrivain> getDynamicListeEcrivain() {
		List<Ecrivain> ecrivains = new ArrayList<Ecrivain>();
		
		for(Livre l : this.livres) {
			for(Auteur a : l.getAuteurs()) {
				if(a instanceof Ecrivain) {
					ecrivains.add((Ecrivain)a);
				}
			}
		}
		
		return ecrivains;
	}
	
	public List<Dessinateur> getDynamicListeDessinateur() {
		List<Dessinateur> dessinateurs = new ArrayList<Dessinateur>();
		
		for(Livre l : this.livres) {
			for(Auteur a : l.getAuteurs()) {
				if(a instanceof Dessinateur) {
					dessinateurs.add((Dessinateur)a);
				}
			}
		}
		
		return dessinateurs;
	}
	
	public void ajouterLivre(Livre livre) {
		this.livres.add(livre);
	}
	
	public void supprimerLivre(Livre livre) {
		this.livres.remove(livre);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
}
