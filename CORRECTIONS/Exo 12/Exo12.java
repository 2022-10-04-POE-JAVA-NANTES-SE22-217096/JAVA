import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Exo12 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    
    while (true) {
      System.out.print("Entrez un nombre :");
      String response = sc.nextLine(); 
      if (response.equals("q")) {
        break;
      } else {
    	  try {
	        int newNumber = Integer.parseInt(response);
	        if (!list.contains(newNumber)){ 
	          list.add(newNumber);
	        } else {
	          Integer positionDoublon = list.indexOf(newNumber)+1;
	          System.out.println("Chiffre déja ajouté à la saisie !" + positionDoublon);
	        }
    	  } catch(NumberFormatException e) {
    		  System.out.println("Vous devez entrer un nombre ou 'q' pour quitter !");
    	  }
      }
    
    }

    Iterator i = list.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
    try {
    	System.out.println(i.next());
    } catch(NoSuchElementException e) {
    	System.out.println("La liste est déja parcouru...");
    } catch(Exception e) {
    	System.out.println("Exception non reconnu...");
    }
    

    //System.out.println(list);

    // b.
    System.out.println("Vous avez saisi " + list.size() + " nombres.");



    // Collections.sort(list);
  }
}
