package exo1;

class Point {
	public void initialise (int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	public void deplacee(int dx, int dy) {
		x += dx ;
		y += dy ;
	}
	public int getX() {
		return x ;
	}
	public int getY() {
		return y ;
	}
	private int x, y ;
	}
