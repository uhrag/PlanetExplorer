package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Explorer;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;

public class TestPlanetExplorer {

	Planet planet;
	Explorer explorer;
	
	
	@Before
	public void setup(){
	planet = new Planet(100,100);
	explorer = new Explorer(0,0,N);
		
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
		assertEquals("N",explorer.getDirection());
	}
	
	
}
