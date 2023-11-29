package exo4;

public class Personne {
	private String nom;
	public Personne (String nom) {
		this.nom = nom;
	}
	public void afficher() {
		System.out.println( "Je m'appelle " + nom);
	}

}
