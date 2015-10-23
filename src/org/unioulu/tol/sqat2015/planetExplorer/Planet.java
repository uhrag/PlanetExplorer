package org.unioulu.tol.sqat2015.planetExplorer;

public class Planet  {

	private int width;
	private int height;
	private boolean[][] size;
	
	public Planet( int x, int y) {
		width = x;
		height = y;
		size = new boolean[x][y];
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public boolean size(int x, int y) {
		return size[x][y];
	}

}
