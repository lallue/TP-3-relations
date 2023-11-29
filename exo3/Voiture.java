package exo3;

public class Voiture {
	private int vitesseMax;
	private double prixDeBase;
	private String couleur;
	
	public int getVitesseMax() {
		return vitesseMax;
	}

	public double getPrixDeBase() {
		return prixDeBase;
	}

	public String getCouleur() {
		return couleur;
	}

	public Voiture(int vitesseMax, double prixDeBase, String couleur) {
		this.vitesseMax = vitesseMax;
		this.prixDeBase = prixDeBase;
		this.couleur = couleur;
	}

	public double calculerPrixDeVente() {
		return prixDeBase;
	}
	
}
