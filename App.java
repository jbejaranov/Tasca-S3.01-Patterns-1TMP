public class App {

	public static void main(String[] args) {

		Undo undo = Undo.getInstance();

		Undo.afegeix("comanda1");
		Undo.afegeix("comanda2");
		Undo.afegeix("comanda3");
		Undo.afegeix("comanda4");
		Undo.afegeix("comanda5");
		Undo.afegeix("comanda6");

		Undo.elimina();
		Undo.elimina();

		undo.llistaUltim(); // llistem última comanda introduïda
		undo.llista(); // llistem totes les comandes introduïdes
	}
}
