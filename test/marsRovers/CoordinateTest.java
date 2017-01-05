package marsRovers;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import net.rodrigobrito.marsrovers.model.Coordinate;

public class CoordinateTest {
	
	private Coordinate coordinate;
	
	@Before
	public void before(){
		coordinate = new Coordinate(0, 10);
	}
	
	@Test
	public void testMaxBounds() {
		Coordinate.setMaxBounds(0, 10);
		coordinate.setX(-1);
		coordinate.setY(11);
		assertEquals(coordinate.getX(), 0);
		assertEquals(coordinate.getY(), 10);
	}
	
	@Test
	public void testOutput(){
		assertEquals(coordinate.toString(), "0 10");
	}
}
