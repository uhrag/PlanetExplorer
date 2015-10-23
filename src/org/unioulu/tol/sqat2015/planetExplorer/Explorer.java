package org.unioulu.tol.sqat2015.planetExplorer;

public class Explorer {
	private int posX;
	private int posY;
	private String direction;
	
	public void Explorer(int x, int y, String direction) {
		
	}
	
	public void Landing(){
		posX = 0;
		posY = 0;
		direction = "North";
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public String getDirection(){
		return direction;
	}
}
