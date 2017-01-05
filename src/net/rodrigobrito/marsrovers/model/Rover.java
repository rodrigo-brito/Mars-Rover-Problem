package net.rodrigobrito.marsrovers.model;

public class Rover {
	private Direction direction;
	private Coordinate coordinate;
	
	public Rover(Coordinate coordinates, Direction direction){
		this.coordinate = coordinates;
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Coordinate getCoordinates() {
		return coordinate;
	}
	
	public void setCoordinates(Coordinate coordinates) {
		this.coordinate = coordinates;
	}
	
	/**
	 * Rotaciona 90 graus para direita o Rover
	 */
	public void turnRight(){
		this.direction = Direction.turnRight(this.direction);
	}
	
	/**
	 * Rotaciona 90 graus para esquerda o Rover
	 */
	public void turnLeft(){
		this.direction = Direction.turnLeft(this.direction);
	}
	
	/**
	 * Executa movimentação do Rover de acordo com a sua direção
	 */
	public void move(){
		switch( this.direction ){
			case N:
				coordinate.setY( coordinate.getY() + 1 );
				break;
			case S:
				coordinate.setY( coordinate.getY() - 1 );
				break;
			case E:
				coordinate.setX( coordinate.getX() + 1 );
				break;
			case W:
				coordinate.setX( coordinate.getX() - 1 );
		}
	}
	
	/**
	 * Executa sequência de comandos de movimentação fornecidos
	 * @param commands Lista de comandos
	 */
	public void execute(String commands) {
		for(char move : commands.toCharArray()){
			switch(move){
				case 'M':
					this.move();
					break;
				case 'L':
					this.turnLeft();
					break;
				case 'R':
					this.turnRight();
			}
		}
	}
	
	@Override
	public String toString(){
		return this.coordinate + " " + this.direction;
	}
}
