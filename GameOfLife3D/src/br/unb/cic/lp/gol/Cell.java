package br.unb.cic.lp.gol;

import java.util.ArrayList;
import java.util.Collection;

import br.unb.cic.lp.states.*;
/**
 * Essa classe representa uma c�lula. Criada apenas para contrar seu atual estado 
 * e o controle dos seus EventListeners
 *
 */
public class Cell {
	private Collection<CellListener> cellListeners = new ArrayList<CellListener>();
	private CellState actualState;

	/**
	 * Construtor. Inicia a c�lula como morta.
	 */
	public Cell(){
		actualState = new CellState_Dead();
	}
	/**
	 * Retorna Estado atual da c�lula.
	 */
	public CellState getState() {
		return actualState;
	}
	
	/**
	 * Seta Estado atual da c�lula.
	 * Executa um evento em todos os seus Listeners
	 */
	public void setState(CellState state) {
		if(state.getCellStateName() != actualState.getCellStateName()){
			CellState oldState = actualState;
			actualState = state;
			
			CellEvent evento = new CellEvent(this);
			for (CellListener listener : cellListeners){
				listener.cellChanged(evento, actualState, oldState);
			}
		}
	}
	
	/* M�todos de CellListener */
	public void addCellListener(CellListener c){
		cellListeners.add(c);
	}
	
	public void removeCellListener(CellListener c){
		cellListeners.remove(c);
	}
}
