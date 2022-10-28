package Model;

public class Manga implements Categorie {

	@Override
	public String getNom() {
		return "Manga";
	}

	@Override
	public String getPaysOrigine() {
		return "Japon";
	}

}