package ex42pokemon;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, int pv, int atk) {
		super(nom, atk, atk);
	}

	public void attaquer(PokemonFeu autrePokemon) {
		autrePokemon.infligerDegats(getAtk() / 2);
	}

	public void attaquer(PokemonEau autrePokemon) {
		autrePokemon.infligerDegats(getAtk() * 2);
	}

}
