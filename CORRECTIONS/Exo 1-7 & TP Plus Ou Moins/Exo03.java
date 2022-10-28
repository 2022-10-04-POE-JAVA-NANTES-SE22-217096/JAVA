import java.util.Scanner; 

public class Exo03 {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    String firstName, name; 
    
    System.out.println("Quel est votre nom :");
    name = sc.nextLine();
    
    System.out.println("Quel est votre prenom :");
    firstName = sc.nextLine();
    
    System.out.println("Quel est votre age :");
    String temp = sc.nextLine();
    int age = Integer.parseInt(temp);
    
    System.out.println("Bonjour " + firstName + " " + name + ", vous avez " + age + " ans.");
    
    sc.close();
  }
}
