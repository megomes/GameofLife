package br.unb.cic.lp.gol;

import br.unb.cic.lp.rules.*;

/**
 * Classe Game implementa o Padr�o Fa�ade, tornando a cria��o
 * de um Game mais f�cil de ser utilizada.
 * 
 * @author Matheus Ervilha
 * 
 */
public class Game {
	private GameController controller;
	
	/**
	 * Construtor do Game
	 * @param height Altura do tabuleiro
	 * @param width Largura do tabuleiro
	 */
	public Game(int height, int width){
		controller = new GameController();
		
		//GameRule gameRule = new GameRule_Standard(); //Jogo com as regras Padr�es
		//GameRule gameRule = new GameRule_HighLife(); //Jogo com as regras do HighLife
		GameRule gameRule = new GameRule_ImigrationGame();
		
		GameEngine engine = new GameEngine(height, width, gameRule);	
		
		GameView board = new GameView(controller, engine, gameRule);
		
		controller.setBoard(board);
		controller.setEngine(engine);
	}
	
	/* Inicia todo o processo do jogo */
	public void start(){
		controller.start();
	}

}
