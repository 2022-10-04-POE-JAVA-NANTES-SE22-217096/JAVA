package Tests;

public class Exo05 {
    public static void main(String args[]) {
      System.out.print(whatsNumber(7));
    }
    
    public static String whatsNumber(int number) {
    	
    	String result = "";
    	
    	if (number == 0) {
    		result += "Le nombre est zéro (et il est pair)";
          } else {
            // S'il n'est pas nul, voyons quel est son signe
            if (number < 0) {
              //Note: System.out.print ne commence pas de nouvelle ligne
            	result += "Le nombre est négatif ";
            } else {
            	result += "Le nombre est positif ";
            }

            // Teste la parit�: si le reste de la division par deux est z�ro
            // alors le nombre est pair
            int reste = number % 2;
            if (reste == 0) {
            	result += "et pair";
            } else {
            	result += "et impair";
            }
          }
    	return result;
    }
}