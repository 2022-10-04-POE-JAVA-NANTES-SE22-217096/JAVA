package Heritage;

public class TestMaClasse {

	public static void main(String[] args) {
		MaClasse one = new MaClasse("Test", 5);
		MaClasse two = new MaClasse("Test", 5);

		System.out.println(one.equals(two));
		System.out.println(one);

		System.out.println(two);
	}

}
