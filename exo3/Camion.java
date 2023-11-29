package exo3;

public class Camion extends Voiture {
	private int poids;
	public Camion (int vitesseMax, double prixDeBase, String couleur, int poids) {
		super( vitesseMax, prixDeBase, couleur);
		// Auto-generated constructor stub
		this.poids = poids ;
	}
	public double  calculerPrixDeVente () {
		if (poids < 2000) {
			return 0.8 * super.calculerPrixDeVente();
		}else {
			return 0.9 * super.calculerPrixDeVente();
		}
	}
}
