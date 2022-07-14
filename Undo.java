import java.util.ArrayList;

public class Undo {

	private static Undo instance;
	private static ArrayList<String> llistat = new ArrayList<String>();

	private Undo() {
	}

	public static Undo getInstance() {

		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	public static void afegeix(String comanda) {

		llistat.add(comanda);

		System.out.println("Última comanda afegida");
	}

	public static void elimina() {
		llistat.remove(llistat.size() - 1);
		System.out.println("Última comanda eliminada");
	}

	public void llistaUltim() {

		System.out.println(llistat.get(llistat.size() - 1));

	}

	public void llista() {

		for (String comanda : llistat) {

			System.out.println(comanda);

		}
	}
}