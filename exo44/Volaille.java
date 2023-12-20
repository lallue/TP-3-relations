package exo44;

public class Volaille {
	private double poids;
	private double prixparKilos; 
	private String numeroidentification;
	
	public Volaille(double poid, double prixParKilos, String numeroIdentification) {
		super();
		poids = poid;
		prixparKilos = prixParKilos;
		numeroidentification = numeroIdentification;
	}
	public double CalcuPrix() {
		return poids * prixparKilos;		
	}
	public void PrixDuJour(double PrixJour) {
		this.prixparKilos = PrixJour;
	}
	public void PoidAbattage(double poidabattage) {
		this.poids = poidabattage ;
	}
}
