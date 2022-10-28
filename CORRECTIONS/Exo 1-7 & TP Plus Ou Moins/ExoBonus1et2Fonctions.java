


public class ExoBonus1et2Fonctions {

	public static void main(String[] args) {

		//Exo Bonus 1 :
		//Écrire un programme permettant de faire la somme des N premiers entiers. On initialise un nombre entier N, et renvoie un autre nombre entier, la somme demandée.
		exo1(10);
		exo1(99);
		exo1(5);
		
		//Exo Bonus 2.1 :
		//Écrire un programme qui permet de connaître le minimum et le maximum d'un tableau d'entiers.
		//int[] tab = {8, 0, 9, 1, 14, 5, 17, 2, 7};
		int[] tab = {8, 0, 9, 1, 14, 5, 17, 2, 7};
		exo2_1(tab);
		

		//Exo Bonus 2.2 :
		//Écrire un programme qui permet de connaître le minimum et le maximum d'un tableau d'entiers à 2 dimensions.
		//int[][] tab = {{8, 9, 1, 14, 5, 17, 2, 99}, {25, 0, 30, 3, 6, 4, 19, 7}};
		int[][] tab2 = {{8, 9, 1, 14, 5, 17, 2, 99}, {25, 0, 30, 3, 6, 4, 19, 7}};
		exo2_2(tab2);
		

	}
	
	public static void exo1(int n) {
		int somme = 0;
		
		for(int i = 1; i <= n; i++) {
			somme += i;
		}
		
		System.out.println("Voici la somme des "+n+" premiers entiers : "+somme);
	}
	
	public static void exo1(double n) {
		int somme = 0;
		
		for(int i = 1; i <= n; i++) {
			somme += i;
		}
		
		System.out.println("Voici la somme des "+n+" premiers entiers : "+somme);
	}

	public static void exo2_1(int[] tab) {
		int min = 0, max = 0;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
			if(tab[i] < min) {
				min = tab[i];
			}
		}
		System.out.println("La valeur minimum est "+min+" et la valeur max "+max);
	}
	
	public static void exo2_2(int[][] tab) {
		int min = tab[0][0], max = tab[0][0];
		for(int[] tabTmp : tab) {
			for(int element : tabTmp) {
				if(element > max) {
					max = element;
				}
				if(element < min) {
					min = element;
				}
			}
		}
		System.out.println("La valeur minimum est "+min+" et la valeur max "+max);
	}
	
	
	
}
