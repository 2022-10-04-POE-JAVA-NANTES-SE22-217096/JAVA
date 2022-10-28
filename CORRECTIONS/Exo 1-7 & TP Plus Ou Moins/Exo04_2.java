import java.util.Scanner; 

public class Exo04_2 {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    String note;
    float average = 0f;
    int numberOfNote = 0;
    boolean addNewNote = true;

    do {
	    System.out.println("Saisir une note (ou 'N' pour quitter) :");
	    note = sc.nextLine();
		if (note.equals("N")) {
			addNewNote = false;
		}  else {
		    average += Float.parseFloat(note);
		    numberOfNote ++;
		}
    } while(addNewNote);

    System.out.println("La moyenne des notes est " + (average/numberOfNote));
  }
}
