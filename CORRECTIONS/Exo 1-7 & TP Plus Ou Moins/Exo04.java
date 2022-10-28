import java.util.Scanner; 

public class Exo04 {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    String note;
    float average = 0f;
    int numberOfNote = 0;
    boolean addNewNote = true;

    do {
	    System.out.println("Saisir une note :");
	    note = sc.nextLine();
	    average += Float.parseFloat(note);
	    numberOfNote ++;
    	
		System.out.println("Voulez-vous ajouter une autre note (O/N):");
		String response = sc.nextLine();
		if (response.equals("N")) {
			addNewNote = false;
		}
    } while(addNewNote);

    System.out.println("La moyenne des notes est " + (average/numberOfNote));
  }
}
