package br.unb.cic.lp.states;
/**
 * Implementa��o da uma c�lula morta.
 *
 */
public class CellState_Dead extends CellState{
	public CellState_Dead(){
		CellText = "|     |";
		CellStateName = "dead";
		CellImageName = "cell_dead.png";
		Cell3DImageName = null;
	}
	public String getName(){
		return "Dead Cell";
	}
}
