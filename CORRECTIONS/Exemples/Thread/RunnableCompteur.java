package Thread;
public class RunnableCompteur implements Runnable {

  // Variables
  String nom;
  int maximum;



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
	      Thread.sleep((int)(Math.random() * 3000));
      } catch(InterruptedException e) {
	      System.err.println(nom + " a ete interrompu.");
      }
      System.out.println(nom + " : " + i);
    }
    System.out.println("*** " + nom + " a fini de compter jusqu'à " + maximum);
  }

  public static void main(String[] args) {
    // Main - Construction d'un tableau de Thread
    RunnableCompteur[] compteurs = {
      new RunnableCompteur("Jean"),
      new RunnableCompteur("Yacine"),
      new RunnableCompteur("Alicia"),
    };

    // Démarrage des 3 Threads
    for (RunnableCompteur compteur : compteurs) {
      Thread thread =  new Thread(compteur) ;
      thread.start();
    }


  }

}