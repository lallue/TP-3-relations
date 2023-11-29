package exo1;

public class PointA extends Point {
	public PointA (int x, int y ) {
		super.initialise(x,y);
	}
	public void afficher () {
	System.out.println( "x : " + getX() + " y : " + getY() );
}
}
