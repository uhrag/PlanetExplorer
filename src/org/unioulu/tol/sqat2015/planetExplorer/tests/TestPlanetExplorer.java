package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Explorer;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	Planet planet;
	Explorer explorer;
	PlanetExplorer planetexplorer;
	
	
	@Before
	public void setup(){
	planet = new Planet(100,100);
	explorer = new Explorer();
	planetexplorer = new PlanetExplorer(0, 0, null);
	}
	
	@Test
	public void testPlanetSize() {
		assertEquals((100),planet.getHeight());
		assertEquals((100),planet.getWidth());
	}
	
	@Test
	public void testExplorerHasLandedAtStart() {
		assertEquals(0,explorer.getPosY());
		assertEquals(0,explorer.getPosX());
	}
	
	@Test
	public void testExplorerDirectionAtStart() {
		assertEquals('N',explorer.getDirection());
	}
	
	@Test
	public void testExplorerTurningLeft() {
		explorer.turnLeft();
		assertEquals('W',explorer.getDirection());
	}

	@Test
	public void testExplorerTurningRight() {
		explorer.turnRight();
		assertEquals('E',explorer.getDirection());
}

	@Test
	public void testExplorerTurningCircle() {
		//planetexplorer.executeCommand("rrr");
		explorer.turnRight();
		explorer.turnRight();
		explorer.turnRight();
		explorer.turnRight();
		assertEquals('N',explorer.getDirection());
}

/*	@Test
	public void testHasObstacle(){
		assertEquals("(100,100)",explorer.getDirection());
	}
	*/
	
/*	@Test
	
	public void testExplorerMovesForward() {
		
	}
	*/
	
/*	@Test
	
	public void testExplorerMovesBackward() {
		
	}
	*/
	
	
}
