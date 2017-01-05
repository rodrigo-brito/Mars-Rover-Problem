package marsRovers;

import static org.junit.Assert.*;

import org.junit.Test;

import net.rodrigobrito.marsrovers.model.Direction;

public class DirectionTest {

	@Test
	public void testTurnLeft() {
		assertEquals(Direction.turnLeft(Direction.N), Direction.W);
	}
	
	@Test
	public void testTurnRight() {
		assertEquals(Direction.turnRight(Direction.N), Direction.E);
	}

}
