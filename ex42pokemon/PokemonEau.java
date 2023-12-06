package ex42pokemon;

public class PokemonEau extends Pokemon {

	public PokemonEau(String nom, int pv, int atk) {
		super(nom, atk, atk);
		// TODO Auto-generated constructor stub
	}


	public void attaquer(PokemonPlante autrePokemon){
		autrePokemon.infligerDegats(getAtk() / 2);
	}


	public void attaquer(PokemonEau autrePokemon){
		autrePokemon.infligerDegats(getAtk() * 2);
	}
}
