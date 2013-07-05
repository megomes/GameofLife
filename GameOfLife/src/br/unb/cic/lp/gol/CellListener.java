package br.unb.cic.lp.gol;

import java.util.EventListener;

import br.unb.cic.lp.states.*;

public interface CellListener extends EventListener{
	void cellChanged(CellEvent e, CellState currentState, CellState oldState);
}
