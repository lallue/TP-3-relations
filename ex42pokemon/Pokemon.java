package ex42pokemon;

public class Pokemon {
	private String nom;
	private int pv;
	private int atk;

	public Pokemon(String nom ,int pv, int atk) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.atk = atk;
	}

	public String getNom() {
		return nom;
	}

	public int getPv() {
		return pv;
	}

	public int getAtk() {
		return atk;
	}

	public boolean estKO() {
		return pv <= 0;
	}

	protected void infligerDegats(int degats) {
		pv -= degats;
		if (pv < 0)
			pv = 0;
	}

	@Override
	public String toString() {
		return "[Pokémon (" + nom + "), atk : " + atk + ", pv : " + pv + "]";
	}

}
