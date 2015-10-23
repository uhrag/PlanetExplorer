package org.unioulu.tol.sqat2015.planetExplorer;

public class Explorer {
	private int posX;
	private int posY;
	private char direction = 'N';
	
	public void Explorer() {
		posX = 0;
		posY = 0;
		direction = 'N';
	}
	
	public void Landing(){
		posX = 0;
		posY = 0;
		direction = 'N';
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public char getDirection(){
		return direction;
	}
	
	public void turnLeft() {
		//if N->W->S->E-N
	if (direction == 'N')
		direction = 'W';
	else if (direction == 'W')
		direction = 'S';
	else if (direction == 'S')
		direction = 'E';
	else if (direction == 'E')
		direction = 'N';
	}
	
	public void turnRight() {
		if (direction == 'N')
			direction = 'E';
		else if (direction == 'E')
			direction = 'S';
		else if (direction == 'S')
			direction = 'W';
		else if (direction == 'W')
			direction = 'N';
	}
	
	
	
}
