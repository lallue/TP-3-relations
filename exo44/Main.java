package exo44;

public class Main {

	public static void main(String[] args) {
		Poulets poulet = new Poulets (5, 7, "44");
		Canard canard = new Canard (10, 7 , "45");
		
		poulet.PrixDuJour(5);
		canard.PrixDuJour(10);
		
		poulet.PoidAbattage(3);
		canard.PoidAbattage(6);
		
		System.out.println("le prix du canard est de : " + poulet.CalcuPrix() + "€");		
		System.out.println("le prix du canard est de : " + canard.CalcuPrix() + "€");
	}

}
