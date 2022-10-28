package Model;

public class Ecrivain extends Auteur {
	
	private String style;

	public Ecrivain(String nom, String prenom, String style) {
		super(nom, prenom);
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
}
