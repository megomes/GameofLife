package br.unb.cic.lp.states;
/**
 * Implementa��o da uma c�lula gen�rica. Em que o usu�rio pode criar a qualquer momento
 * uma nova c�lula. Seguindo o padr�o estabelecido.
 *
 */
public class CellState_Generic extends CellState_Alive{
	public CellState_Generic(String CellSimbol, String CellStateName, String CellImageName, String Cell3DImageName, String CellStateColorName){
		this.CellText = "|  " + CellSimbol + "  |";
		this.CellStateName = CellStateName;
		this.CellImageName = CellImageName;
		this.Cell3DImageName = Cell3DImageName;
		this.CellStateColorName = CellStateColorName;
	}
	public String getName(){
		return CellStateName + " " + CellText ;
	}
}
