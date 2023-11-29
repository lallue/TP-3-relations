package exo4;

public class IngenieurReseaux extends Personne {
	
	public IngenieurReseaux (String nom) {
		super(nom);
	}
	public void afficher() {
		super.afficher();
		System.out.println( " et je suis inginieur Reseaux.");
	}

}
