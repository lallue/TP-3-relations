package exo4;

public class TestMetier {
	public static void main(String[] argv) {
		Personne[] personnes = new Personne[3];
		personnes[0] = new IngenieurReseaux("Paul");
		personnes[1] = new IngenieurLogiciel("Philippe");
		personnes[2] = new IngenieurReseaux("Pierre");
			for (int i = 0; i < personnes.length; i++)
			personnes[i].afficher();
}
}
