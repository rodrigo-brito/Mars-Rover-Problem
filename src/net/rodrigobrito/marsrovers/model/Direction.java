package net.rodrigobrito.marsrovers.model;

public enum Direction {
	
	//North, South, East, West
	N , S , E, W;
	
	/**
	 * Analisa qual a direção resultante do Rover ao virar para a esquerda
	 * @param direction Direção de origem
	 * @return Direção de destino
	 */
	public static Direction turnLeft (Direction direction) {
		switch(direction) {
			case N:
				return W;
			case S:
				return E;
			case E:
				return N;
			case W:
				return S;
			default:
				return direction;
		}
	}
	
	/**
	 * Analisa qual a direção resultante do Rover ao virar para a direita
	 * @param direction Direção de origem
	 * @return Direção de destino
	 */
	public static Direction turnRight (Direction direction) {
		switch(direction) {
			case N:
				return E;
			case S:
				return W;
			case E:
				return S;
			case W:
				return N;
			default:
				return direction;
		}
	}
}
