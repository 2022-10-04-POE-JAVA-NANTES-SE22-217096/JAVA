package Thread;
public class ThreadCompteur extends Thread {

  // Variables
  String nom;
  int maximum;



  // Constructeurs
  public ThreadCompteur(String nom, int maximum) {
    this.nom = nom;
    this.maximum = maximum;
  }

  public ThreadCompteur(String nom) {
    this(nom, 3);
  }



  // Override execution
  @Override
  public void run() {
    // Compteur
    for (int i = 1; i <= maximum; i++) {

	    try {
			sleep((int)(Math.random() * 3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      System.out.println(nom + " : " + i);
    }
    System.out.println("*** " + nom + " a fini de compter jusqu'à " + maximum);
  }

  public static void main(String[] args) {
    // Main - Construction d'un tableau de Thread
    ThreadCompteur[] compteurs = {
      new ThreadCompteur("Jean"),
      new ThreadCompteur("Yacine"),
      new ThreadCompteur("Alicia"),
    };

    // Démarrage des 3 Threads
    for (ThreadCompteur compteur : compteurs) {
      compteur.start();
    }


  }

}