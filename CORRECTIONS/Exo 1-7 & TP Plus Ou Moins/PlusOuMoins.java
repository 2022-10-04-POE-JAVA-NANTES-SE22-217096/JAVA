import java.util.Scanner;

public class PlusOuMoins {
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	boolean readyToReplay = true;
    	int min = 0, max = 0, randomNum, choiceNum ;
    	
    	System.out.println("===========================");
    	System.out.println("===Jeu du Plus ou Moins===");
    	System.out.println("===========================\n");
    	
    	while(readyToReplay) {
    		
    		//Demander à l'utilisateur l'intervalle
    		while(min >= max) {
        		System.out.println("Quelle est l'intervalle minimum ?");
    			min = sc.nextInt();
        		System.out.println("Quelle est l'intervalle maximum ?");
    			max = sc.nextInt();
    			if(min >= max) {
    				System.out.println("Erreur min >= max, veuillez redéfinir l'intervalle.");
    			}
    		}
    		randomNum = min + (int)(Math.random() * ((max - min) + 1));
    		
    		//Let's go to play
    		choiceNum = min - 1;
    		while(randomNum != choiceNum) {
    			System.out.println("Quelle est le numéro compris entre " + min + " et " + max + " ?");
    			choiceNum = sc.nextInt();
    			
    			if(choiceNum < randomNum) {
    				System.out.println("C'est plus...\n");
    			} else if(choiceNum > randomNum) {
    				System.out.println("C'est moins...\n");
    			} else {
    				System.out.println("Félicitations vous avez trouvé !\n");
    			}
    		}
    		
    		
			//Demander à l'utilisateur si il veut rejouer
			System.out.println("Voulez vous rejouez ? (y/n)");
			String replay = sc.next();
			if(!replay.equals("y") && !replay.equals("Y")) {
				readyToReplay = false;
			}
			min = 0;
			max = 0;

    	}
    	System.out.println("===FIN DU JEU===");
    	sc.close();
    }
}
