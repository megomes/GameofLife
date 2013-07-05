package br.unb.cic.lp.rules;

import java.util.HashMap;

import br.unb.cic.lp.states.*;
/**
 * Essa classe representa a regra padr�o do Game of Life
 * Se a c�lula estiver viva e 2/3 celulas vizinhas estiverem vivas, ela permanecer� viva.
 * Se ela estiver morta e 3 vizinhas estiverem vivas, ela renascer�.
 * 
 * @author Matheus Ervilha
 *
 */
public class GameRule_Standard extends GameRule{
	/*
	 * Esses dois m�todos retornar�o o estado em que a c�lula dever� ficar, dependendo se suas vizinhas
	 * 
	 *  @param dictState HashMap contendo <CellState, Integer> Um contador de estado das suas c�lulas vizinhas.
	 *  Sendo CellState o Estado e Integer o valor correspondente na contagem
	 * 
	 */
	protected CellState shouldKeepAlive(HashMap<CellState, Integer> dictState){
		for(CellState cell : dictState.keySet()){
			if (cell.getCellStateName() == "alive_a"){
				if (dictState.get(cell) == 2 || dictState.get(cell) == 3){
					return new CellState_Alive();
				}
				break;
			}
		}
		return new CellState_Dead();
	}
	protected CellState shouldRevive(HashMap<CellState, Integer> dictState){
		for(CellState cell : dictState.keySet()){
			if (cell.getCellStateName() == "alive_a"){
				if (dictState.get(cell) == 3){
					return new CellState_Alive();
				}
				break;
			}
		}
		return new CellState_Dead();
	}
	/*
	 * Retorna um HashMap contendo o ID da op��o e a op��o de VIDA existente na Regra.
	 * Como a regra Padr�o apenas contem um modo de VIDA, retornamos NULL 
	 */
	public HashMap<Integer, CellState> getOptions(){
		return null;
	}

}
