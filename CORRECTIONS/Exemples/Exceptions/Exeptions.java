package Exceptions;
public class Exeptions {
  public static void main(java.lang.String[] args) {

    int i = 3;
    //int j = 1;
     int j = 0; // test pour error 1
    try {
      System.out.println("résultat = " + (i / j));
    } catch (Exception e) {
      System.out.println("L'erreur est: " + e);
    }
  }
}