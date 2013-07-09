package br.unb.cic.lp.savedStates;

import br.unb.cic.lp.states.*;
/**
 * Memento. Salva o estado de uma c�lula
 *
 */
public class Memento {
	private CellState cellState;
	
	public Memento (CellState cellState){
		this.cellState = cellState;
	}
	
	public CellState getSavedState(){
		return cellState;
	}
}
