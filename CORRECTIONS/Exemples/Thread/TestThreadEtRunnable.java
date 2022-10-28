package Thread;

public class TestThreadEtRunnable {

	public static void main(String[] args) {
	    // Main - Construction d'un tableau de Thread
	   /* ThreadCompteur[] compteurs = {
	      new ThreadCompteur("Jean"),
	      new ThreadCompteur("Yacine"),
	      new ThreadCompteur("Alicia"),
	    };

	    // Démarrage des 3 Threads
	    for (ThreadCompteur compteur : compteurs) {
	      compteur.start();
	    }*/
	    
	    
	    
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
