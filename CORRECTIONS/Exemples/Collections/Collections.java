package Collections;

import java.util.HashMap;
import java.util.Map.Entry;


public class Collections {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Test", 59);
		map.put("Toto", 45);
		map.put("tata", 22);

		System.out.println(map.size());
		System.out.println(map.get("Test"));

		/*Iterator it = map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/

		System.out.println(map);

        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Clé: " + key + ", Valeur: " + value);
        }

	}

}
