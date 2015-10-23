package org.unioulu.tol.sqat2015.planetExplorer;

public class Explorer {
	private int posX;
	private int posY;
	private String direction = "";
	
	public void Explorer() {
		posX = 0;
		posY = 0;
		direction = "North";
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
	
	public char getDirection(){
		
		System.out.println(direction.charAt(0));
		
		return direction.charAt(0);
	}
}
