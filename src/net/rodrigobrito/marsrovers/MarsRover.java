package net.rodrigobrito.marsrovers;
import net.rodrigobrito.marsrovers.model.Coordinates;
import net.rodrigobrito.marsrovers.model.Direction;
import net.rodrigobrito.marsrovers.model.Rover;

public class MarsRover {

	/**
	 * Método principal - Executa as movimentações do Rover
	 */
	public static void main(String[] args) {
		
		//Define as cordenadas máximas
		Coordinates.setMaxBounds(5,5);
		
		//Entrada Teste 1
		Coordinates initialCodinate = new Coordinates(1,2);
		Rover rover = new Rover(initialCodinate, Direction.N);
		String commands = "LMLMLMLMM";
		rover.execute(commands);
		System.out.println(rover);
		
		//Entrada Teste 2
		initialCodinate = new Coordinates(3,3);
		rover = new Rover(initialCodinate, Direction.E);
		commands = "MMRMMRMRRM";
		rover.execute(commands);
		System.out.println(rover);
	}

}
