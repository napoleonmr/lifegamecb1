package org.acme.lifegame.core;

public class Cell {

	private boolean status;
	private int neighbours;

	public Cell(boolean b, int i) {
		this.status = b;
		this.neighbours = i;
	}

	public void tick() {
		if ( neighbours < 2)
			status = false;
		
	}

	public boolean getStatus() {		
		return status;
	}

}
