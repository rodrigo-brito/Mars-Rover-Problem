package marsRovers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.rodrigobrito.marsrovers.model.Coordinate;
import net.rodrigobrito.marsrovers.model.Direction;
import net.rodrigobrito.marsrovers.model.Rover;

public class MarsRoversTest {
	
	private Coordinate initialCoordinate;
	private Rover rover;	
	
	@Before
	public void before(){
		Coordinate.setMaxBounds(5,5);
		initialCoordinate = new Coordinate(1,2);
		rover = new Rover(initialCoordinate, Direction.N);
	}

	@Test
	public void testMove(){
		
		rover.move();
		assertEquals(rover.getCoordinates().getY(), 3);
		rover.move();
		assertEquals(rover.getCoordinates().getY(), 4);
		rover.move();
		assertEquals(rover.getCoordinates().getY(), 5);
		rover.move();
		assertEquals(rover.getCoordinates().getY(), 5);
	}

	@Test
	public void testCommand() {
		String commands = "LMLMLMLMM";
		rover.execute(commands);
		assertEquals(rover.toString(), "1 3 N");
	}

}
