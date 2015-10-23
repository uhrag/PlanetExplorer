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
	planet = new Planet(10,10);
		
	}
	
	@Test
	public void testPlanetSize() {
		assertEquals((100),planet.getHeight());
		assertEquals((100),planet.getWidth());
	}
}
