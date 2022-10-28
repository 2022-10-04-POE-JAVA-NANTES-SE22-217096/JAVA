
public class Exo08_1 {
  public static void main(String args[]) {

    CompteBancaire compteJean = new CompteBancaire("A7652", 500, "05/03/2000", TypeCompte.COURANT);
    CompteBancaire compteFlorence = new CompteBancaire("B2311", -50, "01/02/2012", TypeCompte.COURANT);
    CompteBancaire comptePierre = new CompteBancaire("S2314", 7500, "01/02/1994", TypeCompte.EPARGNE);

    Banque banque = new Banque();
    banque.ajoutCompte(compteJean);
    banque.ajoutCompte(compteFlorence);
    banque.ajoutCompte(comptePierre);

    compteJean.start();
    compteFlorence.start();
    comptePierre.start();
      
  }
}