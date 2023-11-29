package exo3;

public class Limousine extends Voiture {
	private int longueur;
	public int getLongueur() {
		return longueur;
	}

	public Limousine(int vitesseMax, double prixDeBase, String couleur, int longueur) {
		super(vitesseMax, prixDeBase, couleur);
		this.longueur = longueur;
	}
	
	public double calculerPrixDeVente() {
		return (longueur > 6 ? 0.95 : 0.9)* super.calculerPrixDeVente();
	}
}
