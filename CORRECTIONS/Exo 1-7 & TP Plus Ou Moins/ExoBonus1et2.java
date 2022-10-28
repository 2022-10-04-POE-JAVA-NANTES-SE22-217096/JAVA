
public class ExoBonus1et2 {

	public static void main(String[] args) {

		//Exo Bonus 1 :
		//Écrire un programme permettant de faire la somme des N premiers entiers. On initialise un nombre entier N, et renvoie un autre nombre entier, la somme demandée.
		int n = 10, somme = 0;
		for(int i = 1; i <= n; i++) {
			somme += i;
		}
		System.out.println("Voici la somme des "+n+" premiers entiers : "+somme);
		
		
		//Exo Bonus 2.1 :
		//Écrire un programme qui permet de connaître le minimum et le maximum d'un tableau d'entiers.
		//int[] tab = {8, 0, 9, 1, 14, 5, 17, 2, 7};
		int[] tab = {8, 0, 9, 1, 14, 5, 17, 2, 7};
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
		

		//Exo Bonus 2.2 :
		//Écrire un programme qui permet de connaître le minimum et le maximum d'un tableau d'entiers à 2 dimensions.
		//int[][] tab = {{8, 9, 1, 14, 5, 17, 2, 99}, {25, 0, 30, 3, 6, 4, 19, 7}};
		int[][] tab2 = {{8, 9, 1, 14, 5, 17, 2, 99}, {25, 0, 30, 3, 6, 4, 19, 7}};
		min = tab2[0][0];
		max = tab2[0][0];
		for(int[] tabTmp : tab2) {
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
