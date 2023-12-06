package ex42pokemon;

public class Pokemon {
	private String nom;
	private int pv;
	private int atk;
	public Pokemon (String nom, int pv, int atk){
		this.nom = nom;
		this.pv= pv;
		this.atk = atk;
	}
	public boolean estKo() {
		return pv==0;
	}
	private void prendreDegats (int deg) {
		this.pv -= deg;
		if(pv<0)
		    pv =0;
	}
	public void attaquer(Pokemon p) {
		p.prendreDegats(atk);
	}
}
