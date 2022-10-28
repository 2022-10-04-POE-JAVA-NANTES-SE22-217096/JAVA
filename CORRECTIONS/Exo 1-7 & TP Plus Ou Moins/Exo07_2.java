import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Exo07_2 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> mapNotes = new HashMap<String, Integer>();
    
    while (true) {
	  System.out.print("Entrez le nom de l'eleve : ");
	  String responseE = sc.nextLine(); 
	  
	  if (responseE.equals("q")) {
	      break;
	  }
	  
	  System.out.print("Entrez la note de "+ responseE +" : ");
	  String responseN = sc.nextLine(); 
	  
	  if (responseN.equals("q")) {
	      break;
	  }

	  if (!mapNotes.containsKey(responseE)){ 
		  mapNotes.put(responseE, Integer.parseInt(responseN));
	  } else {
		  System.out.println("Eleve déja ajouté à la saisie !" + responseE);
	  }
  
    }
    
    System.out.println("------------------------------------------");
    for (Entry<String, Integer> entry : mapNotes.entrySet()) {
        String key = entry.getKey();
        int value = entry.getValue();
        System.out.println("Elève: " + key + ", Valeur: " + value);
    }
    System.out.println("Vous avez saisi " +mapNotes.size()+ " notes.");
    
    sc.close();

  }
}
