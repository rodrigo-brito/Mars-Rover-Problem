package net.rodrigobrito.marsrovers;
import net.rodrigobrito.marsrovers.model.Coordinate;
import net.rodrigobrito.marsrovers.model.Direction;
import net.rodrigobrito.marsrovers.model.Rover;

public class MarsRover {

	/**
	 * Método principal - Executa as movimentações do Rover
	 */
	public static void main(String[] args) {
		
		//Define as cordenadas máximas
		Coordinate.setMaxBounds(5,5);
		
		//Entrada 1
		Coordinate initialCoordinate = new Coordinate(1,2);
		Rover rover = new Rover(initialCoordinate, Direction.N);
		String commands = "LMLMLMLMM";
		rover.execute(commands);
		System.out.println(rover);
		
		//Entrada 2
		initialCoordinate = new Coordinate(3,3);
		rover = new Rover(initialCoordinate, Direction.E);
		commands = "MMRMMRMRRM";
		rover.execute(commands);
		System.out.println(rover);
	}

}
