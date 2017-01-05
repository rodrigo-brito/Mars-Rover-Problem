package net.rodrigobrito.marsrovers.model;

public class Coordinates {
	private static int MAX_X;
	private static int MAX_Y;
	private int x;
	private int y;
	
	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x <= MAX_X && x >= 0){
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y <= MAX_Y && y >= 0){
			this.y = y;
		}
	}
	
	public static void setMaxBounds(int x, int y){
		MAX_X = x;
		MAX_Y = y;
	}
	
	@Override
	public String toString(){
		return this.getX() + " " + this.getY();
	}
}
