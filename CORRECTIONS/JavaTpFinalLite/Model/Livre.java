package Model;

import java.util.ArrayList;
import java.util.List;

public class Livre {
	
	private String titre;
	private int nbPages;
	private Genre genre;
	private Categorie categorie;
	private List<Auteur> auteurs = new ArrayList<Auteur>();
	
	public Livre(String titre, int nbPages, Genre genre, Categorie categorie) {
		this.titre = titre;
		this.nbPages = nbPages;
		this.genre = genre;
		this.categorie = categorie;
	}
	
	public void ajouterAuteur(Auteur auteur) {
		this.auteurs.add(auteur);
	}
	
	public void supprimerAuteur(Auteur auteur) {
		this.auteurs.remove(auteur);
	}
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public List<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
}
