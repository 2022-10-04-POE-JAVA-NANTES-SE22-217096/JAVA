package Heritage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mainHeritage {

	public static void main(String[] args) {

	  /*HeritageAnimal loup = new AnimalLoup();
	  HeritageAnimal chien = new AnimalChien();

	  InterfaceAnimalCapacites chien = new AnimalChien();
	  InterfaceAnimalCapacites poisson = new AnimalPoisson();

	  List<InterfaceAnimalCapacites> liste = new ArrayList<InterfaceAnimalCapacites>();
	  liste.add(chien);
	  liste.add(poisson);
	  for(InterfaceAnimalCapacites animal : liste) {
		  System.out.println(animal.getClass());
		  System.out.println(animal.peutMarcher());
		  System.out.println(animal.peutVoler());
		  System.out.println(animal.peutNager());
	  }
	 */

	  AnimalLoup loup = new AnimalLoup();


	  AnimalChien chien = new AnimalChien();
	  //loup.

	  HeritageAnimal loup2 = new AnimalLoup();
	  InterfaceAnimalCapacites chien2 = new AnimalChien();
	  List<String> list = new ArrayList<>();


	  //loup = new AnimalChien();
	  loup2 = new AnimalChien();

	 List<HeritageAnimal> listAnimaux = new ArrayList<>();
	 List<AnimalLoup> listLoups = new ArrayList<>();
	 List<AnimalChien> listChiens = new ArrayList<>();

	 listAnimaux.add(loup);
	 //listAnimaux.add(loup2);
	 listAnimaux.add(chien);

	 Iterator<HeritageAnimal> it = listAnimaux.iterator();
	 while(it.hasNext()) {
		 if(it.next() instanceof AnimalLoup) {
			 System.out.println("Ceci est un loup !");
		 } else {
			 System.out.println("Ceci est un chien !");
		 }
	 }
	}

}