package ex42pokemon;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom, int pv, int atk) {
		super(nom, atk, atk);
	}
	
	public void attaquer(PokemonPlante autrePokemon){
		autrePokemon.infligerDegats((int) (getAtk() * 2));
	}

	public void attaquer(PokemonEau autrePokemon){
		autrePokemon.infligerDegats((int) (getAtk() / 2));
	}
}
