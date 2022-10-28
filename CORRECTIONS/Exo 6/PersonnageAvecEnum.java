
public class PersonnageAvecEnum {
	
	/* Propriétés */
	private int nombreDeVies;
	private NomPersonnage nom;
	private int force;
	private Arme arme;
	
	/* Constructeurs */
	public PersonnageAvecEnum() {
		
	}
	
	public PersonnageAvecEnum(NomPersonnage nom, int force, Arme arme) {
		this.nom = nom;
		this.force = force;
		this.arme = arme;
	}
	
	public PersonnageAvecEnum(int nombreDeVies, NomPersonnage nom, int force, Arme arme) {
		this.nombreDeVies = nombreDeVies;
		this.nom = nom;
		this.force = force;
		this.arme = arme;
	}
	
	/* Méthodes */
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void frapper(PersonnageAvecEnum persoAttaque) {
		if(persoAttaque.getForce() - this.arme.getDegatsInfliges() <= 0) {
			persoAttaque.setForce(25);
			persoAttaque.setNombreDeVies(persoAttaque.getNombreDeVies() - 1);
			if(persoAttaque.getNombreDeVies() <= 0) {
				System.out.println("Le personnage "+persoAttaque.getNom()+" est mort...");
			}
		} else {
			persoAttaque.setForce(persoAttaque.getForce() - this.arme.getDegatsInfliges());
		}
	}
	
	
	/* Getters & Setters*/
	public int getNombreDeVies() {
		return nombreDeVies;
	}
	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}
	public NomPersonnage getNom() {
		return nom;
	}
	public void setNom(NomPersonnage nom) {
		this.nom = nom;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public Arme getArme() {
		return arme;
	}
	public void setArme(Arme arme) {
		this.arme = arme;
	}

}
