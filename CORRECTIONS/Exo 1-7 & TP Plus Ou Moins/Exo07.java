import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Exo07 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    String response;
    
    do {
      System.out.print("Entrez un nombre :");
      response = sc.nextLine(); 
      if (!response.equals("q")) {
        int newNumber = Integer.parseInt(response);
        if (!list.contains(newNumber)){ 
          list.add(newNumber);
        } else {
          int positionDoublon = list.indexOf(newNumber)+1;
          System.out.println("Chiffre déja ajouté à la saisie " + positionDoublon);
        }
      }
    
    } while(!response.equals("q"));

    Iterator i = list.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
    System.out.println("Vous avez saisi " + list.size() + " nombres.");
  }
}
