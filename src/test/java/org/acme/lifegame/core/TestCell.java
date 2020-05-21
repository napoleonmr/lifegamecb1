package org.acme.lifegame.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCell {
	
	//Any live cell with fewer than two live neighbours dies, as if by underpopulation.
	@Test
	void liveCellWithOneLiveNeighboursDies() {
		Cell c = new Cell(true,1);
		c.tick();
		assertFalse(c.getStatus()); 
	}
	
	@Test
	void liveCellWithZeroLiveNeighboursDies() {
		Cell c = new Cell(true,0);
		c.tick();
		assertFalse(c.getStatus()); 
	}

}
